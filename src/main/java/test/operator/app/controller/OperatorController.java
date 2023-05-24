package test.operator.app.controller;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.operator.app.model.Conversation;
import test.operator.app.model.Operator;
import test.operator.app.service.ConversationService;
import test.operator.app.service.OperatorService;
import test.operator.app.util.Storage;

@Controller
@RequestMapping("/operators")
public class OperatorController {
    private static final Logger logger = LogManager.getLogger(OperatorController.class);
    private static final int MAX_SIZE_CONVERSATION_BY_USER = 4;
    private final OperatorService operatorService;
    private final ConversationService conversationService;
    private final AtomicReference<Conversation> conversation;

    public OperatorController(OperatorService operatorService,
                              ConversationService conversationService) {
        this.operatorService = operatorService;
        this.conversationService = conversationService;
        this.conversation = new AtomicReference<>(null);
    }

    @GetMapping("/add")
    public String addOperator() {
        return "operators/add";
    }

    @GetMapping("/conversation")
    public String askConversation() {
        if (Storage.queue.isEmpty()) {
            return "operators/empty-storage";
        }
        conversation.set(Storage.queue.poll());
        conversation.get().setStatus(Conversation.Status.PENDING);
        return "operators/conversation";
    }

    @GetMapping("/conversation/return")
    public String returnConversation() {
        logger.info(conversation + "- return");
        Storage.queue.add(conversation.get());
        return "operators/return";
    }

    @PostMapping("/add")
    public String getOperator(String name, String submit) {
        if (submit != null) {
            Operator operator = new Operator();
            operator.setUsername(name);
            operatorService.save(operator);
        }
        return "operators/add";
    }

    @PostMapping("/conversation")
    public String processConversation(String number, String submit, String cancel) {
        if (conversationService.getAllByOperator(operatorService.get(
                Integer.parseInt(number))).size() < MAX_SIZE_CONVERSATION_BY_USER) {
            if (submit != null) {
                conversation.get().setOperator(operatorService.get(Integer.parseInt(number)));
                conversation.get().setStatus(Conversation.Status.PROCESSING);
                Conversation save = conversationService.save(conversation.get());
                logger.info(save + "- saved");
                return "index";
            }
            if (cancel != null) {
                logger.info(conversation + "- return");
                Storage.queue.add(conversation.get());
                return "operators/cancel";
            }
        }
        logger.info(conversation + "- return");
        Storage.queue.add(conversation.get());
        return "operators/enough";
    }
}

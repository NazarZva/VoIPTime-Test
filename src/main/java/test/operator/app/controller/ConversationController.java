package test.operator.app.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import test.operator.app.model.Conversation;
import test.operator.app.model.Operator;
import test.operator.app.service.ConversationService;
import test.operator.app.service.OperatorService;

@Controller
@RequestMapping("/conversations")
@AllArgsConstructor
public class ConversationController {
    private final ConversationService conversationService;
    private final OperatorService operatorService;

    @GetMapping("/by-operator")
    public String getOperator() {
        return "conversations/operator";
    }

    @PostMapping("/by-operator")
    public String getByOperator(String operatorId, Model model) {
        Operator operator = operatorService.get(Integer.parseInt(operatorId));
        List<Conversation> conversations = conversationService.getAllByOperator(operator);
        model.addAttribute("conversations", conversations);
        return "conversations/by-operator";
    }
}

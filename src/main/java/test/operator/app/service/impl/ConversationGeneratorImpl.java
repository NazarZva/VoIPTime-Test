package test.operator.app.service.impl;

import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import test.operator.app.model.Conversation;
import test.operator.app.service.ConversationGenerator;
import test.operator.app.util.Storage;

@Component
public class ConversationGeneratorImpl implements ConversationGenerator {
    private static final Logger logger = LogManager.getLogger(ConversationGeneratorImpl.class);

    @Override
    public void createConversation() {
        Conversation conversation = new Conversation();
        conversation.setCreatedDate(new Date());
        conversation.setStatus(Conversation.Status.NEW);
        logger.info(conversation + "- created");
        Storage.queue.add(conversation);
    }
}

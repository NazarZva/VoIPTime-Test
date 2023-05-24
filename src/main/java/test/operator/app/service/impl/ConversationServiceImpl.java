package test.operator.app.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.operator.app.model.Conversation;
import test.operator.app.model.Operator;
import test.operator.app.repository.ConversationRepository;
import test.operator.app.service.ConversationService;

@Service
@AllArgsConstructor
public class ConversationServiceImpl implements ConversationService {
    private final ConversationRepository conversationRepository;

    @Override
    public Conversation save(Conversation conversation) {
        return conversationRepository.save(conversation);
    }

    @Override
    public Conversation get(Integer id) {
        return conversationRepository.getById(id);
    }

    @Override
    public void delete(Integer id) {
        conversationRepository.deleteById(id);
    }

    @Override
    public List<Conversation> getAllByOperator(Operator operator) {
        return conversationRepository.getAllByOperator(operator);
    }
}

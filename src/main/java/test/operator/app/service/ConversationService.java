package test.operator.app.service;

import java.util.List;
import test.operator.app.model.Conversation;
import test.operator.app.model.Operator;

public interface ConversationService {
    Conversation save(Conversation conversation);

    Conversation get(Integer id);

    void delete(Integer id);

    List<Conversation> getAllByOperator(Operator operator);
}

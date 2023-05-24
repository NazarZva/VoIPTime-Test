package test.operator.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.operator.app.model.Conversation;
import test.operator.app.model.Operator;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Integer> {
    List<Conversation> getAllByOperator(Operator operator);
}

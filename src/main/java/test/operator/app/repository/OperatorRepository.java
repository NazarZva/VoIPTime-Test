package test.operator.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.operator.app.model.Operator;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Integer> {
}

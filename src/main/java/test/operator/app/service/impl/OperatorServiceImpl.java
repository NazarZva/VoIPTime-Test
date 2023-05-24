package test.operator.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.operator.app.model.Operator;
import test.operator.app.repository.OperatorRepository;
import test.operator.app.service.OperatorService;

@Service
@AllArgsConstructor
public class OperatorServiceImpl implements OperatorService {
    private final OperatorRepository operatorRepository;

    @Override
    public Operator save(Operator operator) {
        return operatorRepository.save(operator);
    }

    @Override
    public Operator get(Integer id) {
        return operatorRepository.getById(id);
    }

    @Override
    public void delete(Integer id) {
        operatorRepository.deleteById(id);
    }
}

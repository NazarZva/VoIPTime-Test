package test.operator.app.service;

import test.operator.app.model.Operator;

public interface OperatorService {
    Operator save(Operator operator);

    Operator get(Integer id);

    void delete(Integer id);
}

package src.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vpedro on 5/15/14.
 */
public class OperationVO {
    Map<String, Operation> operacoes = new HashMap<String, Operation>(4);
    Operation operation;
    Double numberA, numberB;

    public OperationVO (Double a, Double b, String signal){
        fillOperations();
        this.numberA = a;
        this.numberB = b;
        this.operation = operacoes.get(signal);
    }

    private void fillOperations(){
        operacoes.put("+", new Addition());
        operacoes.put("-", new Subtraction());
        operacoes.put("*", new Multiplication());
        operacoes.put("/", new Division());
    }

    public Double getNumberA() {
        return numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public Operation getOperation() {
        return operation;
    }
}


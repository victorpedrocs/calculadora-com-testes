package src.controller;

import src.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vpedro on 5/13/14.
 */
public class CalcController {

    private Map<String, Operation> operations = new HashMap<String, Operation>();
    public static CalcController instance;
    private CalcController(){
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("x", new Multiplication());
        operations.put("/", new Division());
    }

    public static CalcController getInstance(){
        if (instance == null){
            instance = new CalcController();
        }
        return instance;
    }

    public String newOperation(String operation){

        if (operation.contains("+")){
            String[] numeros = operation.split("\\p{Punct}+");
            if (numeros.length > 1){
                Double soma = new Double(0);
                for (String n : numeros){
                    soma += Double.valueOf(n);
                }
                return String.valueOf(soma.shortValue());
            }
            return "1";
        }
        
        return null;

    }

    public Double operate(OperationVO operation){
        return operation.getOperation().operate(operation.getNumberA(), operation.getNumberB());
    }



}

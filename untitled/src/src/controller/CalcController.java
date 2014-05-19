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

    private static final String add = "+";
    private static final String sub = "-";
    private static final String mult = "x";
    private static final String div = "/";


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
        // Addition
        if (operation.contains(add)){
            String[] numeros = operation.split("\\p{Punct}+");
            Double[] vetordouble;

            return operations.get(add).operate(numeros).out();
        }

        // Subtraction
        else if (operation.contains(sub)){
            String[] numeros = operation.split("-");
            Double[] vetordouble;

            return operations.get(sub).operate(numeros).out();
        }

        //Multiplication
        else if (operation.contains(mult)){
            String[] numeros = operation.split("x");
            Double[] vetordouble;

            return operations.get(mult).operate(numeros).out();
        }

        //Division
        else if (operation.contains(div)){
            String[] numeros = operation.split("/");
            Double[] vetordouble;

            return operations.get(div).operate(numeros).out();
        }
        
       else{
            return operation;
        }

    }

    public Double operate(OperationVO operation){
        return operation.getOperation().operate(operation.getNumberA(), operation.getNumberB());
    }



}

package src.controller;

import src.model.Operation;
import src.model.OperationVO;

/**
 * Created by vpedro on 5/13/14.
 */
public class CalcController {

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

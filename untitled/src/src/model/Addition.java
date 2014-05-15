package src.model;

/**
 * Created by vpedro on 5/13/14.
 */
public class Addition implements Operation{

    private Double value;

    @Override
    public Double operate(double a, double b) {
        return a+b;
    }

    @Override
    public Operation operate(Double[] n) {
        Double soma = 0.0;
        for (Double numero : n){
            soma += numero;
        }
        value = soma;
        return this;
    }

    @Override
    public Operation operate(Operation o, double a) {
        return null;
    }
}

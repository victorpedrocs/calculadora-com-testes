package src.model;

/**
 * Created by vpedro on 5/13/14.
 */
public class Multiplication implements Operation {

    private Double value = 0d;

    @Override
    public Double operate(double a, double b) {
        return a*b;
    }

    @Override
    public Operation operate(String[] numeros) {
        Double soma = 1d;
        for (String numero : numeros){
            soma *= Double.valueOf(numero);
        }
        this.value = soma;
        return this;
    }

    @Override
    public String out(){
        return String.valueOf(this.value);
    }
}

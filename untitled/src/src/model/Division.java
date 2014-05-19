package src.model;

/**
 * Created by vpedro on 5/13/14.
 */
public class Division implements Operation {

    private Double value = 0d;

    @Override
    public Double operate(double a, double b) {
        return a/b;
    }

    @Override
    public Operation operate(String[] numeros) {
        Double div = Double.valueOf(numeros[0]) / Double.valueOf(numeros[1]);
        this.value = div;
        return this;
    }




    @Override
    public String out(){
        return String.valueOf(this.value);
    }
}

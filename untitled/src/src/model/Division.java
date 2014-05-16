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
        Double div = 1d;
        for(String numero : numeros){
            div = Double.valueOf(numero)/div;
        }
        this.value = div;
        return this;
    }




    @Override
    public String out(){
        return String.valueOf(this.value);
    }
}

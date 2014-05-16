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
    public Operation operate(String[] numeros) {
        Double soma = 0.0;
        for (String numero : numeros){
            soma += Double.valueOf(numero);
        }
        value = soma;
        return this;
    }

    @Override
    public String out(){
        return String.valueOf(this.value);
    }
}

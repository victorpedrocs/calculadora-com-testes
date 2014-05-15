package src.model;

/**
 * Created by vpedro on 5/13/14.
 */
public class Subtraction implements Operation {


    @Override
    public Double operate(double a, double b) {
        return a-b;
    }

    @Override
    public Operation operate(double a) {
        return null;
    }

    @Override
    public Operation operate(Operation o, double a) {
        return null;
    }
}

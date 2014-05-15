package src.model;

/**
 * Created by vpedro on 5/13/14.
 */
public interface Operation {

    public Double operate(double a, double b);
    public Operation operate(double a);
    public Operation operate(Operation o, double a);

}

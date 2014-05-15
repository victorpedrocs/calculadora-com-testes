package test.source;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import src.controller.CalcController;

import static org.junit.Assert.*;

public class CalcControllerTest extends TestCase {

    CalcController calculator;
    @Before
    public void setUp(){
        calculator = new CalcController();
    }

    @Test
    public void testCalc(){
        assertEquals("1", calculator.newOperation("1"));
    }

    @Test
    public void testCalc2(){
        String operation = "1+1";
        assertEquals("2",calculator.newOperation(operation));
    }

    @Test
    public void testCalc3(){
        String operation = "2+3";
        assertEquals("5", calculator.newOperation(operation));
    }


}
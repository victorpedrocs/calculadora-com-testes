package src.test;

import org.junit.Test;
import src.controller.CalcController;

import static org.junit.Assert.*;

public class CalcControllerTest {

    @Test
    public void testNewOperation1() throws Exception {
        String um = "1";
        assertEquals(um, CalcController.getInstance().newOperation(um));
    }

    @Test
    public void testNewOperation11() throws Exception {
        String um = "11";
        assertEquals(um, CalcController.getInstance().newOperation(um));
    }
    @Test
    public void testNewOperation1234156() throws Exception {
        String um = "1234156";
        assertEquals(um, CalcController.getInstance().newOperation(um));
    }

    @Test
    public void testNewOperation1mais1() throws Exception {
        String operacao = "1+1";
        String resposta = "2";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation1ponto5mais2() throws Exception {
        String operacao = "1.5+2";
        String resposta = "3.5";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation1menos1() throws Exception {
        String operacao = "1-1";
        String resposta = "0";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation1ponto5menos5() throws Exception {
        String operacao = "1.5-5";
        String resposta = "-3.5";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation1mult1() throws Exception {
        String operacao = "1x1";
        String resposta = "1";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation2mult2() throws Exception {
        String operacao = "2x2";
        String resposta = "4";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation2ponto2mult3() throws Exception {
        String operacao = "2.2x3";
        String resposta = "6.6";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation2div1() throws Exception {
        String operacao = "2/1";
        String resposta = "2";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation2div2() throws Exception {
        String operacao = "2/2";
        String resposta = "1";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

    @Test
    public void testNewOperation6div2() throws Exception {
        String operacao = "6/2";
        String resposta = "3";
        assertEquals(resposta, CalcController.getInstance().newOperation(operacao));
    }

}
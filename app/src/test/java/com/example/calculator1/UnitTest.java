package com.example.calculator1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mariuszgromada.math.mxparser.Expression;


public class UnitTest{
    @Test
    public void calculatorTest_add(){
        String input = "4+4";
        String expected = "8.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }

    @Test
    public void calculatorTest_subtract(){
        String input = "12-4";
        String expected = "8.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }

    @Test
    public void calculatorTest_negative(){
        String input = "4-12";
        String expected = "-8.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }

    @Test
    public void calculatorTest_multiply(){
        String input = "-12*2";
        String expected = "-24.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }


    @Test
    public void calculatorTest_decimal()
    {
        String input = "9/2";
        String expected = "4.5";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }
    @Test
    public void calculatorTest_Power()
    {
        String input = "9^2";
        String expected = "81.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }
    @Test
    public void calculatorTest_root()
    {
        String input = "√64";
        String expected = "8.0";

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
        assertEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void calculatorTest_null()
    {
        String input = null;

        Expression expression = new Expression(input);
        String actual = String.valueOf(expression.calculate());
    }
}
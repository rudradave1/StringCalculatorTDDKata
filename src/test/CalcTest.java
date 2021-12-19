package test;

import main.java.calc.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {


    // 1.

    // Return 0 for empty string.
    @Test
    public void returnZeroIfEmpty(){
        assertEquals(0,Calculator.add(""));
    }

    // Single character will return the same char.
    @Test
    public void returnSameChar() {
        assertEquals(1, Calculator.add("1"));
    }

    //  Return addition if two numbers are given as input
    @Test
    public void returnSumForTwoNumbers(){
        assertEquals(3, Calculator.add("1,2"));
    }

    // 2.
    @Test
    public void returnSumForAllNumbers(){
        assertEquals(10, Calculator.add("1,2,3,4"));
    }

    // 3.
    public void returnSumAndAllowNewLines(){
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    // 4.
    public void returnSumAndAllowDiffDelimiter(){
        assertEquals(3, Calculator.add("//;\n1;2"));
    }

}
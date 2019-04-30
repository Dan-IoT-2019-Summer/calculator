package com.MangKkung.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
  */
public class CalculatorTest{
    private Calculator calculator = new Calculator();

    @Test
        public void testSum(){
            assertEquals(5, calculator.sum(2,3));
        }
    @Test
        public void testDif(){
            assertEquals(5, calculator.dif(7,2));            
        }
    @Test
        public void testMul(){
            assertEquals(5, calculator.mul(1,5));
        }
    @Test
        public void testDiv(){
            assertEquals(5, calculator.div(10,2));
        }
}

package com.qaagility.controller;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.Calcmul;
public class MyCalcMulTest{
  
  Calcmul calc = new Calcmul();
  
  @Test
  public void testCalc(){
    int result = calc.multiply(9,9);
    assertEquals("To-Pass", 81, result);
  }
  
  @Test
  public void testCalc1(){
    assertEquals("To-Fail", 90, result);
  }
  
}

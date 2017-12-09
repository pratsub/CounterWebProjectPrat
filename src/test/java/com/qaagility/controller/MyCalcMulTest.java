package com.qaagility.controller;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.Calcmul;
public class MyCalcMulTest{
  
  Calcmul calc = new Calcmul();
  @Before
  public void before(){
    System.out.println("Before")
  }
  
  @After
  public void after(){
    System.out.println("After")
  }
  
  @Test
  public void testCalc(){
    int result = calc.multiply(9,9);
    assertEquals("To-Pass", 81, result);
  }
  /*
  
  @Test
  public void testCalc1(){
    int result = calc.multiply(9,9);
    assertEquals("To-Fail", 90, result);
  } */
  
}

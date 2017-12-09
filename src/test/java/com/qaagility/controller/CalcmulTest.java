package com.qaagility.controller;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalcmulTest{
  
  public void testSlow(){
    System.out.println("Slow");
  }
  
  public void testSlower(){
    System.out.println("Slower");
 }
  public void testFast(){
    System.out.println("Fast");
  }
  
  @Test
  public void testCalc(){
    assertEquals("To-Pass", 9, 9);
  }
  
  @Test
  public void testCalc1(){
    assertEquals("To-Fail", 90, 9);
  }
  
  }

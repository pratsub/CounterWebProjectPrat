package com.qaagility.controller;
public class  Calcmul {


 public static void main(String args[]) {
 
  Calcmul cal = new Calcmul;
  int i = cal.multiply(3,5);
  System.out.println("Multiplication output " + i);
 }
 
  private int multiply(int a, int b){
    return  a*b;
 }
}

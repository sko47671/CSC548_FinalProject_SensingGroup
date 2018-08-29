/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloclass;

/**
 *
 * @author bkoken
 */

public class HelloClass {
  HelloClass() {
    System.out.println("This application introduces the class.");
  }
 
  public static void main(String[] args) {
    HelloClass my = new HelloClass();
    BKokensparger BJK = new BKokensparger();
    DTheis DJT = new DTheis();
 
  }
}
 
class BKokensparger {
  BKokensparger() {
    System.out.println("Hi, I'm Brian Kokensparger, originally from Junction City, Ohio. "
            + "I am your instructor for this course.");
  }
} 
class DTheis {
  DTheis() {
    System.out.println("Hi, I'm Dominic Theis and I am from Stillwater, MN. "
            + "I am a senior graduating in may.");
  }
} 
  

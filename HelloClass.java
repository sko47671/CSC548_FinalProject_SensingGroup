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
    RLabausa RTL = new RLabausa();
    DTheis DJT = new DTheis();
    PJohnson PLJ = new PJohnson();
    EBaranowski EMB = new EBaranowski();
  }
}
 
class BKokensparger {
  BKokensparger() {
    System.out.println("Hi, I'm Brian Kokensparger, originally from Junction City, Ohio. "
            + "I am your instructor for this course.");
  }
} 
class RLabausa {
  RLabausa() {
    System.out.println("Hi, I'm Ruby Labausa. I am from Ewa Beach, Hawaii."
            + "I am a student in this course.");
  }
} 
class DTheis {
  DTheis() {
    System.out.println("Hi, I'm Dominic Theis and I am from Stillwater, MN. "
            + "I am a senior graduating in may.");
  }
} 


class PJohnson {
  PJohnson() {
    System.out.println("Hi, I'm Parker Johnson, originally from Burnsville, MN. "
            + "I am NOT your instructor for this course.");
  }
}
class EBaranowski {
  EBaranowski() {
        System.out.println("Hi, I'm Emily Baranowski and I'm from Overland Park, KS "
            + "I have no idea what I'm doing.");
  }
}

  

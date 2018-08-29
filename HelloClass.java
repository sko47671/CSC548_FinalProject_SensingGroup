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

    }
}

class BKokensparger {

    BKokensparger() {
        System.out.println("Hi, I'm Brian Kokensparger, originally from Junction City, Ohio. "
                + "I am your instructor for this course.");
    }
}

class DLee {

    DLee() {
        System.out.println("Hi, I'm David Lee, originally from South Korea. "
                + "I studied in India for four years in middle school");
    }
}


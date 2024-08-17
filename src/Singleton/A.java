/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author isharaLakshitha
 */
public class A {

    private static A a;

    private A() {

    }

    public static A getA() {
        if (a == null) {
            a = new A();
        }
        return a;
    }
}

class Test {

    public static void main(String[] args) {
        A a1 = A.getA();
        A a2 = A.getA();

        System.out.println("a1==a2");
    }
}

// class diagram rules
// 3 rows
// 1st-row=> class name, abstract class name, interface name
// 2nd-row=> variables
// 3rd-row=> methods
// + public and - private
// underline static and non-underline instance
// after the: we right variable type

// +--------------------+
// |       + A          |
// +--------------------+
// | - a: A             |  // Private static instance of class A (need to underline)
// +--------------------+
// | + getA(): A        |  // Public static method to get the instance (need to underline)
// | - A()              |  // Private constructor
// +--------------------+


    


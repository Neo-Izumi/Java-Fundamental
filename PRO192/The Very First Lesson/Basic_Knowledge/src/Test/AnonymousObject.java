/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


public class AnonymousObject {
    public static void main(String[] args) {
        new A().m1();
        new A(3).m2(5);
        new B().m1();
    }
}

class A {
    public A() {
        System.out.println("non-parameterized constructor in A");
    }
    public A(int a){
        System.out.println("parameterized constructor in A");
    }
    public void m1(){
        System.out.println("non-parameterized method in A");
    }
    public void m2(int a) {
        System.out.println("parameterized method in A");
    } 
}

class B extends A{
    public B() {
        System.out.println("non-parameterized constructor in B");
    }
    public B(int a){
        System.out.println("parameterized constructor in B");
    }
    public void m3(){
        System.out.println("non-parameterized method in B");
    }
    public void m4(int a) {
        System.out.println("parameterized method in B");
    } 
}
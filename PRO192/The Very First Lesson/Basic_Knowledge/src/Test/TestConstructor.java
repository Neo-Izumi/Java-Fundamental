/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author VSIT
 */
public class TestConstructor {
    public static void main(String[] args) {
        customer st = new customer("Hoang");
//      customer st = new customer;
        System.out.println("this is Hoang");
    }
}

class customer {
    String name;
    
    public customer(String name){
        this.name = name;
    }
}
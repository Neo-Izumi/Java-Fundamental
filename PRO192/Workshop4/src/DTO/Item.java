/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class Item {
    
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

   

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    public void input(){
        Scanner item = new Scanner(System.in);
        System.out.println("Enter the value:");
        do {
            value = item.nextInt();
        } while (value <= 0);
        System.out.println("Enter the creator:");
        do {
            creator = item.nextLine();
        } while (creator.equals(""));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author VSIT
 */
public class University extends Organization{
    
    protected String name;

    public University() {
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    @Override
    public void communicateByTool() {
        System.out.println("In the University, people communicate by voice");
    }
    
    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has recieved all enrollment documents and enrollment fees");
    }
    
    public void educate() {
        System.out.println("Provide education at University standard");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge";
    }
    
    
}

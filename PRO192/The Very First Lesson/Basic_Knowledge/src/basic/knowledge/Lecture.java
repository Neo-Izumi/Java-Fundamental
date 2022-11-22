/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.knowledge;

/**
 *
 * @author VSIT
 */
public class Lecture {
    
    private String subject = "Math";
    private int unit = 12;
    
    public void showLecture() {
        System.out.println("Subject: " + subject);
        System.out.println("Unit: " + unit);
    }
    
    public int addNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }
            
    public static void main(String[] args) {
        Lecture le = new Lecture();
        le.showLecture();
        System.out.println("Sum= " + le.addNumber(3,6));
    }
}

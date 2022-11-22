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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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
    
    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Water-colour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }
    
    public void inputPainting() {
        input();
        Scanner paint = new Scanner(System.in);
        System.out.println("Enter the height:");
        do {
            height = paint.nextInt();
        } while (height <= 0);
        System.out.println("Enter the width:");
        do {
            width = paint.nextInt();
        } while (width <= 0);
        System.out.println("Did this painting use water-colour?");
        isWatercolour = paint.nextBoolean();
        System.out.println("Is this painting be framed?");
        isFramed = paint.nextBoolean();
    }
}

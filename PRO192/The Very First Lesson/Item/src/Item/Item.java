/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author VSIT
 */
public class Item implements Comparable<Item>{

    private String code;
    private String name;
    private int price;

    public Item() {
    }

    public Item(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.printf("%1$4s    %2$-20s    %3$-5d\n", code, name, price);
    }

    @Override
    public int compareTo(Item o) {
        return this.code.compareTo(o.getCode());
    }

}

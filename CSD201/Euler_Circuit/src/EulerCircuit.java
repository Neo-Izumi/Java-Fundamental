/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class EulerCircuit {
    
    int[] e;
    int m;
    char[] v;

    public EulerCircuit() {
        e = new int [50];
        m=0;
        v="ABCDEFGHIKLMN".toCharArray();
    }
    
    void add(int x){
        e[m++] = x;
    }
    
    void display(){
        for (int i = 0; i < m-1; i++) {
            System.out.print(v[e[i]]+" -> ");
        }
        System.out.println(v[e[m-1]]);
    }
}

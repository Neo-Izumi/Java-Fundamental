/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VSIT
 */
public class MyList {
    
    Node head, tail;

    public MyList() {
        head=tail=null;
    }
    
    boolean isEmpty() {
        return (head==null);
    }
    
    void clear() {
        head=tail=null;
    }
    
    //(1)
    void addLast(Person x) { 
        Node p = new Node(x);
        if (isEmpty()) {
            head=tail=p;
            return;
        } else {
            tail.next=p;
            tail=p;
            return;
        }
    }
    
    void getInfor(Node p) {
        if (p==null) return;
        else System.out.println(p.infor);
    }
    
    void traverse() {
        Node p = head;
        while (p!=null) {
            getInfor(p);
            p=p.next;
        }
    }
    
    void addList (ArrayList<Person> a) {
        for (int i = 0; i < a.size(); i++) {
            addLast(a.get(i));
        }
    }
    
    //(2)
    Node searchByName (String name) {
        Node p = head;
        while (p != null) {            
            if (p.infor.name.equals(name)) return p;
            p=p.next;
        }
        return null;
    }
    
    Node searchByAge (int age) {
        Node p = head;
        while (p != null) {
            if (p.infor.age == age) return p;
            p=p.next;
        }
        return null;
    }
    
    void searchByNameAll (String name) {
        Node p = head;
        while (p!=null) {
            if (p.infor.name.equals(name)) getInfor(p);
            p=p.next;
        }
    }
    
    //(3)
    void addFirst (Person x) {
        head = new Node(x, head);
    }
    
    //(4)
    void insertAfter (Node p, Person x) {
        if (isEmpty() || p == null) return;
        p.next = new Node(x, p.next);
        if (tail == p) tail = p.next;
    }
    
    //(5)
    void insertBefore (Node p, Person x) {
        if (isEmpty() || p == null) return;
        if (p == head) addFirst(x);
        Node f = head;
        while (f != null && f != p) {
            f = f.next;
        }
        if (f==null) return;
        insertAfter(f, x);
        //...
    }
    
    //(6) 
    void removeFirst () {
        if (isEmpty()) return;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return;
    }
    
    void remove (Node p) {
        if (isEmpty() || p == null) return;
        if (p == head) {
            removeFirst();
            return;
        }
        Node f = head;
        while (f != null && f.next != p) {
            f = f.next;
        }
        f.next=p.next;
        if (f.next == null) tail = f;
        
    }
    
    //(7)
    void remove (String name) {
        Node p = searchByName(name);
        remove(p);
    }
    
    //(8)
    void remove (int age) {
        Node p = searchByAge(age);
        remove(p);
    }
    
    //(9)
    void removeAll (int age) {
        Node p;
        while (true) {            
            p = searchByAge(age);
            if (p == null) return;
            else remove(p);
        }
    }
    
    //(10) 
    Node pos (int k) {
        Node p = head;
        int i=0;
        while (p!=null){
            if (i==k) return p;
            i++;
            p=p.next;
        }
        return null;    
    }
    
    //(11)
    void removePos (int k) {
        Node p = pos(k);
        remove(p);
    }
    
    //(12)
    void sortByName () {    // ascending order
        Node i = head, j, tem;
        Person min ;
        while (i.next != null) {
            j = i.next;
            tem = i;
            min = i.infor;
            while (j != null) {
                if (i.infor.name.compareTo(j.infor.name) > 0) {
                    min = j.infor;
                    tem = j;
                }
                j = j.next;
            }
            tem.infor = i.infor;
            i.infor = min;
            i=i.next;
        }
    }
    
    //(13)
    void sortByAge () {     // ascending order
        Node i = head, j, tem;
        Person min;
        while (i.next != null) {
            j = i.next;
            tem = i;
            min = i.infor;
            while (j != null) {
                if (i.infor.age > j.infor.age) {
                    min = j.infor;
                    tem = j;
                }
                j = j.next;
            }
            tem.infor = i.infor;
            i.infor = min;
            i = i.next;
        }
    }
    
    //(14) 
    int size() {
        int cnt = 0;
        Node p = head; 
        while (p != null) {
            cnt++;
            p = p.next;
        }
        return cnt;
    }
    
    //(15) 
    Person[] toArray () {
        int i=0, size;
        size = size();
        Person[] a = new Person[size];
        Node p = head;
        while (p != null) {
            a[i++] = new Person(p.infor.name, p.infor.age);
            p = p.next;
        }
        return a;
    }
    
    //(16)
    void reverseAll () {
        MyList t = new MyList();
        Node p = head;
        while (p != null) {
            t.addFirst(p.infor);
            p = p.next;
        }
        head = t.head;
        tail = t.tail;
    }
    
    //(17)
    Node findMaxAge () {
        if (isEmpty()) return null;
        Node max = head;
        Node p = max.next;
        while (p != null) {
            if (max.infor.age < p.infor.age) max = p;
            p = p.next;
        }
        return max;
    }
    
    //(18)
    Node findMinAge () {
        if (isEmpty()) return null;
        Node min = head;
        Node p = min.next;
        while (p != null) {
            if (min.infor.age > p.infor.age) min = p;
            p = p.next;
        }
        return min;
    }
    
    //(19)
    void setData (Node p, Person x) {
        p.infor=x;
    }
    
    //(20)
    void sortByAge (int l, int h) {
        if (l>=h) return;
        if (l<0) l=0;
        if (h>size()-1) h=size()-1;
        Node u = pos(l), v = pos(h), p;
        Person tem;
        while (u.next != v) {
            p = u.next;
            while (p != v.next) {
                if (u.infor.age > p.infor.age) {
                        tem = u.infor;
                        u.infor = p.infor;
                        p.infor = tem;
                }
                p = p.next;
            }
            u = u.next;
        }
    }
    
    //(21) 
    void reverse (int l, int h) {
        int n=size();
        if (l>=h) return;
        if (l<0) l=0; 
        if (h>n-1) h = n-1;
        Person x;
        Person[] a = toArray();
        while (l<h) {
            x=a[l];
            a[l]= a[h];
            a[h]=x;
            l++;
            h--;
        }
        clear();
        for (int i = 0; i < n; i++) {
            addLast(a[i]);
        }
    }
    
    //(22) 
    boolean checkSortedAge () {
        Node p = head;
        while (p != null) {
            if (p.infor.age > p.next.infor.age) return false;
            p = p.next;
        }
        return true;
    }
    
    //(23)
    void attachListToEnd (MyList l) {
        if (isEmpty()) {
            this.head = l.head;
            this.tail = l.tail;
            return;
        }
        this.tail.next = l.head;
        this.tail = l.tail;
        return;
    }
    
    //(24)
    double averageAge () {
        if (isEmpty()) return 0;
        Node p = head;
        double sum=0, ave, size = size();
        while (p!=null) {
            sum+=p.infor.age;
            p=p.next;
        }
        ave = (double) sum / size;
        return ave;
    }
}

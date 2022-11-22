/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author VSIT
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("A", 11));
        list.add(new Person("B", 14));
        list.add(new Person("C", 12));
        list.add(new Person("D", 13));
        list.add(new Person("E", 17));
        list.add(new Person("F", 14));
        list.add(new Person("A", 16));
        list.add(new Person("H", 13));
        list.add(new Person("I", 11));
        MyList ml = new MyList();
        
        //(1) test addList()
        ml.addList(list);
        ml.traverse();
        System.out.println();
        System.out.println("--------------------------------------------------");
//        
//        //(2) test searchByName(String name)
//        ml.clear();
//        ml.addList(list);
//        ml.getInfor(ml.searchByName("H"));
//        ml.searchByNameAll("A");
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(3) test addFirst(Person x)
//        ml.clear();
//        ml.addList(list);
//        ml.addFirst(new Person("Z", 19));
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(4) test insertAfter(Node p, Person x)
//        ml.clear();
//        ml.addList(list);
//        ml.insertAfter(ml.searchByName("C"), new Person("Y", 20));
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(5) test insertBefore(Node p, Person x)
//        ml.clear();
//        ml.addList(list);
//        ml.insertBefore(ml.searchByName("C"), new Person("Y", 20));
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//        
//        //(6) test removeFirst()
//        ml.clear();
//        ml.addList(list);
//        ml.removeFirst();
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//        
//        //(7) test remove(String name)
//        ml.clear();
//        ml.addList(list);
//        ml.remove("C");
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//        
//        //(8) test remove(int age)
//        ml.clear();
//        ml.addList(list);
//        ml.remove(16);
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(9) test removeAll(int age)
//        ml.clear();
//        ml.addList(list);
//        ml.removeAll(11);
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(10) test pos(int k)
//        ml.clear();
//        ml.addList(list);
//        ml.getInfor(ml.pos(5));
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(11) test removePos(int k)
//        ml.clear();
//        ml.addList(list);
//        ml.removePos(5);
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");
//    
//        //(12) test sortByName()
//        ml.clear();
//        ml.addList(list);
//        ml.sortByName();
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------"); 
    
//        //(13) test sortByAge()
//        ml.clear();
//        ml.addList(list);
//        ml.sortByAge();
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(14) test size()
//        ml.clear();
//        ml.addList(list);
//        System.out.println(ml.size());
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(15) test toArray()
//        ml.clear();
//        ml.addList(list);
//        Person[] per = ml.toArray();
//        for (Person person : per) {
//            System.out.println(person);
//        }
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(16) test reverse()
//        ml.clear();
//        ml.addList(list);
//        ml.reverseAll();
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(17) test findMaxAge()
//        ml.clear();
//        ml.addList(list);
//        ml.getInfor(ml.findMaxAge());
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(18) test findMinAge()
//        ml.clear();
//        ml.addList(list);
//        ml.getInfor(ml.findMinAge());
//        System.out.println();
//        System.out.println("--------------------------------------------------");
        
//        //(19) test setData()
//        ml.clear();
//        ml.addList(list);
//        Node p = ml.searchByName("H");
//        ml.setData(p, new Person("M", 18));
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");

//        //(20) test sortByAge(int l, int h)
//        ml.clear();
//        ml.addList(list);
//        ml.sortByAge(0, 5);
//        ml.traverse();
//        System.out.println();
//        System.out.println("--------------------------------------------------");

        //(21) test reverse(int l, int h)
        ml.clear();
        ml.addList(list);
        ml.reverse(0,5);
        ml.traverse();
        System.out.println();
        System.out.println("--------------------------------------------------");
        
        //(24) test averageAge()
        ml.clear();
        ml.addList(list);
        System.out.println(ml.averageAge());
        System.out.println("--------------------------------------------------");
    }
}

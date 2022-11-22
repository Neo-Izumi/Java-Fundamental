
package DemoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class DemoList {
    public static void main(String[] args) {
        // arraylist:
        ArrayList ar = new ArrayList();
        // method add:
        ar.add("Hello");
        ar.add(5);
        ar.add(10.2);
        ar.add(true);
        ar.add(new Student("HE161890", "Thinh"));
        // vector
        Vector v = new Vector();
        v.add(false);
        v.add("hello");
        v.add(5);
        
        ar.add(v);
        ar.addAll(v);
        System.out.println(ar);
        
        // add and addAll vector v
//        System.out.println(ar);
//        ar.add(v); // add an object 
//        ar.addAll(v); // made a duplicate of all elements in v and add to a
////        for (int i = 0; i < v.size(); i++) { // this is the way that method addAll() work
////            ar.add(v.get(i));
////        }
//        v.add(100); // just affect to ar.add(v) 
//        System.out.println(ar);

        // method set(int index, Object obj) (0 <= index <= size)
//        ar.addAll(3, v);
//        System.out.println(ar);
//        ar.set(4, "DTSV"); // reset element at index to obj
//        System.out.println(ar);
        
//        //remove(int index):
//        System.out.println(ar);
////        ar.remove(0); // remove element at index and return the removed element
////        System.out.println(ar.remove(0));
//        ar.remove("hello"); // remove the first occured object and return true, if it doesn't occur, return false 
//        ar.remove((Object) 5); 
//        ar.remove((Integer) 5); 
//        ar.remove(new Integer(5)); // wrap 5 to a Integer object
//        ar.remove(10.2);
//        ar.remove("Hello");
//        System.out.println(ar);

//        // removeAll(collection c)
//        ar.removeAll(v); // remove all v's elements that occured in ar, return true if there is at least one element removed
//        for (int i = 0; i < ar.size(); i++) {
//            if (v.contains(ar.get(i))) { // method contains(Object obj): return true if collection contaij object obj, return false if it does not
//                ar.remove(i);
//                i--;
//            }
//        }
//          System.out.println(ar);
        
        // retainAll(collection c):
        ar.retainAll(v); // remove all ar's element that don't occur in v, if there are any change of ar, return true
        for (int i = 0; i < ar.size(); i++) {
            if (!v.contains(ar.get(i))) {
                ar.remove(i);
                i--;
            }
        }
        System.out.println(ar);
         
//        // dislay:
//        // c1:
//        System.out.println(ar);
//        // c2:
//        for (int i = 0; i < ar.size(); i++) { // method size(): return size of the given list
//            System.out.print(ar.get(i) + ", "); // method get(int index): access to the element at index position
//        }
//        System.out.println("");
//        // c3:
//        for (Object object : ar) {
//            System.out.print(object + ", ");
//        }
//        System.out.println("");
//        // c4:
//        for (Iterator it = ar.iterator(); it.hasNext();) {
//            Object next = it.next();
//            System.out.print(next + ", ");
//        }
//        System.out.println("");
//        // c5: 
//        Iterator its = ar.iterator();
//        while (its.hasNext()){
//            Object obj = its.next();
//            System.out.print(obj + ", ");
//        }
//        System.out.println("");
    }   
}

class Student {
    
    String id;
    String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[Name: " + name + " ID: " + id + "}"; 
    }
    
}

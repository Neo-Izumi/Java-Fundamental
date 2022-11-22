
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class MyTV implements iTV{

    @Override
    public int F1(ArrayList<TV> ar, int x, String s) {
        
        int cnt = 0, l = s.length();
        
        // 1: return the number of TVs with size x
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize() == x) {
//                System.out.println(ar.get(i));
//                cnt++;
//            }
//        }
//        return cnt;
        
        // 2: return the number of TVs with the name contain string s (case-unsensitive)
//        for (int i = 0; i < ar.size(); i++) {
//            for (int j = 0; j <= ar.get(i).getName().length() - l; j++) {
//                if (ar.get(i).getName().substring(j, j + l).matches(s)) {
//                    System.out.println(ar.get(i));
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
        
        // 3: return the sum of prices that are greater than x
//        double sum = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() > x) {
//                System.out.println(ar.get(i));
//                sum += ar.get(i).getPrice();
//            }
//        }
//        sum = Math.floor(sum);
//        return (int) sum;
        
        // 4: return the sum of prices of TVs whose names contain s
//        int sum = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            for (int j = 0; j <= ar.get(i).getName().length() - l; j++) {
//                if (ar.get(i).getName().substring(j, j + l).matches(s)) {
//                    System.out.println(ar.get(i));
//                    sum += ar.get(i).getPrice();
//                }
//            }
//        }
//        return (int) sum;
        
        // 5: return the integer part of the average of all TVs' prices
//        double ave = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i).getPrice();
//        }
//        ave = Math.floor(ave / ar.size());
//        return (int) ave;
        
        // 6: return the size of TV whose price is close to the average of all prices
//        double ave = 0;
//        int min = 0;
//        double[] a = new double[ar.size()];
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i).getPrice();
//        }
//        ave = ave / ar.size();
//        for (int i = 0; i < ar.size(); i++) {
//            a[i] = Math.abs(ave - ar.get(i).getPrice());
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < a[min]) {
//                min = i;
//            }
//        }
//        System.out.println(ave);
//        System.out.println(ar.get(min));
//        return ar.get(min).getSize();
        
        // 7: return the number of TVs whose sizes are smaller than x and names don't contain s
//        for (int i = 0; i < ar.size(); i++) {
//            if (!ar.get(i).getName().contains(s) && ar.get(i).getSize() < x) {
//                System.out.println(ar.get(i));
//                cnt++;
//            }
//        }
//        return cnt;
        
        // 8: return the integer part of the average of all TVs size
//        double ave = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i).getSize();
//        }
//        ave = Math.floor(ave / ar.size());
//        return (int) ave;
        
        // 9: return the TV's size occurred the most 
//        int[] a = new int[ar.size()];
//        for (int i = 0; i < ar.size() - 1; i++) {
//            cnt = 0;
//            for (int j = i + 1; j < ar.size(); j++) {
//                if (ar.get(i).getSize() == ar.get(j).getSize()) {
//                    cnt++;
//                }
//            }
//            a[i] = cnt;
//        }
//        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[max] < a[i]) {
//                max = i;
//            }
//        }
//        return ar.get(max).getSize();
        
        // 10: return the TV'size less than and close to x
        int min = 0, check = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i).getSize() < x) {
                min = i;
                check = 1;
            } 
        }
        if (check == 0) return 0;
        for (int i = min + 1; i < ar.size(); i++) {
            if (ar.get(i).getSize() < x && (x - ar.get(i).getSize()) < (x - ar.get(min).getSize())) {
                min = i;
            }
        }
        System.out.println(ar.get(min));
        return ar.get(min).getSize();
    }

    @Override
    public void F2(ArrayList<TV> ar, int x, String s) {
        
        // 1: sort the list in increasing order by the price
//        Collections.sort(ar, new Comparator<TV>() {
//            @Override
//            public int compare(TV o1, TV o2) {
//                return o1.getPrice() > o2.getPrice() ? 1 : -1;
//            }
//        });
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }

        // 2: sort the list in decreasing order by the size
//        Collections.sort(ar, new Comparator<TV>() {
//            @Override
//            public int compare(TV o1, TV o2) {
//                int result = 0;
//                result = o1.getSize() > o2.getSize() ? -1 : 1;
//                result = o1.getName().compareTo(o2.getName());
//                result = o1.getPrice() > o2.getPrice() ? 1 : -1;
//                return result;
//            }
//        });
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }

        // 3: sort all TVs whose sizes are greater than x
//        ArrayList<TV> tem = new ArrayList<>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize() >= x) {
//                tem.add(ar.get(i));
//            }
//        }
//        Collections.sort(tem, new Comparator<TV>() {
//            @Override
//            public int compare(TV o1, TV o2) {
//                return Integer.compare(o1.getSize(), o2.getSize());
//            }
//        });
//        int j = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize() >= x) {
//                ar.set(i, tem.get(j));
//                j++;
//            }
//        }
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 4: delete the first TV with size greater than or equal to x
//        System.out.println(ar.size());
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize() >= x) {
//                ar.remove(i);
//                break;
//            }
//        }
//        System.out.println(ar.size());
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 5: delete TVs whose name contain s (ignore case)
//        System.out.println(ar.size());
//        s = s.toLowerCase();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getName().toLowerCase().contains(s)) {
//                ar.remove(i);
//            }
//        }
//        System.out.println(ar.size());
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 6: reverse TVs whose sizes are less than or equal to x (the other stand still)
//        ArrayList<TV> tem = new ArrayList<>();
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize()<=x) tem.add(ar.get(i));
//        }
//        int l=tem.size();
//        for (int i = 0; i < l/2; i++) {
//            TV temp = tem.get(i);
//            tem.set(i, tem.get(l-i-1));
//            tem.set(l-i-1, temp);
//        }
//        int j=0;
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getSize()<=x) {
//                ar.set(i, tem.get(j));
//                j++;
//            }
//        }
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 7: delete the first TV with the second highest price
//        System.out.println(ar.size());
//        int max = 0, min = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() > ar.get(max).getPrice()) {
//                max = i;
//            }
//        }
//        System.out.println(ar.get(max).getPrice());
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() == ar.get(max).getPrice()) {
//                continue;
//            }
//            if (ar.get(max).getPrice() - ar.get(i).getPrice() < ar.get(max).getPrice() - ar.get(min).getPrice()) {
//                min = i;
//            }
//        }
//        System.out.println(ar.get(min).getPrice());
//        ar.remove(ar.get(min));
//        System.out.println(ar.size());
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 8: delete TVs with the second highest price
//        System.out.println(ar.size());
//        int max = 0, min = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() > ar.get(max).getPrice()) {
//                max = i;
//            }
//        }
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() == ar.get(max).getPrice()) continue;
//            if (ar.get(max).getPrice() - ar.get(i).getPrice() < ar.get(max).getPrice() - ar.get(min).getPrice()) {
//                min = i;
//            }
//        }
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() == ar.get(min).getPrice()) {
//                ar.remove(i);
//            }
//        }
//        ar.remove(min);
//        System.out.println(ar.size());
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }

        // 9: swap the position of the highest priced TV and the lowest one
//        int max = 0, min = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() < ar.get(min).getPrice()) {
//                min = i;
//            }
//            if (ar.get(i).getPrice() > ar.get(max).getPrice()) {
//                max = i;
//            }
//        }
//        TV tem = ar.get(min);
//        ar.set(min, ar.get(max));
//        ar.set(max, tem);
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
        
        // 10: swap the position of the first TV with the second highest price and the smallest TV
//        int max = 0, mins = 0, min = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() > ar.get(max).getPrice()) {
//                max = i;
//            }
//            if (ar.get(i).getSize() < ar.get(mins).getSize()) {
//                mins = i;
//            }
//        }
//        for (int i = 0; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() == ar.get(max).getPrice()) {
//                continue;
//            }
//            if (ar.get(max).getPrice() - ar.get(i).getPrice() < ar.get(max).getPrice() - ar.get(min).getPrice()) {
//                min = i;
//            }
//        }
//        TV tem = ar.get(min);
//        ar.set(min, ar.get(mins));
//        ar.set(mins, tem);
//        for (TV tv : ar) {
//            System.out.println(tv);
//        }
    }

    @Override
    public String F3(ArrayList<TV> ar, int x, String s) {
        
        // 1: return the name of the highest priced TV
//        int max = 0;
//        for (int i = 1; i < ar.size(); i++) {
//            if (ar.get(i).getPrice() > ar.get(max).getPrice()) {
//                max = i;
//            }
//        }
//        System.out.println(ar.get(max));
//        return ar.get(max).getName();
        
        // 2: return the name of TV with price is closest to the average
//        double ave = 0;
//        int min = 0;
//        for (int i = 0; i < ar.size(); i++) {
//            ave += ar.get(i).getPrice();
//        }
//        ave = ave / ar.size();
//        for (int i = 1; i < ar.size(); i++) {
//            if (Math.abs(ave - ar.get(i).getPrice()) < Math.abs(ave - ar.get(min).getPrice())) {
//                min = i;
//            }
//        }
//        System.out.println(ar.get(min));
//        return ar.get(min).getName();
        
        // 3: return the TVs' names that occur the most
//        int[] a = new int[ar.size()];
//        for (int i = 0; i < ar.size(); i++) {
//            int cnt = 0;
//            for (int j = 0; j < ar.size(); j++) {
//                if (ar.get(i).getName().compareTo(ar.get(j).getName()) == 0) {
//                    cnt++;
//                }
//            }
//            a[i] = cnt;
//        }
//        int max = 0;
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > a[max]) {
//                max = i;
//            }
//        }
//        return ar.get(max).getName();
        
        // 4: return the name of the last TV with the size that occur the most
//        int[] a = new int[ar.size()];
//        for (int i = 0; i < ar.size(); i++) {
//            int cnt = 0;
//            for (int j = 0; j < ar.size(); j++) {
//                if (ar.get(i).getSize() == ar.get(j).getSize()) {
//                    cnt++;
//                }
//            }
//            a[i] = cnt;
//        }
//        int max = a.length - 1;
//        for (int i = max - 1; i >= 0; i--) {
//            if (a[i] > a[max]) {
//                max = i;
//            }
//        }
//        return ar.get(max).getName();
        
        // 5: return the name of TV that have size greater than or equal to x and name containing s
        int i = 0;
        for (i = 0; i < ar.size(); i++) {
            if (ar.get(i).getSize() >= x && ar.get(i).getName().contains(s)) {
                break;
            }
        }
        return ar.get(i).getName();
    }
    
}

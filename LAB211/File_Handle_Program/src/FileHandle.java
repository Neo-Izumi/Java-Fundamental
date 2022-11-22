
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VSIT
 */
public class FileHandle {
    
    // input yes/no
    String inputYesNo() {
        Scanner sc = new Scanner(System.in);
        String s;
        // ask user for a yes or no selection
        do {            
            s=sc.nextLine();
            // if user type "n" or "y", they will be acceptable
            s=s.toUpperCase();  
            // send out this message if user doesn't follow instruction;
            if (!s.startsWith("Y") && !s.startsWith("N")) System.out.print("\tYes or No only: ");     
        } while (!s.startsWith("Y") && !s.startsWith("N"));     // if user doesn't follow instruction, trigger another ask for input
        return s;
    }
    
    // input pathname
    String inputPath() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // use to input pathname
        return s;
    }
    
    // input .txt file
    String inputTxtFile() {
        Scanner sc = new Scanner(System.in);
        String s;
        // ask user for a text file
        do{
            s = sc.nextLine();
            // show this message if user doesn't enter a text file 
            if (!s.endsWith(".txt")) System.out.print("\tEnter text file only (the file's extension is .txt): ");  
        } while (!s.endsWith(".txt"));      // if user doesn't follow instruction, trigger another ask for input
        return s;
    }
    
    // input size
    int inputSize() {
        Scanner sc = new Scanner(System.in);
        int n=0,check=0;
        // ask user for file's size
        do {            
            try {
                n=Integer.parseInt(sc.nextLine());  
                // if there is no exception will be catched, check will be 1 (to stop loop)
                check=1;    
            } catch (Exception e) {
                // show this message if user doesn't enter a numeric value 
                System.out.print("\tValue of size is digit: ");    
            }
        } while (check==0);     // if user doesn't follow instruction, trigger another ask for input
        return n;
    } 
    
    // input choice 
    int inputChoice () {
        Scanner sc = new Scanner(System.in);
        int n=0,check=0;
        // ask user for their choice
        do {            
            try {
                n=Integer.parseInt(sc.nextLine());
                // show this message if user doesn't enter validate value
                if (n<1 || n>5) System.out.print("\tEnter a digit from 1 to 5: ");       
                // if there is no exception will be catched, check will be 1 (to stop loop)
                else check = 1;     
            } catch (Exception e) {
                // show this message if user doesn't enter validate value
                System.out.print("\tEnter a digit from 1 to 5: ");      
            }
        } while (check==0);     // if user doesn't follow instruction, trigger another ask for input
        return n;
    }
    // check the pathname is exist or not
    boolean isExist(String s) {
        try {
            File f = new File(s);
            return f.exists();      // return true if file exist, false if file doesn't exist
        } catch (Exception e) {
            // if null pointer exception are catched, return false
            return false;   
        }
    }
    
    // check the pathname is file or directory
    void checkPath(String s) {
        // if pathname doesn't exist, show it to the user
        if (!isExist(s)) {
            System.out.println("\tThis pathname doesn't exist");
        } else {
            File f = new File(s);
            // check pathname is directory or not
            if (f.isDirectory()) System.out.println("\tThis pathname is a directory");      
            // check pathname is file or not
            if (f.isFile()) System.out.println("\tThis pathname is a file");
        }        
    }
    
    // list all file and directories in the folder
    void listFile (String s) {
        // if pathname doesn't exist, show it to the user
        if (!isExist(s)) {
            System.out.println("\tThis pathname doesn't exist");
            return;
        }
        File f = new File(s);
        // string array list hold all file's name of the current folder
        String[] list = f.list();
        int l = list.length, i;
        // if list.length = 0  means the current folder have no file
        if (l==0) System.out.println("\tThis pathname doesn't contain any file or directory");
        else {
            // print all files and directories name
            System.out.println("\tFiles are:");
            for (i = 0; i < l; i++) {
                System.out.println("\t\t"+list[i]);
            }
        }
    }
    
    // list file with condition
    void listFileSize(String s, int size) {
        // if pathname doesn't exist, show it to the user
        if (!isExist(s)) {
            System.out.println("\tThis pathname doesn't exist");
            return;
        }
        File f = new File(s);
        // file array files hold all files or directories of current folder
        File[] files = f.listFiles();
        int l = files.length, i=0,check=0;
        // if list.length = 0  means the current folder have no file
        if (l==0) System.out.println("\tThis pathname doesn't contain any file or directory");
        else {
            // print out all files that satisfy the condition
            System.out.println("\tFiles with size lareger than " + size +"Kb are:");
            for (i = 0; i < l; i++) {
                if (files[i].isFile() && files[i].length()/1024 > size) {
                    System.out.println("\t\t"+files[i].getName());
                    // if there is at least 1 file was found, check=1;
                    check=1;    
                }
            }
            // if check still is 0, it means that the current folder doesn't have files that satisfy the condition
            if (check==0) System.out.println("\tThis folder contains only folders or no such file with the condition was found");
        }
    }
    
    // count words in file
    int countWord(String s) {
        // if pathname doesn't exist, show it to the user
        if (!isExist(s)) {
            System.out.println("\tThis pathname doesn't exist");
            return -1;
        }
        try {
            File f = new File(s);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            // string line hold a line's content in the given text file
            String line;   
            // count hold the number of words in the given text file
            int count = 0;
            // read each line of the text file
            while ((line = br.readLine()) != null) {
                // split line into tokens (words)
                StringTokenizer st = new  StringTokenizer(line);    
                // count the number of words of each line
                while (st.hasMoreTokens()) {
                    // count words
                    count++;    
                    st.nextToken();
                }
            }
            fr.close();
            br.close();
            return count;
        } catch (Exception e) {
            return -1;
        }
    }
    
    // list all file with .java extension 
    void listJavaFile(String s) {
        if (!isExist(s)) {
            System.out.println("This path name isn't exist");
            return;
        }
        File f = new File(s);
        String[] fall = f.list();
        int l = fall.length, i;
        if (l==0) System.out.println("\tThis pathname doesn't contain any file or directory");
        else {
            int check = 0;
            System.out.println("\tFiles are:");
            for (i = 0; i < l; i++) {
                if (fall[i].endsWith(".java")) {
                    System.out.println("\t\t"+fall[i]);
                    check = 1;
                }
            }
            if (check == 0) System.out.println("\t\tThere is no such file with .java extension");
        }
    }
    
    // insert content to the file
    void appendText(String s){
        Scanner sc = new Scanner(System.in);
        String pn;
        do {            
            System.out.print("\tEnter pathname: ");
            pn = sc.nextLine();
            if (!isExist(pn)) System.out.println("\tThis path name isn't exist, please try again");
            if (!pn.endsWith(".txt")) System.out.println("\tYou just can write to a text file, enter a file with .txt extension");
        } while (!isExist(pn) || !pn.endsWith(".txt"));
        try {
            File f = new File(pn);
            FileWriter fw = new FileWriter(f.getName(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            System.out.println("\tSuccessfully");
        } catch (Exception e) {
        }
    }
}

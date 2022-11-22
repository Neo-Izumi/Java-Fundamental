/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoBasicIO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author VSIT
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException
    {
        File f = new File("../Basic Knowledge");
        String s = f.isDirectory() ? "folder" : "file";
        System.out.println("../Basic Knowledge is: " + s);
        String[] l = f.list();
        System.out.println("List files/folders: ");
        for (int i = 0; i < l.length; i++) {
            File f2 = new File(f,l[i]);
            System.out.println(l[i] + "  " + (f2.isFile() ? "file" : "folder"));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoBasicIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author VSIT
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException
    {
        File f = new File("f2.txt");
        System.out.println("File name: " + f.getName());
        System.out.println("Absolute File name: " + f.getAbsoluteFile());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Canonical Path: " + f.getCanonicalPath());
        System.out.println("The last modifying date: " + new Date(f.lastModified()));
        System.out.println("Hidden property: " + f.isHidden());
        System.out.println("Readable property: " + f.canRead());
        System.out.println("Writable property: " + f.canWrite());
        System.out.println("Size: " + f.length() + "byte(s)");
    }
}

package com.company;

import java.io.File;
import java.util.Scanner;

public interface FileReaderINT {
    static void FileReader() throws Exception {
        // pass the path to the file as a parameter
        File file =  new File("C:\\Users\\PC\\Desktop\\YetiTracker\\Test");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
    }
}}

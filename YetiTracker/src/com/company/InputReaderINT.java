package com.company;

import java.util.Scanner;

public interface InputReaderINT extends Runnable {


    static void Run() throws InterruptedException {

        for (;;) {
        int CurrentMode;
        Scanner scanner = new Scanner(System.in);
        CurrentMode =  scanner.nextInt();
        System.out.println("Mode: " + CurrentMode);

        }
    }  }


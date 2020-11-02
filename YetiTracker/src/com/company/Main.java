package com.company;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main extends DogWalker implements  FileReaderINT {




    public static int CurrentMode = 1;
    public static int getCurrentMode() {
        return CurrentMode;
    }

    public static void setCurrentMode(int currentMode) {
        CurrentMode = currentMode;
    }

    public static void main(String[] args) throws Exception {

        DogWalker Dog1 = new DogWalker();
        DogWalker.Coordinates.add(0,  "0");
        FileReaderINT F1 = new FileReader();


       // String motd = "Write 1,2,3 or 0";

      //  new Thread(() -> //{Main.run1(1);}).start();

      //  System.out.println(motd);

        for (int i = 0; i < 5; i++) {
            System.out.println(("Mode: " +CurrentMode));
            Dog1.DogWalker();
            System.out.println(Coordinates.indexOf(Coordinates.size()));
            Dog1.DogWriter2p0();
            FileReaderINT.FileReader();
            Dog1.DogWriter();
            TimeUnit.SECONDS.sleep(5);


            if (getCurrentMode()==1)
            {System.out.println("Another one bites the dust");}
            else if (getCurrentMode()==2) {Dog1.DogWriter();setCurrentMode(1);}
else if (getCurrentMode()==3) {FileReaderINT.FileReader();setCurrentMode(1); }
else if (getCurrentMode()==0) {System.exit(0);}




    }  }

   // @Override
    //public void run() {run1(1);

    //}

    //public static int run1(int CurrentMode) {for (;;) {

      //  Scanner scanner = new Scanner(System.in);
      // Main.CurrentMode =  scanner.nextInt();
       // System.out.println("Mode: " + Main.CurrentMode);
       // return Main.CurrentMode;

    }

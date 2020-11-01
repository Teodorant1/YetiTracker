package com.company;
import java.util.concurrent.TimeUnit;

public class Main extends DogWalker implements InputReaderINT, FileReaderINT {




    public static void main(String[] args) throws Exception {

        DogWalker Dog1 = new DogWalker();
        DogWalker.Coordinates.add(0,  "0");

        int CurrentMode = 1;
        String motd = "Write 1,2,3,4 or 0";

        new Thread(() -> {
            try {
                InputReaderINT.Run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        System.out.println(motd);

        for (;;) {
            System.out.println(("Mode: " +CurrentMode));
            Dog1.DogWalker();
            TimeUnit.SECONDS.sleep(5);


            if (CurrentMode>0 && CurrentMode<2)
            {System.out.println("Another one bites the dust");}
else if (CurrentMode>1 && CurrentMode<3) {FileReaderINT.FileReader();}
else if (CurrentMode>2 && CurrentMode<4) {Dog1.DogWriter();
TimeUnit.SECONDS.sleep(5);
System.exit(0);}


    }  }


    @Override
    public void run() {

    }
}
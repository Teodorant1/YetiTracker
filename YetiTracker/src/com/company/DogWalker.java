package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DogWalker {
   public static List<String> Coordinates = new ArrayList<String>();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public  int x =0;
   public  int y =0;
   int[] moves = {-3, -2, -1,0,1,2,3};
   public void DogWalker() {
       setX(getX()+ moves[new Random().nextInt(moves.length)]);
       setY(getY()+ moves[new Random().nextInt(moves.length)]);

       Coordinates.add((Coordinates.size()),((getX() + "." + getY())));

   System.out.println(getX()+","+getY());
   }


    public void DogWriter2p0() {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\PC\\Desktop\\YetiTracker\\Test2");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void DogWriter() throws FileNotFoundException {
        String fileName = ("C:\\Users\\PC\\Desktop\\YetiTracker\\Test");
        PrintWriter pw = new PrintWriter((fileName));
        Iterator<String> DogIterator = Coordinates.iterator();
        while (DogIterator.hasNext()) {
            pw.write(DogIterator.next());
        pw.close();
    }
    }



}

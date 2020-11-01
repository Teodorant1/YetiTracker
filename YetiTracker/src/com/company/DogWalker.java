package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DogWalker {
   public static List<String> Coordinates = new ArrayList<String>();
   public static int x =0;
   public static int y =0;
   int[] moves = {-3, -2, -1,0,1,2,3};
   public void DogWalker() {
       x=x+ moves[new Random().nextInt(moves.length)];
       y= y+ moves[new Random().nextInt(moves.length)];

       Coordinates.add(((x + "." + y)));
   System.out.println(x+","+y);
   }

    public void DogWriter() throws FileNotFoundException {
        String fileName = ("C:\\Users\\PC\\Desktop\\YetiTracker\\Test");
        PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
        Iterator<String> DogIterator = Coordinates.listIterator();
        while (DogIterator.hasNext()) {
            pw.println(DogIterator.next());
        pw.close();
    }
    }


}

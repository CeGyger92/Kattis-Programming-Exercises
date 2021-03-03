import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


public class CCT {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0; i < n;i++){
              ArrayList<String>[] quality = new ArrayList[10];
              for(int j = 0; j < 10;j++)
              {
                quality[j] = new ArrayList<String>();
              }

              int t = sc.nextInt();
              for(int j = 0; j < t; j++)
              {
                int qual = sc.nextInt();
                String breed = sc.next();
                if(qual >= 3)
                {
                  quality[qual-1].add(breed);
                }
              }
              for(int j = 0; j < 10;j++)
              {
                Collections.sort(quality[j]);
              }
              for(int j = 0; j < 10;j++)
              {
                if(quality[j].size() > 0)
                {
                  for(int k = 0; k< quality[j].size();k++)
                  {
                    System.out.print("" + (j+1) + " " + quality[j].get(k) + " ");
                  }
                }
              }
              System.out.print("\b");
              System.out.println();
            }

    }
}

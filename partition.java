import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;



public class partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = sc.nextInt() + 2;

        int list [] = new int [size];

        list[0] = 0;
        list[size-1] = n;

        for(int i = 1; i < size-1; i++)
        {
            list[i] = sc.nextInt();
        }

        List<Integer> parts = new ArrayList<Integer>();

        for(int i = 1; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                int item = list[i] - list[j];
                if(item > 0 && !parts.contains(item))
                {
                    parts.add(item);
                }
            }
        }
        Collections.sort(parts);
        for(int i = 0; i < parts.size(); i++)
        {
            System.out.print(parts.get(i));
            if(i != parts.size()-1)
            {
                System.out.print(" ");
            }
        }
     }
}
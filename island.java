import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;



public class island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            int islandCount = 0;
            int map[] = new int [12];
            sc.nextInt();
            for(int j = 0; j < 12; j++)
            {
                map[j] =sc.nextInt();
            }
            //System.out.print(Arrays.toString(map));
            for(int j = 1; j < 11; j++)
            {
                for(int k = j; k < 11;k++)
                {
                    boolean isIsland = true;
                    for(int l = j; l <= k; l++)
                    {
                        
                        
                            if(map[l] <= map[j-1] || map[l] <= map[k+1])
                            {
                                isIsland =false;
                            }
                       
                        //System.out.print(isIsland);
                        
                    }
                    if(isIsland)
                        {
                            islandCount++;
                        }
                    //System.out.println();
                }

            }
            System.out.println("" + (i+1) + " " + islandCount);
        }
        
        
     }
}
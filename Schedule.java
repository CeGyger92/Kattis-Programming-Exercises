import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Schedule{
    public static void main(String args []) throws IOException
    {
        Scanner sc = new Scanner(System.in);
           
            // try {
            //   File file = new File(args[0]);
            //   sc = new Scanner(file);
            // }catch(IOException e){
            //     System.out.println("I/O error");
            // }

            int n = sc.nextInt();
            
            while(n != 0)
            {
                double amTimes [] = new double [100];
                double pmTimes [] = new double [100];
                double noons [] = new double [100];
                double midnights [] = new double [100];
                int amCount = 0;
                int pmCount = 0;
                int noonCount = 0;
                int midnightCount =0;
                for(int i =0; i < n; i++)
                {
                    String time = sc.next();
                    String aP = sc.next();
                    String value = time.replace(":", ".");
                    if(aP.charAt(0) == 'a' && Double.parseDouble(value) < 12)
                    {
                        amTimes[i] = Double.parseDouble(value);
                        amCount++;
                    }else if(aP.charAt(0) == 'p' && Double.parseDouble(value) < 12){
                        pmTimes[i] = Double.parseDouble(value);
                        pmCount++;
                    }else if(aP.charAt(0) == 'a' && Double.parseDouble(value) >= 12)
                    {
                        midnights[i] = Double.parseDouble(value);
                        midnightCount++;
                    }else
                    {
                        noons[i] = Double.parseDouble(value);
                        noonCount++;
                    }
                }
                
                Arrays.sort(amTimes);
                Arrays.sort(pmTimes);
                Arrays.sort(noons);
                Arrays.sort(midnights);

                final DecimalFormat df = new DecimalFormat("#0.00");

                for(int i = midnights.length - (midnightCount); i < midnights.length; i++)
                {
                    System.out.println(df.format(midnights[i]).replace(".", ":") + " a.m.");
                }
                for(int i = amTimes.length - (amCount); i < amTimes.length; i++)
                {
                    System.out.println(df.format(amTimes[i]).replace(".", ":") + " a.m.");
                }
                for(int i = noons.length - (noonCount); i < noons.length; i++)
                {
                    System.out.println(df.format(noons[i]).replace(".", ":") + " p.m.");
                }
                for(int i = pmTimes.length - (pmCount); i < pmTimes.length; i++)
                {
                    System.out.println(df.format(pmTimes[i]).replace(".", ":") + " p.m.");
                }
                
                n = sc.nextInt();
                if(n != 0)
                {
                    System.out.println();
                }
            }
            

    }       //make two arrays for noons and print in reverse

}
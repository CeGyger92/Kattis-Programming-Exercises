import java.util.Scanner;

import java.util.Collections;

import java.util.ArrayList;



public class FastFood {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int iterations = sc.nextInt();
            

            for(int i =0; i < iterations;i++)
            {
                int numPrizes = sc.nextInt();
                int numTickets = sc.nextInt();
                int totalCash = 0;
                int tickets [] = new int [numTickets];
                int values [] = new int [numPrizes];
                ArrayList prizeTickets [] = new ArrayList [30];

                for(int x = 0; x < 30; x++)
                {
                    prizeTickets[x] = new ArrayList<Integer>();
                }
                


                for(int j = 0; j < numPrizes; j++)
                {
                    int typeTickets = sc.nextInt();
                    for(int l = 0; l < typeTickets; l++)
                    {
                        prizeTickets[j].add(sc.nextInt());
                    }
                    values[j] = sc.nextInt();
                   
                }

                for(int k = 0; k < numTickets; k++)
                {
                    tickets[k] = sc.nextInt();
                }

                for(int m = 0; m < numPrizes; m++)
                {
                    int smallest = tickets[(Integer)prizeTickets[m].get(0)-1];
                    for(int n = 0; n < prizeTickets[m].size();n++)
                    {
                       if(tickets[(Integer)prizeTickets[m].get(n)-1] < smallest)
                       {
                           smallest = tickets[(Integer)prizeTickets[m].get(n)-1];
                       }
                    }

                    totalCash += values[m] * smallest;
                }
                System.out.println(totalCash);
                
            }

        
        
     }
}
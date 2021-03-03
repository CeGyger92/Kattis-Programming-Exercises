import java.util.Scanner;

import java.util.Collections;

import java.util.ArrayList;



public class Mosquito {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            int m, p, l, e, r, s, n;

            while(!input.equals(""))
            {
                Scanner lineSC = new Scanner(input);
                m =lineSC.nextInt();
                p = lineSC.nextInt();
                l = lineSC.nextInt();
                e = lineSC.nextInt();
                r = lineSC.nextInt();
                s = lineSC.nextInt();
                n = lineSC.nextInt();

                for(int i = 0; i < n; i++)
                {
                    int tempM, tempP, tempL;
                    tempL = e*m;
                    tempP = l/r;
                    tempM = p/s;
                    m = tempM;
                    l = tempL;
                    p = tempP;
                }
                System.out.println(m);
                input = sc.nextLine();
            }
        
               
               
            
    }
}
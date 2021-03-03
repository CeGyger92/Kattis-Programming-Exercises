import java.util.Arrays;
import java.util.Scanner;



public class SortOf {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String line = "";
            int r = sc.nextInt();
            int c = sc.nextInt();


                       
            while(r != 0 && c != 0)
            {
                
                String names [] = new String[n];
                for(int i = 0; i < n; i++)
                {
                    names[i]= sc.nextLine();
                }
                boolean edited = false;
                do{
                    edited = false;
                    for(int i = 0; i < n-1; i ++)
                    {
                        if(names[i].substring(0,2).compareTo(names[i+1].substring(0,2)) > 0)
                        {
                            String temp = names[i];
                            names[i] = names[i+1];
                            names[i+1] = temp;
                            edited = true;
                        }
                    }
                }while(edited);

                for(int i = 0; i < n; i++)
                {
                    System.out.println(names[i]);
                }
                r = sc.nextInt();
                c = sc.nextInt();
                if(r != 0 && c != 0)
                {
                System.out.println();
                }
                
            }
            
     }
}
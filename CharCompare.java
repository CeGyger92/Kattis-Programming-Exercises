import java.util.Arrays;
import java.util.Scanner;



public class CharCompare {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String line = "";
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            sc.nextLine();

            while(r != 0 && c != 0)
            {
                String names [] = new String[c];
                for(int i = 0; i < c; i++)
                {
                    names[i] = "";
                }
                for(int j = 0; j < r; j++)
                {
                    
                    line = sc.nextLine();
                    
                    for(int i = 0; i < c; i++)
                    {
                        names[i] += Character.toString(line.charAt(i));
                    }
                }

                //System.out.println(Arrays.toString(names));
                    boolean edited = false;
                    do{
                        edited = false;
                        for(int i = 0; i < c-1; i ++)
                        {
                            
                            if(names[i].toLowerCase().compareTo(names[i+1].toLowerCase()) > 0)
                            {
                                String temp = names[i];
                                names[i] = names[i+1];
                                names[i+1] = temp;
                                edited = true;
                            }
                        }
                    }while(edited);

                    for(int i = 0; i < r; i++)
                    {
                       for(int j = 0; j < c; j++)
                       {
                        System.out.print(names[j].charAt(i));
                       }
                       System.out.println();
                    }
                    
                
                r = sc.nextInt();
                c = sc.nextInt();
                
                if(r != 0 && c != 0)
                {
                sc.nextLine();
                System.out.println();
                }
                
            }
            
     }
}
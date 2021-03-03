import java.util.Scanner;



public class Bela {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int iterations = sc.nextInt();
            String dominate = sc.next();
            int total = 0;
            for(int i =0; i < iterations;i++)
            {
                
                for(int j = 0; j < 4; j++)
                {
                    String temp = sc.next();
                    if(temp.charAt(0) == 'A')
                    {
                        total += 11;
                    }else if(temp.charAt(0) == 'K')
                    {
                        total += 4;
                    }else if(temp.charAt(0) == 'Q')
                    {
                        total += 3;
                    }else if(temp.charAt(0) == 'T')
                    {
                        total += 10;
                    }else if(temp.charAt(0) == 'J')
                    {
                        if(temp.charAt(1) == dominate.charAt(0))
                        {
                            total += 20;
                        }else{
                            total += 2;
                        }
                    }else if(temp.charAt(0) == '9')
                    {
                        if(temp.charAt(1) == dominate.charAt(0))
                        {
                            total += 14;
                        }
                    }
                }

            }
            System.out.println(total);        
        
     }
}
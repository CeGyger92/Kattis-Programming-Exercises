import java.util.Scanner;



public class Train {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int capacity = sc.nextInt();
            int n = sc.nextInt();
            int currentCapacity = 0;
            int peopleWaiting = 0;
            boolean possible = true;

            for(int i =0; i < n; i++)
            {
                currentCapacity -= sc.nextInt();
                if(currentCapacity > capacity || currentCapacity < 0)
                {
                    possible = false;
                }

                currentCapacity += sc.nextInt();
                if(currentCapacity > capacity || currentCapacity < 0)
                {
                    possible = false;
                }

                peopleWaiting = sc.nextInt();

                
                if(currentCapacity < capacity && peopleWaiting > 0)
                {
                    possible = false;
                }
                
            
            }
            if(currentCapacity != 0)
                {
                    possible = false;
                }
            if(peopleWaiting != 0)
                {
                    possible = false;
                }
           
            if(possible)
            {
                System.out.println("possible");
            }else{
               System.out.println("impossible");
            }
     }
}
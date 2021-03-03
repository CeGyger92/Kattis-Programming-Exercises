import java.util.Scanner;



public class Connect {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int stops = sc.nextInt();
            int distance = sc.nextInt();
            int currentTime = 0;
            int currentDistance = 0;
            int previous = 0;

            for(int i = 0; i < stops; i++)
            {
                int lightDistance = sc.nextInt();
                int red = sc.nextInt();
                int green = sc.nextInt();

                currentDistance += (lightDistance - previous);
                currentTime += (lightDistance - previous);
                if(currentTime < red)
                {
                    currentTime += (red - currentTime);
                }else{
                    
                    boolean isGreen = false;

                    int moded = currentTime % (red + green);
                    if(moded < red)
                    {
                        currentTime += (red - moded);
                    }
                }
                previous = lightDistance;
            }
            currentTime += (distance - currentDistance);
            System.out.println(currentTime);
            
     }
}
import java.util.Scanner;
import java.util.ArrayList;


public class ACM {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            ArrayList<Character> problems = new ArrayList<Character>();
            ArrayList<Integer> pointTotals = new ArrayList<Integer>();
            ArrayList<Boolean> solve = new ArrayList<Boolean>();
            
            for(int i = 0, charNum = 65; i < 26; i++, charNum++)
            {
                problems.add((char)charNum);                
            }
            for(int i = 0; i < 26; i++)
            {
                pointTotals.add(0);
            }
            for(int i = 0; i < 26; i++)
            {
                solve.add(false);
            }

            String line = "";
            line = sc.nextLine();
            do
            {
                
                Scanner lineScanner = new Scanner(line);
                int minutes = lineScanner.nextInt();
                String token = lineScanner.next();
                char problem = token.charAt(0);
                String solution = lineScanner.next();
                

                if(solution.contentEquals("right") && solve.get(problems.indexOf(problem)) == false)
                {
                    pointTotals.set(problems.indexOf(problem), pointTotals.get(problems.indexOf(problem)) + minutes);
                    solve.set(problems.indexOf(problem), true);
                    
                }
                if(solution.contentEquals("wrong") && solve.get(problems.indexOf(problem)) == false)
                {
                    pointTotals.set(problems.indexOf(problem), pointTotals.get(problems.indexOf(problem)) + 20);
                    
                }
                line = sc.nextLine();
                                                
            }while(!line.contentEquals("-1"));

            int problemsSolved = 0;
            int totalScore = 0;

            for(int i = 0; i < problems.size(); i++)
            {               
               
                if(solve.get(i) == true)
                {
                    problemsSolved++;
                    totalScore += pointTotals.get(i);
                }

            }

            System.out.println(problemsSolved + " " + totalScore);
        
            
     }
}
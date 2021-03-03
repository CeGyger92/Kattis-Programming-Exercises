import java.util.Arrays;
import java.util.Scanner;



public class Daylight {
    public static void main(String[] args) {
        String equation = "4/4*4+4";
        while(equation.contains("*") || equation.contains("/"))
        {
        
        String temp = "";
        for(int i = 0; i < equation.length(); i++)
        {
           if(equation.charAt(i) == '/' || equation.charAt(i) == '*' || equation.charAt(i) == '+' || equation.charAt(i) == '-')
           {                 
                temp += " " + equation.charAt(i) + " ";  
           }else{
                temp += equation.charAt(i);
           }
        }
        equation = temp;
        System.out.println(equation); 
        String parts [] = equation.split(" ");
        System.out.println(Arrays.toString(parts));
        for(int i =0; i < parts.length;i++)
            {
                if(parts[i].equals("/"))
                {
                   int quotient = Integer.parseInt(parts[i-1]) / Integer.parseInt(parts[i+1]);
                   equation = "";
                   for(int j = 0; j < i-1; j++)
                   {
                       equation += parts[j];
                   }
                   equation += Integer.toString(quotient);
                   
                    for(int k = i+2; k < parts.length;k++)
                    {
                        equation += parts[k];
                    }
                   
                   break;
                }
                if( parts[i].equals("*"))
                {
                    int product = Integer.parseInt(parts[i-1]) * Integer.parseInt(parts[i+1]);
                   equation = "";
                   for(int j = 0; j < i-1; j++)
                   {
                       equation += parts[j];
                   }
                   equation += Integer.toString(product);
                   
                    for(int k = i+2; k < parts.length;k++)
                    {
                        equation += parts[k];
                    }
                   
                   
                   break;
                }
            }
            System.out.println(equation);
        } 
        
        while(equation.contains("+") || equation.contains("-"))
        {
        
        String temp = "";
        for(int i = 0; i < equation.length(); i++)
        {
           if(equation.charAt(i) == '+' || equation.charAt(i) == '-')
           {                 
                temp += " " + equation.charAt(i) + " ";  
           }else{
                temp += equation.charAt(i);
           }
        }
        equation = temp;
        System.out.println(equation); 
        String parts [] = equation.split(" ");
        System.out.println(Arrays.toString(parts));
        for(int i =0; i < parts.length;i++)
            {
                if(parts[i].equals("-"))
                {
                   int difference = Integer.parseInt(parts[i-1]) - Integer.parseInt(parts[i+1]);
                   equation = "";
                   for(int j = 0; j < i-1; j++)
                   {
                       equation += parts[j];
                   }
                   equation += Integer.toString(difference);
                   
                    for(int k = i+2; k < parts.length;k++)
                    {
                        equation += parts[k];
                    }
                   
                   break;
                }
                if( parts[i].equals("+"))
                {
                    int sum = Integer.parseInt(parts[i-1]) + Integer.parseInt(parts[i+1]);
                   equation = "";
                   for(int j = 0; j < i-1; j++)
                   {
                       equation += parts[j];
                   }
                   equation += Integer.toString(sum);
                   
                    for(int k = i+2; k < parts.length;k++)
                    {
                        equation += parts[k];
                    }
                   
                   
                   break;
                }
            }
            System.out.println(equation);
        }
     }
}
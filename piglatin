// This code was contributed by https://github.com/voyager2005

import java.util.Scanner;
public class program_06
{
    public static void main(String args[])
    {
         //calling Scanner class
         Scanner sc = new Scanner(System.in);
        
         //prompting user to enter a String 
         System.out.println("please enter a String : ");
         String s = sc.nextLine() ;
         
         //converting string s into uppercase
         s = s.toUpperCase() ; 
         
         //declaration and initialisation 
         String remains = "" ;  
        
         // display statement 
         // loop to convert into piglatin form 
         for(int i = 0 ; i < s.length() ; i++ )
         {
            char ch = s.charAt(i);
            
            //checking if it is a vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
               {
                   System.out.print(s.substring(i));
                   break ; 
               }
               
            remains = remains + ch ;   
         }
        
        
         //Display statement
         System.out.println(remains + "AY");
    }
}

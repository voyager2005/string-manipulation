// this is a program that increments the value of each vowel in a string
// This code was contributed by https://github.com/voyager2005

import java.util.Scanner;
public class program_01
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc =  new Scanner(System.in);
        
        ////prompting and accepting value from the user 
        System.out.println("Please enter a String : ");
        String s = sc.nextLine().trim();
        
        //declaration and initialisation 
        String word = "" ; 
        
        //loop to print the desierd output 
        for(int i = 0 ; i < s.length() ; i++)
        {
            //extracting the character
            char ch = s.charAt(i);
            
            //checking if the character is upper case
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch); 
            }
            
            //checking if the character is a vowel 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                ch++ ; 
            }
            
            //adding the character to word variable 
            word  = word + ch ; 
        }
        
        //display statement 
        System.out.println(word);
    }
}

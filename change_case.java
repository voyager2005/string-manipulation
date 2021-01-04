// This code was contributed by https://github.com/voyager2005

import java.io.* ; 
import java.util.Scanner ; 
public class program_07
{
    public static void main(String args[])
    {
        //calling Scaner class
        Scanner sc = new Scanner(System.in);
        
        //promptin and accepting value from the user
        System.out.println("Please enter the String : ");
        String s = sc.nextLine().trim() ; 
        
        //appending space at the end of teh String
        s = s + " " ; 
        
        //declaration and initilization 
        String result = "" ; 
        String word = "" ; 
        
        //loop to print as question desiered 
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i) ; 
            
            //checking if the Character is upper case or lower case and converting them 
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch); 
            }
            else if(Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch) ; 
            }
            
            //checing if character is not a space
            if(ch != ' ')
            {
                word = word + ch ; 
            }
            else
            {
                //appending word to result variable 
                result = result + word + " " ; 
                
                //re-initilizing word to ""
                word = "" ; 
            }
        }
        
        //display statement
        System.out.println(result);
    }
}

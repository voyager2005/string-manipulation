// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class progarm_04
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc= new Scanner(System.in);
        
        //prompting and accepting valu from the user 
        System.out.println("Please enter a String : " );
        String s = sc.nextLine().trim();
        
        //apending Space at the and of string s
        s = s + " " ;
        
        //declaration ad initialisation 
        String word = "" ; 
        char UpperCase ; 
        String result = "" ;
        
        //loop that prints the desiered output
        for(int i = 0 ; i< s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            //checking if the character is not a space
            if(ch != ' ')
            {
                word = word + ch  ; 
            }
            else
            {
               //taking the first character and storing in variable UpperCase
               UpperCase = word.charAt(0);
               
               //converting variable UpperCase to upper case
               UpperCase = Character.toUpperCase(UpperCase);
               
               //Adding the uppercase variable to the remaining word other than the first character
               word = UpperCase + word.substring(1);
               
               //adding word to result variable  
               result = result + word + " "; 
               
               //re-initialising word to ""
               word =  "" ; 
            }
        }
        
        //display statement 
        System.out.println(result);
    }
}

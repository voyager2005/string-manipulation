// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class program_02
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc =  new Scanner(System.in);
        
        ////prompting and accepting value from the user 
        System.out.println("Please enter a String : ");
        String s = sc.nextLine().trim();
        System.out.println("Please enter the word you want to search : ");
        String key = sc.nextLine().trim();
        
        //declaration and initialisation 
        String word = "" ;
        int frequency = 1 ;
        
        //apending space to string s 
        s = s + " " ; 
        
        //loop to find the frequency of the word
        for (int i = 1 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i) ;
            
            if(ch != ' ')
            {
                word = word + ch ;
            }
            else if ( ch == ' ')
            {
                if(word.equalsIgnoreCase(key))
                {
                    frequency++ ;
                    word = "" ;
                }
                word = "" ; 
            }
        }
        
        //display statement
        System.out.println(key + " repeats " + frequency + " times in : " + s);
    }
}

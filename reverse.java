// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class program_09
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);
        
        //prompting user to rnter a string 
        System.out.println("please enter a string");
        String s = sc.nextLine();
        
        //display statement
        System.out.println("The characters in reverse order is : ");
        
        //for loop to print the characters in reverse order 
        for(int i = s.length() -1 ; i >= 0 ; i--)
        {
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
}

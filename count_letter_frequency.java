// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class program_08
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);
        
        //prompting and accepting vlaue from the user
        System.out.println("Please enter a string : ");
        String s = sc.nextLine().trim(); 
        
        //apending space
        s = s + " " ; 
        
        //declaration and initialisation 
        int count = 0 ; 
        
        //loop to find the desiered output
        for(char key = ' ' ; key <= 'z' ; key++)
        {
            //loop to fing the freuency of key in s 
            int frequency = 0 ; 
            for(int j = 0 ; j < s.length() ; j++ )
            {
                char ch = s.charAt(j);
                if(key == ch)
                {
                    frequency++ ; 
                }
            }
            if(frequency > 0)
            {
                    System.out.println(key + "\t" + frequency);
                    count++ ; 
            }
        }
        
        //display statement 
        System.out.println("there are "+count+" different alphabets in : "+s); 
    }
}

import java.util.Scanner;
public class program_13
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);
        
        //declaration and initialisation 
        String ans = "James Gosling";
        
        //checking if the answer is correct
        for(int i = 1 ; i <= 3 ; i++)
        {
            //prompting user to enter the answer
            System.out.println("Who is the inventor of java?");
            String s = sc.nextLine().trim(); 
        
            if(s.equalsIgnoreCase(ans))
            {
                System.out.println("YES!! "+s+" is the correct answer!!");
                System.exit(0);
            }
            else
            {
                System.out.println("NO "+s+" is not the correct answer :(");
            }
        }
        
        //display statement 
        System.out.println(ans+" is the correct answer");
    }
}

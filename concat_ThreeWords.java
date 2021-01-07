import java.util.Scanner; 
public class program_10
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);
        
        //prompting user to rnter a string 
        System.out.println("please enter 3 strings : ");
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();
        
        //declaration and initialisation
        s1 = s1 + " " ;  
        s2 = s2 + " " ;
        s3 = s3 + " " ;
        String finalConcat = s1.concat(s2).concat(s3);
        
        //display statement
        System.out.println("The concat of the three strings is : "+ finalConcat);
    }
}

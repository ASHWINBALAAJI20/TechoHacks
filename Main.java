import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int r=rand.nextInt(101);
       int t=1;
       while(t==1)
       {
           System.out.println("Enter a number:");
           int u=sc.nextInt();
           if(u>r)
           {
               System.out.println("The number "+u+" you have entered is greater. Try again");
           }
           else if(u<r)
           {
               System.out.println("The number "+u+" you have entered in lesser. Try agin");
           }
           else{
               System.out.println("You have guessed the number correctly.Congratulations!!!.");
               break;
           }
           
       }
    }
}
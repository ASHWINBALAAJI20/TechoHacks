import java.util.Scanner;
public class Calci
{
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    public static void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    public static void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void rem(int a,int b)
    {
        System.out.println(a%b);
    }
    public static void powe(int base,int exponent)
    {
        System.out.println(Math.pow(base,exponent));
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int r=1;
	while(r==1)
	{
	    System.out.println("Enter the first Number");
	    int n=sc.nextInt();
	    System.out.println("Enter the second Number");
	    int n1=sc.nextInt();
	    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Power");
	    System.out.println("Enter the choice");
	    int choice=sc.nextInt();
	    switch(choice)
	    {
	        case 1:
	            add(n,n1);
	            break;
	       case 2:
	           sub(n,n1);
	           break;
	       case 3:
	           mul(n,n1);
	           break;
	       case 4:
	           div(n,n1);
	           break;
	       case 5:
	           rem(n,n1);
	           break;
	       case 6:
	           powe(n,n1);
	           break;
	       default:
	       System.out.println("Invalid Choice");
	    }
	    System.out.println("Enter 1 to continue 0 to exit");
	    r=sc.nextInt();
	}
	}
}
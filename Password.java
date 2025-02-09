import java.util.Scanner;
public class Password {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many random password do you want?");
        int tot=sc.nextInt();
        System.out.println("How many characters do you want in each password?");
        int len=sc.nextInt();
        String[] st=new String[tot];
        for(int i=0;i<tot;i++)
        {
            String rpass="";
            for(int j=0;j<len;j++)
            {
                rpass+=randomCharacter();
            }
            st[i]=rpass;
        }
        print(st);
        System.out.println(passstrength(len));


    }
    public static String passstrength(int length)
    {
        if(length<5)
        {
            return "weak";
        }
        else if(length<10)
        {
            return "medium";
        }
        else
        {
            return "strong";
        }
    }

    public static void print(String[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static char randomCharacter()
    {
        int rand=(int)(Math.random()*62);
        if(rand<=9)
        {
            int as=rand+48;
            return (char)(as);
        }
        else if(rand<=35)
        {
            int as=rand+55;
            return (char)(as);
        }
        else
        {
            int as=rand+61;
            return (char)(as);
        }
    }
}

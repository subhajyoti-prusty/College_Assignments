import java.util.*;
public class p2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0;
        String s="";
        while(n>0)
        {
            int r=n%2;
            s=r+s;
            n=n/2;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        if(c%2!=0)
        {
            System.out.println("The parity of the number is 1");
        }
        else
        {
            System.out.println("The Parity of the number is 0");
        }
    }
}
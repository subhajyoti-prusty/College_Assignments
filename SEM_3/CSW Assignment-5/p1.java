import java.util.*;
public class p1
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
        System.out.println("Number of one bit is "+c);
    }
}
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		int i,j,n=0,c=0,rev=0,p=0;
		int op=a;
		for(i=1;i<=a;i++) {
			if(a%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("prime");
			}
		else
			System.out.println("Not Prime");
	while(a>0) {
		n=a%10;
		rev=rev*10+n;
		a=a/10;
		
	}System.out.println(rev);
	
	for(j=1;j<=rev;j++) {
		if(rev%j==0) {
			p++;
		}
	}
	if(p==2) {
		System.out.println("Prime");
		}
	else
		System.out.println("Not Prime");
	if(c==p) {
		System.out.println(op+" is twisted prime.");
	}
	else
		System.out.println(op+" is not a twisted prime.");
	
	}

}

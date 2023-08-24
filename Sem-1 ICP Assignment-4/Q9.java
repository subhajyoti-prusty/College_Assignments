import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int x,n=0,m=1;
		while(num>0) {
			x=num%10;
			num=num/10;
		
		if(x!=0) {
			n=n+x*m;
			m=m*10;
		
		}
		
	}
		System.out.println(""+ n);
}


}

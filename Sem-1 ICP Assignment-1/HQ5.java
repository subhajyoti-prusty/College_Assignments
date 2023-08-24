
public class HQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=1;
		int G=2;
		int K=3;
		int A=4;
		
		//Using Variables 
		int a=W;
		int b=G;
		int c=K;
		int d=A;
		
		A=a;
		K=d;
		G=c;
		W=b;
		
		System.out.println(A);
		System.out.println(K);
		System.out.println(G);
		System.out.println(W);
			
		//Without Using Variables 
		W=W+G+A+K;
		A=W-(G+A+K);
		System.out.println(A);
		
		

	}

}

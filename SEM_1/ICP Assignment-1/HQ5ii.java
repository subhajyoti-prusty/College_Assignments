
public class HQ5ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W=1;
		int G=2;
		int K=3;
		int A=4;
		
		//Without Using Variables 
				W=W+G+A+K;
				A=W-(G+A+K);
				K=(K+A);
				G=W-(K+A+G);
				W=W-(A+K+G);
				System.out.println(A);
				System.out.println(K);
				System.out.println(G);
				System.out.println(W);

	}

}

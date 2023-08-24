
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//6(A)	
		for(int row = 0;row<5;row++) {
			for(int col =0;col<=row;col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	//6(B)
		for(int row = 1;row<6;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print(" "+row+" ");
			}
			System.out.println();
		}
	//6(C)
		int count=1;
		for(int row = 1;row<6;row++) {
			for(int col =1;col<=row;col++) {
					System.out.print(" "+count+" ");
					count++;
				}
			System.out.println();
		}

	//6(D)
		for(int row = 0;row<6;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print(" "+col+" ");
			}
			System.out.println();
		}
	}
}

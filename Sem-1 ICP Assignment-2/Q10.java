
public class Q10 {

	public static void main(String[] args) {
		int low,high,r1,r2,sum;
		low=Integer.parseInt(args[0]);
		high=Integer.parseInt(args[1]);
		r1=(int)(Math.random()*(high-low+1)+low);
		r2=(int)(Math.random()*(high-low+1)+low);
		sum=r1+r2;
		System.out.println("1st Random No.: "+r1);
		System.out.println("2nd Random No.: "+r2);
		System.out.println("The sum of two is: "+sum);
		
	}

}

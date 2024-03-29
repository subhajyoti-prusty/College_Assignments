
public class Q8 {

	public static void main(String[] args) {
		int dividend,divisor,quoitent,remainder;
		dividend=Integer.parseInt(args[0]);
		divisor=Integer.parseInt(args[1]);
		remainder=dividend%divisor;
		System.out.println("Remainder is "+remainder);
		quoitent=dividend/divisor;
		System.out.println("Quoitent is "+quoitent);

	}

}

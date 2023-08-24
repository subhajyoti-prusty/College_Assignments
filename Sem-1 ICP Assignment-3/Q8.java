import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the cordinates of the point: ");
				double x = s.nextDouble();
				double y = s.nextDouble();
				if(x > 0 && y > 0) {
					System.out.print("(" + x + "," + y +")" + " is in quadrant 1");
				}
				else if(x < 0 && y < 0) {
					System.out.print("(" + x + "," + y +")" + " is in quadrant 3");	
				}
				else if(x < 0 && y > 0) {
					System.out.print("(" + x + "," + y +")" + " is in quadrant 2");
				}
				else if(x > 0 && y < 0) {
					System.out.print("(" + x + "," + y +")" + " is in quadrant 4");	
				}
				else if(x == 0 && y != 0) {
					System.out.print("(" + x + "," + y +")" + " is on y axis");
				}
				else if(x != 0 && y == 0) {
					System.out.print("(" + x + "," + y +")" + " is on x axis");
				}
				else if(x == 0 && y == 0) {
					System.out.print("(" + x + "," + y +")" + " is the origin");
				}
			}
	}



package DSA_PROJECT;
import java.util.Scanner;
class Address {
    String HouseNo;
    String street;
    String city;
    String state;
    String country;
    int pinCode;
    void Setaddress() {
        System.out.println("-----------Enter your complete Address-----------");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your HouseNo: ");
        HouseNo=sc.next();
        System.out.print("Enter your Country: ");
        country=sc.next();
        System.out.print("Enter your State: ");
        state=sc.next();
        System.out.print("Enter your City: ");
        city=sc.next();
        System.out.print("Enter your Street Name: ");
        street=sc.next();
        System.out.print("Enter your Pincode: ");
        pinCode=sc.nextInt();
    }
    void getaddress() {
        System.out.println("country: "+country);
        System.out.println("State: "+state);
        System.out.println("City: "+city);
        System.out.println("PIN: "+pinCode);
        System.out.println("House no: "+HouseNo);
        System.out.println("street no:"+street);
    }
}
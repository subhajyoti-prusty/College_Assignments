package DSA_PROJECT;
import java.util.Scanner;
class Date extends Address{
    int day;
    int month;
    int year;
    void Setdate() {
        Scanner sc=new Scanner(System.in);
        System.out.println("----------Enter the Joining Details----------");
        System.out.print("enter date of joining in the form of DD MM YYYY ");
        day=sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
    }
    void getdate() {
        System.out.println(day+"/"+month+"/"+year);
    }
}
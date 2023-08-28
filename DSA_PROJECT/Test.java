package DSA_PROJECT;
import java.util.Scanner;
public class Test {
    public static void arrangeEmployeeBySalary(Employee obj[]) {
        for(int i=0;i<obj.length;i++) {
            for(int j=0;j<obj.length-1-i;j++) {
                if((obj[j].salary) < (obj[j+1].salary)){
                    Employee temp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=temp;
                }
            }
        }
        for(int i=0;i<obj.length;i++) {
            obj[i].Employee_details();
        }
    }
    public static void getEmployeesByJobPosition(Employee obj[], String jp) {
        for(int i=0;i<obj.length;i++) {
            if(obj[i].Jobposition==jp) {
                obj[i].Employee_details();
            }
            else
                System.out.println("Data not found");
        }
    }
    public static void getEmployeesByHireDate(Employee obj[], Date d1, Date d2) {
        for(int i=0;i<obj.length;i++) {
            if(obj[i].day >=d1.day && obj[i].day<=d2.day) {
                if(obj[i].year==d1.year) {
                    int month=obj[i].month;
                    if(month>=4&&month<=12){
                        obj[i].Employee_details();
                    }
                }
                else if(obj[i].year==d2.year) {
                    int month=obj[i].month;
                    if(month>=1&&month<=3) {
                        obj[i].Employee_details();
                    }
                }
            }
        }
    }
    public static int foreignEmployeeCount(Employee e[]) {
        int count=0;
        String str=null;
        for(int i=0;i<e.length;i++) {
            str= (String) e[i].contactNumber.subSequence(0, 2);
            if(str.equals("+1")) {
                count++;
            }
        }
        return count;
    }
    public static void getEmployeesBySalary(Employee e[], double s1, double s2) {
        for(int i=0;i<e.length;i++) {
            if(e[i].salary>=s1&&e[i].salary<=s2) {
                e[i].Employee_details();
            }
        }
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no of Employee for which you want to store data");
        int n  = ob.nextInt();
        Employee[] obj=new Employee[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<obj.length;i++) {
            System.out.println("Enter details of employee no: "+(i+1));
            System.out.print("Enter name: ");
            String name=sc.next();
            System.out.print("Enter Employee Id: ");
            int empid=sc.nextInt();
            System.out.print("Enter salary: ");
            double salary=sc.nextDouble();
            System.out.print("Enter Job_Position: ");
            String jp=sc.next();
            System.out.print("Enter Contact_Number: ");
            String ContactNumber=sc.next();
            obj[i]=new Employee(name,empid,salary,jp,ContactNumber);
            obj[i].Setaddress();
            obj[i].Setdate();
        }
        System.out.println("a:-Display the employee details in descending order by salary:");
        System.out.println("b:-Display the details of employees whose jobPosition is manager:");
        System.out.println("c:-Display the details of employees whose hireDate is between 01-04-2022 to 31-03-2023:");
        System.out.println("d:-Find the number of foreign employee:");
        System.out.println("e:-Display the details of employees whose salary is in a range 150000 INR to 300000 INR:");
        System.out.print("Enter your choice: ");
        char choice=sc.next().charAt(0);
        switch(choice) {
            case 'a':
                System.out.println("The employee details in descending order by salary:");
                arrangeEmployeeBySalary(obj);
                break;
            case 'b':
                System.out.println("The details of employees whose jobPosition is manager:");
                getEmployeesByJobPosition(obj,"Manager");
                break;
            case 'c':
                Date ob1=new Date();
                ob1.day=1;
                ob1.month=4;
                ob1.year=2022;
                Date ob2 =new Date();
                ob2.day=31;
                ob2.month=3;
                ob2.year=2023;
                System.out.println("The details of the employees whose hiredate is between  01-04-2022 to 31-03-2023: ");
                getEmployeesByHireDate(obj,ob1,ob2);
                break;

            case 'd':
                System.out.println("The total number of foreign employees are "+foreignEmployeeCount(obj));
                break;
            case 'e':
                System.out.println("The details of employees whose salary is in a range 150000 INR to 300000 INR:");
                getEmployeesBySalary(obj,15000,30000);
        }
    }
}
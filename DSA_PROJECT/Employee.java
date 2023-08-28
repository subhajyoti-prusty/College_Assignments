package DSA_PROJECT;
class Employee extends Date {
    String name;
    int empId;
    double salary;
    Date Hiredate;
    String Jobposition;
    String contactNumber;
    Address address;
    Employee(String name,int empId, double salary, String Jobposition, String contactNumber){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.Jobposition=Jobposition;
        this.contactNumber=contactNumber;
    }
    void Employee_details() {
        System.out.println("============== Employee Details==============");
        System.out.println("Name: "+name);
        System.out.println("Employee_Id: "+empId);
        System.out.println("Salary: "+salary);
        System.out.println("Job Position: "+Jobposition);
        System.out.println("Contact Number: "+contactNumber);
        super.getaddress();
        super.getdate();
    }
}

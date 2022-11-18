import java.util.Scanner;

public class Employee {
    private String myName;
    private int myEmployeeid;
    private double myWage;
    private boolean fullTime;
    Employee(String myName,int myEmployeeid,double myWage,boolean fullTime){
        this.myName=myName;
        this.myEmployeeid=myEmployeeid;
        this.myWage=myWage;
        this.fullTime=fullTime;
    }
    String Accessor(){
       return getName();
    }

    private String getName() {
        return null;
    }
    int Mutator(){
       return setEmployeeid();
    }

    private int setEmployeeid() {
        return myEmployeeid;
    }

    double Wage(){
        return myWage;
    }
    private double myWage(){
        return myWage();
    }


    void printDetails(){
        if(fullTime==true) {
            System.out.println("Employee Name:- "+myName+"\tEmployee id:-"+myEmployeeid+"\tEmployee Wage:-"+myWage+"\tEmployee is full time");
        }
        else {
            System.out.println("Employee Name:-"+myName+"\tEmployee id:-"+myEmployeeid+"\tEmployee Wage:-"+myWage+"\tEmployee is not a full time");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name ");
        String myName =sc.next();
        System.out.println("Enter the employee id ");
        int myEmployeeid = sc.nextInt();
        System.out.println("Enter the wage of employee");
        double myWage= sc.nextDouble();
        System.out.println("Enter True or False");
        boolean fullTime=sc.hasNextBoolean();
        Employee e = new Employee(myName,myEmployeeid,myWage,fullTime);
        e.Accessor();
        e.Mutator();
        e.Wage();
        e.printDetails();

    }
}
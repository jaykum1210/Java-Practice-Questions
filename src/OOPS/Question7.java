package OOPS;

class Employee{
    static String companyName = "TechCorp";
    String empName;
    Employee(String empName){
        this.empName = empName;
    }
    public void display(){
        System.out.println(empName + " Works at " + companyName);
    }
}

public class Question7 {
    public static void main(String[] args){
        Employee emp = new Employee("Jay");
        emp.display();
    }
}

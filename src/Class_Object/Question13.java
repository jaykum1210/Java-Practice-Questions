package Class_Object;

class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}

public class Question13 {
    public static void main(String[] args){
        Employee emp = new Employee("Jay",1000000);
        System.out.println("Name : " + emp.name);
        System.out.println("Salary : " + emp.salary);
    }
}

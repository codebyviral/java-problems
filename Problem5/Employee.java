class EmployeeClass {
    String name;
    String address;
    double salary;
    String title;

    EmployeeClass(String name, String address, double salary, String title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.title = title;
    }

    void show() {
        System.out.println(this.name + " of " + address + " has a basic salary of " + this.salary
                + " & is an " + this.title);
    }
}

class Manager extends EmployeeClass {

    Manager(String name, String address, double salary, String title) {
        super(name, address, salary, title);
    }

    void show() {
        double incrementedSalary = this.salary + (this.salary * 0.10);
        System.out.println(this.name + " of " + address + " has an initial salary of " + this.salary
                + " & after an increment of 10%, the final salary is " + incrementedSalary + " & is a " + this.title);
    }
}

class Developer extends EmployeeClass {

    Developer(String name, String address, double salary, String title) {
        super(name, address, salary, title);
    }

    void show() {
        double incrementedSalary = this.salary + (this.salary * 0.08);
        System.out.println(this.name + " of " + address + " has an initial salary of " + this.salary
                + " & after an increment of 8%, the final salary is " + incrementedSalary + " & is a " + this.title);
    }
}

public class Employee {
    public static void main(String[] args) {
        System.out.println("Viral Vaghela 23BIT224");
        EmployeeClass employee = new EmployeeClass("Viral", "Gandhinagar", 28000.00, "Employee");

        Manager manager = new Manager("Rahul", "Ahmedabad", 50000, "Manager");
        Developer developer = new Developer("Aniket", "Vadodara", 100000, "Developer");

        employee.show();
        manager.show();
        developer.show();
    }
}
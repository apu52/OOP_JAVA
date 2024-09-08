import java.util.Scanner;


class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    String employeeId;
    double salary;

   
    Employee(String name, int age, String employeeId, double salary) {
        super(name, age);  
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        displayPersonInfo();  
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter employee's name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter employee's age: ");
        int age = sc.nextInt();
        sc.nextLine();  

        System.out.println("Enter employee's ID: ");
        String employeeId = sc.nextLine();
        
        System.out.println("Enter employee's salary: ");
        double salary = sc.nextDouble();

        
        Employee emp = new Employee(name, age, employeeId, salary);

        
        emp.displayEmployeeInfo();
        
        sc.close();
    }
}

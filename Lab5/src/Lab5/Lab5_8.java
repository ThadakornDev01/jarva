package Lab5;
import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Employee8 extends Person {
    protected double salary;

    public Employee8(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Lab5_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String sName = sc.next();
        int sId = sc.nextInt();
        
        String eName = sc.next();
        double eSalary = sc.nextDouble();

        Student s = new Student(sName, sId);
        Employee8 e = new Employee8(eName, eSalary);

        Person[] people = {s, e};

        for (Person p : people) {
            if (p instanceof Employee8) {
                Employee8 emp = (Employee8) p;
                emp.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        sc.close();
	}

}

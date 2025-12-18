package Lab4;
import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        setHour(hour);
    }

    public void setHour(int newHour) {
        if (newHour >= 0 && newHour <= 23) {
            this.hour = newHour;
        } else {
            System.out.println("Error: Invalid hour (" + newHour + "). Must be 0-23.");
            if (this.hour == 0) this.hour = 0; 
        }
    }

    public int getHour() {
        return this.hour;
    }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule.getHour());
    }

    public void displaySchedule() {
        System.out.println(this.name + ": " + this.schedule.getHour() + ":00");
    }
}

public class Lab4_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int startHour = scanner.nextInt();
        int newHour = scanner.nextInt();

        Schedule sch1 = new Schedule(startHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);

        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();
	}

}

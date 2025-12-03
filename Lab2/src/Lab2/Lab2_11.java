package Lab2;
import java.util.Scanner;

class Car {
    private String model;
    private int year;

    	public Car(String model, int year) {
    		this.model = model;
    		this.year = year;
    	}
    		public String getModel() {
    			return model;
    		}
    			public int getYear() {
    				return year;
    			}
    				public void setYear(int newYear) {
    					this.year = newYear;
    				}
		}

public class Lab2_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String inputModel = scanner.nextLine();
        	int inputYear = scanner.nextInt();
        	int updateYear = scanner.nextInt();

        Car car = new Car(inputModel, inputYear);
        	car.setYear(updateYear);

        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        scanner.close();
	}
}

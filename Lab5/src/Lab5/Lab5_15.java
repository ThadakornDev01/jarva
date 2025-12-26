package Lab5;
import java.util.Scanner;

class RentalVehicle15 {
    protected String model;
    protected double rentalRate;

    public RentalVehicle15(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car15 extends RentalVehicle15 {
    public Car15(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle15 extends RentalVehicle15 {
    public Motorcycle15(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String cModel = sc.nextLine();
        double cRate = sc.nextDouble();

        sc.nextLine(); 

        String mModel = sc.nextLine();
        double mRate = sc.nextDouble();

        Car15 car = new Car15(cModel, cRate);
        Motorcycle15 moto = new Motorcycle15(mModel, mRate);

        RentalVehicle15[] vehicles = {car, moto};

        double totalFee = 0;
        for (RentalVehicle15 v : vehicles) {
            totalFee += v.calculateFee();
        }

        System.out.println(totalFee);

        sc.close();
	}
}

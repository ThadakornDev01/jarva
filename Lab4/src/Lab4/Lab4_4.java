package Lab4;
import java.util.Scanner;

class Location1 {
	private double latitude;
	private double longitude;
	
	public Location1(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Location1(Location1 other) {
		this.longitude = other.longitude;
		this.latitude = other.latitude;
	}
	
	public void setLatitude(double newLat) {
		this.latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println("Lat : " + latitude + ", Lon :" + longitude);
	}
}

public class Lab4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double startLat = scanner.nextDouble();
		double startLon = scanner.nextDouble();
		double newLat = scanner.nextDouble();
		
		Location1 loc1 = new Location1(startLat, startLon);
		
		Location1 loc2 = new Location1(loc1);
		
		loc1.setLatitude(newLat);
		
		loc1.displayInfo();
		loc2.displayInfo();
		
		scanner.close();
	}

}

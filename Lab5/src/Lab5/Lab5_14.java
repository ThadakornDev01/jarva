package Lab5;
import java.util.Scanner;

	class Shipping14 {
	 protected String trackingId;
	 protected double baseFee;
	
	 public Shipping14(String trackingId, double baseFee) {
	     this.trackingId = trackingId;
	     this.baseFee = baseFee;
	 }
	
	 public double calculateTotalFee() {
	     return baseFee;
	 	}
	}

	class StandardShipping14 extends Shipping14 {
	 public StandardShipping14(String trackingId, double baseFee) {
	     super(trackingId, baseFee);
	 }
	
	 @Override
	 public double calculateTotalFee() {
	     return baseFee * 1.05;
	 	}
	}

	class PremiumShipping14 extends Shipping14 {
	 protected double insuranceFee;
	
	 public PremiumShipping14(String trackingId, double baseFee, double insuranceFee) {
	     super(trackingId, baseFee);
	     this.insuranceFee = insuranceFee;
	 }
	
	 @Override
	 public double calculateTotalFee() {
	     return super.calculateTotalFee() + insuranceFee;
	 }
}

public class Lab5_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String sId = sc.nextLine();
        double sFee = sc.nextDouble();

        sc.nextLine(); 

        String pId = sc.nextLine();
        double pFee = sc.nextDouble();
        double pIns = sc.nextDouble();

        StandardShipping14 s1 = new StandardShipping14(sId, sFee);
        PremiumShipping14 p1 = new PremiumShipping14(pId, pFee, pIns);

        Shipping14[] shipments = {s1, p1};

        for (Shipping14 s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
	}

}

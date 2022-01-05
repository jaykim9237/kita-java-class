package day12.shipping;

import java.io.File;
import java.io.PrintStream;

public class ShippingMain {

	public static void main(String[] args) {
		Company c = Company.getinstance();
		
		c.addVehicle(new Truck(10000.0));
		c.addVehicle(new Truck(15000.0));
		c.addVehicle(new RiverBarge(500000.0));
		c.addVehicle(new Truck(9500.0));
		c.addVehicle(new RiverBarge(750000.0));
		
		FuelNeedsReport report = new FuelNeedsReport();
		File file = new File("report.txt");

		PrintStream out = new PrintStream(file);
		
		report.generateText(System.out);
	}

}

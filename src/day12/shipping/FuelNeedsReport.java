package day12.shipping;

import java.io.PrintStream;

public class FuelNeedsReport {
		public void generateText(PrintStream output){
			//나 싱글턴 공부를 너무 안했군...
			//
			Company c = Company.getinstance();
			double total_fuel = 0.0;
			
			for(int i = 0; i < c.getFleetSize(); i++) {
				Vechicle v = c.getVehicle(i);
				double fuel = v.calcFuelNeeds();
				output.printf("Vechicle [%s] needs %.2f liters of fuel.%n",v.getName(),fuel);
				total_fuel += fuel;
			}
		
		output.printf("Total fuel needs is %.2f liters%n", total_fuel);
		}
}

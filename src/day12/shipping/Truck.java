package day12.shipping;

public class Truck extends Vechicle {

		private String capa;
		
		public Truck(Double max_load) {
			capa = max_load + "kg";
		}
	@Override
	public double calcTripDistance() {
		return 100.0;
	}

	@Override
	public double calcFuelEfficiency() {
		return 8.1;
	}

	@Override
	public String getName() {
		return "Truck";}

}

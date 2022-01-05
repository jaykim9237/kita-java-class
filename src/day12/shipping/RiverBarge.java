package day12.shipping;

public class RiverBarge extends Vechicle {

	private String capa;
	
	public RiverBarge(Double max_load) {
		capa = max_load + "kg";
	}
	@Override
	public double calcTripDistance() {
		return 50.0;
	}

	@Override
	public double calcFuelEfficiency() {
		return 5.2;
	}

	@Override
	public String getName() {
		return "RiverBarge";
	}

}

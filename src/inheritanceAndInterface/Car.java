package inheritanceAndInterface;

public class Car extends MotorVehicle implements Ownable{

	private double value;

	public Car(String model, double value) {
		super(model);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Car: " + model + " (value " + value + " euros)";
	}
	
}

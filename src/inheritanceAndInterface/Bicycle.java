package inheritanceAndInterface;

public class Bicycle implements Ownable {

	private String model;
	private double value;

	public Bicycle(String model, double value) {
		
		this.model = model;
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bicycle: " + getModel() + " (value " + value + " euros)";
	}
		
}

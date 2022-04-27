package inheritanceAndInterface;

public class MotorVehicle {
	
	protected String model;
	
	public MotorVehicle(String model) {
		
		this.model = model;
	
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MotorVehicle [model=" + model + "]";
	}

}

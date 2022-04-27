package inheritanceAndInterface;

public class GroupSet extends Component {

	private int gears;

	public GroupSet(String id, String name, int gears, double price) {
		super(id, name, price);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return id + ": " + name + " group set, " + gears + " gears, " + price + " euros";
	}

}

package by.tce.jonline.present;

public class Chocolate extends Sweet {
	
	public Chocolate() {
		
	}
	
	public Chocolate(String name, double price, double quantity) {
		super(name, price, quantity);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}

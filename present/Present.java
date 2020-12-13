package by.tce.jonline.present;

import java.util.ArrayList;
import java.util.List;

// Подарок

public class Present {
	private List <Sweet> sweets = new ArrayList<>();
	private Box box;
	
	public Present() {
		
	}
	
	public boolean addSweet(String name, double quantity) {
		Sweet sweet; 
		if (sweets.size()>9) {
			return false;
		}
		sweet = Logic.selectSweet(name, quantity);
		if(sweet.equals(null)) {
			return false;
		}
		sweets.add(sweet);
		setBox(sweets.size());
		return true;
	}
	
	public Box getBox() {
		return box;
	}
	
	public void setBox(int size) {
		box = Logic.selectBox(size);
	}

	public List<Sweet> getSweet() {
		return sweets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((box == null) ? 0 : box.hashCode());
		result = prime * result + ((sweets == null) ? 0 : sweets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Present other = (Present) obj;
		if (box == null) {
			if (other.box != null)
				return false;
		} else if (!box.equals(other.box))
			return false;
		if (sweets == null) {
			if (other.sweets != null)
				return false;
		} else if (!sweets.equals(other.sweets))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Present [sweets=" + sweets + ", box=" + box + "]";
	}

}

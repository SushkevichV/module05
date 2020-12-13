package by.tce.jonline.treasure;

import java.util.List;
import java.util.ArrayList;

/* Дракон и его сокровища
 * Класс описывает сокровищницу
 */

public class TreasureCave {
	private List<Treasure> treasures = new ArrayList<>(); // список сокровищ
	
	public TreasureCave() {
		
	}

	public boolean addTreasure(String treasureType, int teasureCost) {
		if(treasures.add(new Treasure(treasureType, teasureCost))) {
			return true;
		}
		return false;
	}
	
	public List<Treasure> getTreasureList(){
		return treasures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
		TreasureCave other = (TreasureCave) obj;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TreasureCave [treasures=" + treasures + "]";
	}
}

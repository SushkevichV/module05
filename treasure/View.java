package by.tce.jonline.treasure;

import java.util.List;

/* Дракон и его сокровища
 * Класс выводит на консоль 
 */

public class View {
	
	public static boolean showTreasures(List<Treasure> treasures){
		if(treasures.isEmpty()) {
			return false;
		} else {
			for(Treasure treasure : treasures) {
				System.out.println(treasure.getType() + " стоимостью "+ treasure.getCost());
			}
		}
		
		System.out.println();
		return true;
	}
	
}

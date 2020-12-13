package by.tce.jonline.present;

import java.util.List;

public class Logic {
	
	public static Sweet selectSweet(String name, double quantity) {
		SweetList sweets = new SweetList();
		if (name.matches("Конф.*")) {
			List<Candy> candy = sweets.getCandy(); // получаем список сладостей
			for(Candy c : candy) { // поиск в списке
				if(c.getName().equalsIgnoreCase(name)) { // если найден 
					c.setQuantity(c.getQuantity()-quantity); // изменяем остаток
					return new Candy(name, c.getPrice(), quantity); // добавляем в подарок
				} else {
					return null;
				}
			}
		}
		if (name.matches("Шоко.*")) {
			List<Chocolate> choco = sweets.getChoco();
			for(Chocolate c : choco) {
				if(c.getName().equalsIgnoreCase(name)) {
					c.setQuantity(c.getQuantity()-quantity);
					return new Candy(name, c.getPrice(), quantity);
				} else {
					return null;
				}
			}
		}
		return null;
	}
	
	// коробка добавляется автоматически в зависимости от количества сладостей 
	public static Box selectBox(int size) {
		if(size<4) {
			return new Box(BoxType.MINI, 1.50);
		}
		if(size<7) {
			return new Box(BoxType.MIDI, 2.00);
		}
		if(size<10) {
			return new Box(BoxType.MAXI, 2.50);
		}
		return null;
	}

}

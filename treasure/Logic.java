package by.tce.jonline.treasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Дракон и его сокровища
 * Класс выполняет действия с сокровищами 
 */

public class Logic {
	private TreasureCave treasureCave = new TreasureCave();
	
	public Logic()	{ // если количество сокровищ не указано
		
		initiate(100); // создаем по умолчанию
	}
	
	public Logic(int quantity)	{
		
		Random r = new Random();
		
		for(int i=0; i<quantity; i++) {
			String type = setType(r.nextInt(4));
			int cost = r.nextInt(100)+1;
			
			treasureCave.addTreasure(type, cost);
		}
	}
	
	// полный список сокровищ
	public List<Treasure> showCave() {
		return treasureCave.getTreasureList();
	}
	
	// список самых дорогих сокровищ
	public List<Treasure> showMaxTreasure() {
		int maxCost = 0;
		List<Treasure> mostExpensiveTreasures = new ArrayList<>();
		
		for(Treasure treasure : treasureCave.getTreasureList()) {
			if(treasure.getCost()>maxCost) {
				maxCost=treasure.getCost();
			}
		}
		
		for(Treasure treasure : treasureCave.getTreasureList()) {
			if(treasure.getCost()==maxCost) {
				mostExpensiveTreasures.add(treasure);
			}
		}
		
		return mostExpensiveTreasures;
	}
	
	// список сокровищ на заданную сумму
	// сокровища выбираются случайным образом
	public List<Treasure> showSelectedTreasures(int amount) {
		List<Treasure> selectedTreasures = new ArrayList<>();
		List<Treasure> tmp = new ArrayList<>();
		
		int min = treasureCave.getTreasureList().get(0).getCost(); // самая низкая стоимость (инициализация стоимостью первого элемента списка)
		int total = 0; // сумма всех сокровищ
		int currentSum = 0;
		
		// определение сокровища с самой низкой стоимостью и общей стоимости всех сокровищ
		for(Treasure treasure : treasureCave.getTreasureList()) {
			if(treasure.getCost()<min) {
				min=treasure.getCost();
			}
			total+=treasure.getCost();
		}
		
		// если заданная сумма превышает общую стоимость всех сокровищ
		if(amount>=total) {
			return treasureCave.getTreasureList();
		}
		
		Random r = new Random();
		tmp.addAll(treasureCave.getTreasureList());
				
		while(amount-currentSum>min) {
			int currentIndex = r.nextInt(tmp.size()); // случайный выбор сокровища
			
			if(amount-currentSum>=tmp.get(currentIndex).getCost()) {
				selectedTreasures.add(tmp.get(currentIndex));
				currentSum+=tmp.get(currentIndex).getCost();
				tmp.remove(currentIndex);
			}
			
			// ищем минимальное по стоимости сокровище из оставшихся (а то вдруг минимальное уже было выбрано)
			min=tmp.get(0).getCost();
			for(Treasure treasure : tmp) {
				if(treasure.getCost()<min) {
					min=treasure.getCost();
				}
			}
		}
		
		return selectedTreasures;
	}

	//---- методы инициализации
	
	public boolean initiate(int quantity)	{
		
		Random r = new Random();
		
		for(int i=0; i<quantity; i++) {
			String type = setType(r.nextInt(4));
			int cost = r.nextInt(100)+1;
			
			treasureCave.addTreasure(type, cost);
		}
		
		return true;	
	}

	private String setType(int i) {
		switch(i) {
		case 0: return "Монета";
		case 1: return "Золотой слиток";
		case 2: return "Драгоценный камень";
		case 3: return "Ювелирное изделие";
		}
		
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasureCave == null) ? 0 : treasureCave.hashCode());
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
		Logic other = (Logic) obj;
		if (treasureCave == null) {
			if (other.treasureCave != null)
				return false;
		} else if (!treasureCave.equals(other.treasureCave))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Logic [treasureCave=" + treasureCave + "]";
	}

}

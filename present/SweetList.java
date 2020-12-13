package by.tce.jonline.present;

import java.util.ArrayList;
import java.util.List;

// Список доступных сладостей

public class SweetList {
	private List <Candy> candy = new ArrayList<>(); 
	private List <Chocolate> choco = new ArrayList<>();
	
	{
		candy.add(new Candy("Конфеты \"Аленка\"", 0.25, 1000));
		candy.add(new Candy("Конфеты \"Столичные\"", 0.30, 1000));
		candy.add(new Candy("Конфеты \"Мишки на поляне\"", 0.35, 1000));
		candy.add(new Candy("Конфеты \"Грильяж\"", 0.40, 1000));
		
		choco.add(new Chocolate("Шоколад \"Nestle\"", 2.30, 1000));
		choco.add(new Chocolate("Шоколад \"Snickers\"", 1.80, 1000));
		choco.add(new Chocolate("Шоколад \"Коммунарка\"", 2.80, 1000));
		choco.add(new Chocolate("Шоколад \"Спартак\"", 2.50, 1000));
	}
	
	public SweetList() {
		
	}

	public List<Candy> getCandy() {
		return candy;
	}

	public List<Chocolate> getChoco() {
		return choco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candy == null) ? 0 : candy.hashCode());
		result = prime * result + ((choco == null) ? 0 : choco.hashCode());
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
		SweetList other = (SweetList) obj;
		if (candy == null) {
			if (other.candy != null)
				return false;
		} else if (!candy.equals(other.candy))
			return false;
		if (choco == null) {
			if (other.choco != null)
				return false;
		} else if (!choco.equals(other.choco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SweetList [candy=" + candy + ", choco=" + choco + "]";
	}

}

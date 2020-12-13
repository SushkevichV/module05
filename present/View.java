package by.tce.jonline.present;

public class View {
	public static void view(Present present) {
		double sum = 0;
		System.out.println("В подарочный набор добавлены:");
		for(Sweet candy : present.getSweet()) {
			System.out.printf("%s, цена %.2f - %.0fшт. - сумма %.2f\n",candy.getName(), candy.getPrice(), candy.getQuantity(), candy.getPrice()*candy.getQuantity());
			sum+=candy.getPrice()*candy.getQuantity();
		}
		System.out.printf("Подарочная коробка %s, цена %.2f\n", present.getBox().getType(), present.getBox().getPrice());
		sum+=present.getBox().getPrice();
		System.out.printf("\nОбщая стоимость набора - %.2f\n", sum);
	}

}

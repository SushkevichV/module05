package by.tce.jonline.payment;

import by.tce.jonline.payment.Payment.Product;

/* Модуль 5. Basics of OOP. Задача 2
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */

public class Basket { // корзина покупок
	
	public double getTotal(Payment payment) { // подсчет общей стоимости покупок
		double total = 0;

		for(Product product : payment.getProducts()) {
			total += product.getPrice()*product.getQuantity();
		}
		return total;
	}
	
	public void showCheck(Payment payment) { // вывод чека
		for(Product product : payment.getProducts()) {
			System.out.println(product.getName() + " - " + product.getPrice() + " x " + product.getQuantity() + " = " + product.getPrice()*product.getQuantity());
		}
		System.out.println("Итого: " + getTotal(payment));
		
	}

}

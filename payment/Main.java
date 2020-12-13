package by.tce.jonline.payment;

import by.tce.jonline.payment.Payment.Product;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		Basket basket = new Basket();
		
		payment.addProduct(new Product("Теннисный стол", 300, 1));
		payment.addProduct(new Product("Сетка для теннисного стола", 50, 1));
		payment.addProduct(new Product("Теннисная ракетка", 10, 2));
		payment.addProduct(new Product("Теннисный мячик", 1, 5));
		
		basket.showCheck(payment);

	}

}

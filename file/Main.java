package by.tce.jonline.file;

/* Модуль 5. Basics of OOP. Задача 1
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, 
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {
		Directory data = new Directory("Data");
		
		data.addDirectory("Garbage");
		
		data.addTextFile("list.txt");
		
		data.addTextFile("test.txt");
		
		// переименование файла
		if(!Show.reNameFile(data, "test.txt", "notes.txt")) {
			System.out.println("Файл не найден");
		}
		
		// вывод содержания директории
		Show.showDirectory(data);
		
		// добавление текста в файл
		if(!Show.addText(data, "list.txt", "Список покупок")){
			System.out.println("Файл не найден");
		}
		
		System.out.println();
		
		// вывод содержания текстового файла
		if(!Show.showFile(data, "list.txt")) {
			System.out.println("Файл не найден");
		}
		
		// удаление файла
		System.out.println();
		if(!Show.deleteFile(data, "list.txt")) {
			System.out.println("Файл не найден");
		} else {
			System.out.println("Файл list.txt удален");
		}
		
		// удаление директории
		if(!Show.deleteDirectory(data, "Garbage")) {
			System.out.println("Директория не найдена");
		} else {
			System.out.println("Директория Garbage удалена");
		}
	}

}

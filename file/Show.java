package by.tce.jonline.file;

/* Модуль 5. Basics of OOP. Задача 1
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, 
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Show {
	// вывод содержания каталога
	public static void showDirectory(Directory directory) {
		System.out.println("Содержание директории "+directory.getName());
		for(int i=0; i<directory.getDirectories().size(); i++) {
			System.out.println(directory.getDirectories().get(i).getName());
		}
		for(int i=0; i<directory.getFiles().size(); i++) {
			System.out.println(directory.getFiles().get(i).getName());
		}
	}

	// получить содержание текстового файла
	public static boolean showFile(Directory directory, String fileName) {
		System.out.println("Вывод текста из файла " + fileName);
		if(serch(directory, fileName)>-1) {
			System.out.println(directory.getFiles().get(serch(directory, fileName)).getText());
			return true;
		}
		return false;	
	}
	
	// поиск файла
	public static int serch(Directory directory, String fileName) {
		for(int i=0; i<directory.getFiles().size(); i++) {
			if(directory.getFiles().get(i).getName().equals(fileName)) {
				return i;
			}
		}
		return -1;
	}
	
	// добавление текста в файл
	public static boolean addText(Directory directory, String fileName, String text) {
		if(serch(directory, fileName)>-1) {
			directory.getFiles().get(serch(directory, fileName)).setText(text);
			return true;
		}
		return false;
	}
	
	// переименование файла
	public static boolean reNameFile(Directory directory, String fileName, String newName) {
		if(serch(directory, fileName)>-1) {
			directory.getFiles().get(serch(directory, fileName)).reName(newName);
			return true;
		}
		return false;
	}

	// удаление файла
	public static boolean deleteFile(Directory directory, String fileName) {
		if(directory.removeFile(fileName)) {
			return true;
		}
		return false;
	}
	
	// удаление директории
	public static boolean deleteDirectory(Directory directory, String dirName) {
		if(directory.removeDirectory(dirName)) {
			return true;
		}
		return false;
	}

}

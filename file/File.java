package by.tce.jonline.file;

/* Модуль 5. Basics of OOP. Задача 1
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, 
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class File {
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void reName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		File other = (File) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File name = " + name;
	}

}

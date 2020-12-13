package by.tce.jonline.file;

/* Модуль 5. Basics of OOP. Задача 1
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, 
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class TextFile extends File {
	private String text="";

	public TextFile(String name) {
		super(name);
		
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void addText(String text) {
		this.text += " " + text;
	}
	
	public String getText() {
		return text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File name = " + super.getName() + " Text: " + text;
	}

}

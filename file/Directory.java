package by.tce.jonline.file;

import java.util.ArrayList;

/* Модуль 5. Basics of OOP. Задача 1
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, 
 * переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Directory {
	private String name;
	private ArrayList<TextFile> files = new ArrayList<>();
	private ArrayList<Directory> directories = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void addDirectory(String name) {
		directories.add(new Directory(name));
	}
	
	public void addTextFile(String name) {
		files.add(new TextFile(name));
	}
	
	public String getName() {
		return name;
	}
	
	public void reName(String name) {
		this.name = name;
	}
	
	public boolean removeDirectory(String name) {
		for (Directory directory : directories) {
			if (directory.getName().equals(name)) {
				directories.remove(directory);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeFile(String name) {
		for (File file : files) {
			if (file.getName().equals(name)) {
				files.remove(file);
				return true;
			}
		}
		return false;
	}

	public ArrayList<TextFile> getFiles() {
		return files;
	}

	public ArrayList<Directory> getDirectories() {
		return directories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directories == null) ? 0 : directories.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
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
		Directory other = (Directory) obj;
		if (directories == null) {
			if (other.directories != null)
				return false;
		} else if (!directories.equals(other.directories))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", files=" + files + ", directories=" + directories + "]";
	}

}

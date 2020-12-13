package by.tce.jonline.holiday;

import java.util.GregorianCalendar;

/* Модуль 5. Basics of OOP. Задача 3
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию 
 * о выходных и праздничных днях.
 */

public class Main {

	public static void main(String[] args) {
		HolidayLogic holiday = new HolidayLogic();
		
		holiday.setHoliday(new GregorianCalendar(2020,2,9), "Отгул"); // установить дату и тип выходного дня
		
		// информация о днях
		System.out.println(holiday.isDayOff(new GregorianCalendar(2020,2,9)));
		System.out.println(holiday.isDayOff(new GregorianCalendar(2020,6,3)));
		System.out.println(holiday.isDayOff(new GregorianCalendar(2020,8,12)));
		System.out.println(holiday.isDayOff(new GregorianCalendar(2020,9,21)));

	}

}

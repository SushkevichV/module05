package by.tce.jonline.holiday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import by.tce.jonline.holiday.Holiday.DayOff;

public class HolidayLogic {
	
	private Holiday holiday = new Holiday();

	public void setHoliday(Calendar calendar, String holidayType) {
		holiday.setHoliday(calendar, holidayType);
	}
	
	public String isDayOff(Calendar calendar) { // получить данные о дне
		DateFormat df = new SimpleDateFormat("dd MMMM yyyг., EEEE");
		List<DayOff> holidays = holiday.getHoliday();
		
		for(Holiday.DayOff dayOff : holidays) { // если есть запись в списке
			if(dayOff.getCalendar().equals(calendar)) {
				return df.format(calendar.getTime())+ " - " +dayOff.getHolidayType();
			}
		}
		if(calendar.get(Calendar.DAY_OF_WEEK)==1 || calendar.get(Calendar.DAY_OF_WEEK)==7) { // если нет записи в списке
			return df.format(calendar.getTime())+ " - Выходной";
		}
		return df.format(calendar.getTime())+ " - Рабочий день";
	}
	
	public void show() { // вывод списка (для проверки заполнения списка, из Main не вызывается)
		DateFormat df = new SimpleDateFormat("dd MMMM yyyг., EEEE");
		List<DayOff> holidays = holiday.getHoliday();
		for(Holiday.DayOff dayOff : holidays) {
			System.out.println(df.format(dayOff.getCalendar().getTime())+ " - " +dayOff.getHolidayType());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holiday == null) ? 0 : holiday.hashCode());
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
		HolidayLogic other = (HolidayLogic) obj;
		if (holiday == null) {
			if (other.holiday != null)
				return false;
		} else if (!holiday.equals(other.holiday))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HolidayLogic [holiday=" + holiday + "]";
	}
	
}

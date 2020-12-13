package by.tce.jonline.holiday;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Holiday {
	private List <DayOff> holidays = new ArrayList<>();
	
	public void setHoliday(Calendar calendar, String holidayType) {
		holidays.add(new DayOff(calendar, holidayType));
	}
	
	public List<DayOff> getHoliday(){
		return holidays;
	}
	
	public class DayOff{
		
		private Calendar calendar;
		private String holidayType;
				
		public DayOff() {
			
		}
		
		public DayOff(Calendar calendar, String holidayType) {
			this.calendar = calendar;
			this.holidayType = holidayType;
		}
	
		public void addDayOff(Calendar calendar, String holidayType) {
			this.calendar = calendar;
			this.holidayType = holidayType;
		}
		
		public String getHolidayType(){
			return holidayType;
		}
		
		public Calendar getCalendar(){
			return calendar;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
			result = prime * result + ((holidayType == null) ? 0 : holidayType.hashCode());
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
			DayOff other = (DayOff) obj;
			if (calendar == null) {
				if (other.calendar != null)
					return false;
			} else if (!calendar.equals(other.calendar))
				return false;
			if (holidayType == null) {
				if (other.holidayType != null)
					return false;
			} else if (!holidayType.equals(other.holidayType))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "DayOff [calendar=" + calendar + ", holidayType=" + holidayType + "]";
		}
		
	}
	
	{
		holidays.add(new DayOff(new GregorianCalendar(2020,0,1), "Новый год"));
		holidays.add(new DayOff(new GregorianCalendar(2020,0,7), "Рождество"));
		holidays.add(new DayOff(new GregorianCalendar(2020,2,8), "Международный женский день"));
		holidays.add(new DayOff(new GregorianCalendar(2020,4,1), "День труда"));
		holidays.add(new DayOff(new GregorianCalendar(2020,4,9), "День Победы"));
		holidays.add(new DayOff(new GregorianCalendar(2020,6,3), "День независимости"));
		holidays.add(new DayOff(new GregorianCalendar(2020,11,25), "Рождество"));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((holidays == null) ? 0 : holidays.hashCode());
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
		Holiday other = (Holiday) obj;
		if (holidays == null) {
			if (other.holidays != null)
				return false;
		} else if (!holidays.equals(other.holidays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Holiday [holidays=" + holidays + "]";
	}
	
}

package chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(" ===  Date Info === ");
		System.out.println(date);
		
		System.out.println("\n =  Date = ");
		System.out.printf("%s %s %02d %02d:%02d KST %d\n", getWeekName(date.getDay()+1), getMonthName(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 
				                                            cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), 
				                                            cal.get(Calendar.YEAR));
	}
	public static String getWeekName(int weekNo) {
		var returnVal = switch(weekNo){
						case Calendar.SUNDAY -> "Sun";
						case Calendar.MONDAY -> "Mon";
						case Calendar.TUESDAY -> "Tue";
						case Calendar.WEDNESDAY -> "Wed";
						case Calendar.THURSDAY -> "Thu";
						case Calendar.FRIDAY -> "Fri";
						case Calendar.SATURDAY -> "Sat";
						default -> throw new IllegalArgumentException("잘못입력된 요일입니다." + weekNo);
		};
		return returnVal;
	}
	
	public static String getMonthName(int monthNo) {
		var returnVal = switch(monthNo){
						case Calendar.JANUARY -> "Jan";
						case Calendar.FEBRUARY -> "Feb";
						case Calendar.MARCH -> "Mar";
						case Calendar.APRIL -> "Apr";
						case Calendar.MAY -> "May";
						case Calendar.JUNE -> "Jun";
						case Calendar.JULY -> "Jul";
						case Calendar.AUGUST -> "Aug";
						case Calendar.SEPTEMBER -> "Sep";
						case Calendar.OCTOBER -> "Oct";
						case Calendar.NOVEMBER -> "Nov";
						case Calendar.DECEMBER -> "Dec";
						default -> throw new IllegalArgumentException("잘못입력된 월입니다." + monthNo);
		};
		return returnVal;
	}
}


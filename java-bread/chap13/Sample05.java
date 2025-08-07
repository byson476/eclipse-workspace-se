package chap13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sample05 {
	public static void main(String[] args) {

		String date = "202505";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd");
		LocalDate dt = LocalDate.parse(date + "01" , formatter);
		int dtMonth = dt.getMonthValue();
		int weekCount = 0;
		int[][] days = new int[6][7];
		int day = 1;
		int weekNum = dt.getDayOfWeek().getValue();
		do {
			//System.out.println( dt.getDayOfMonth());
			days[weekCount][weekNum] = dt.getDayOfMonth();
			if(weekNum==6) {
				weekCount++;
				weekNum=0;
			}
			else
				weekNum++;
			dt = dt.plusDays(day);
		}while(dtMonth==dt.getMonthValue());
		
		System.out.printf("\t%d년 %d월 \n\n", dt.getYear(), dtMonth);
		System.out.println(" 일 월 화 수 목 금 토 ");
		for(int[] week : days) {
			for(int today : week)
				System.out.printf("%4s", today==0? "" : today);
			System.out.println("");
		}
	}
}

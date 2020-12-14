package sec14_Date_Calendar클래스.exam02_CalendarExample;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		//1_OS에 설정되어 있는 시간대(Time Zone)을 기준으로 한 Calendar 객체 얻기
		System.out.println("[현재 한국 시간 정보 얻어오기");
		Calendar now = Calendar.getInstance();
		
		//년월일 알아내기
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		//요일 알아내기
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY: //마지막은 default로 해도 됨.
				strWeek = "일";
				break;
		}
		
		//오전 오후 알아내기
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		//시분초 알아내기
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
		//2_다른 시간대의 Calendar 객체 얻기
		
		/*다음TimeZone클래스의 정적메소드를 사용하여, ID를 얻고, 그중에서 하나를 TimeZone.getTimeZone(매개값)으로 전달하여 객체를 생성해준다.
		String[] IDs = TimeZone.getAvailableIDs();
		for(String id : IDs) {
			System.out.println(id);
		}
		*/
		System.out.println("[현재 LA 시간 정보 얻어오기");
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar AmericaLA = Calendar.getInstance(tz);//생성된 TimeZone객체를 Calendar getInstance()메소드에 매개값으로 전달한다.
		
		//년월일 알아내기
		int year1 = AmericaLA.get(Calendar.YEAR);
		int month1 = AmericaLA.get(Calendar.MONTH);
		int day1 = AmericaLA.get(Calendar.DAY_OF_MONTH);
		
		//요일 알아내기
		int week1 = AmericaLA.get(Calendar.DAY_OF_WEEK);
		String strWeek1 = null;
		switch(week1) {
			case Calendar.MONDAY:
				strWeek1 = "월";
				break;
			case Calendar.TUESDAY:
				strWeek1 = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek1 = "수";
				break;
			case Calendar.THURSDAY:
				strWeek1 = "목";
				break;
			case Calendar.FRIDAY:
				strWeek1 = "금";
				break;
			case Calendar.SATURDAY:
				strWeek1 = "토";
				break;
			case Calendar.SUNDAY: //마지막은 default로 해도 됨.
				strWeek1 = "일";
				break;
		}

		//오전 오후 알아내기
		int amPm1 = AmericaLA.get(Calendar.AM_PM);
		String strAmPm1 = null;
		if(amPm1 == Calendar.AM) {
			strAmPm1 = "오전";
		} else {
			strAmPm1 = "오후";
		}
		
		//시분초 알아내기
		int hour1 = AmericaLA.get(Calendar.HOUR);
		int minute1 = AmericaLA.get(Calendar.MINUTE);
		int second1 = AmericaLA.get(Calendar.SECOND);
		
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.print(strWeek1 + "요일 ");
		System.out.print(strAmPm1 + " ");
		System.out.println(hour1 + "시" + minute1 + "분" + second1 + "초");
	}
}
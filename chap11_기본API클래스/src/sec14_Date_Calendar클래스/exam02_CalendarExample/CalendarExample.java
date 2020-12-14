package sec14_Date_CalendarŬ����.exam02_CalendarExample;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		//1_OS�� �����Ǿ� �ִ� �ð���(Time Zone)�� �������� �� Calendar ��ü ���
		System.out.println("[���� �ѱ� �ð� ���� ������");
		Calendar now = Calendar.getInstance();
		
		//����� �˾Ƴ���
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		//���� �˾Ƴ���
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			case Calendar.SUNDAY: //�������� default�� �ص� ��.
				strWeek = "��";
				break;
		}
		
		//���� ���� �˾Ƴ���
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		//�ú��� �˾Ƴ���
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year + "��" + month + "��" + day + "��");
		System.out.print(strWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.println(hour + "��" + minute + "��" + second + "��");
		
		//2_�ٸ� �ð����� Calendar ��ü ���
		
		/*����TimeZoneŬ������ �����޼ҵ带 ����Ͽ�, ID�� ���, ���߿��� �ϳ��� TimeZone.getTimeZone(�Ű���)���� �����Ͽ� ��ü�� �������ش�.
		String[] IDs = TimeZone.getAvailableIDs();
		for(String id : IDs) {
			System.out.println(id);
		}
		*/
		System.out.println("[���� LA �ð� ���� ������");
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar AmericaLA = Calendar.getInstance(tz);//������ TimeZone��ü�� Calendar getInstance()�޼ҵ忡 �Ű������� �����Ѵ�.
		
		//����� �˾Ƴ���
		int year1 = AmericaLA.get(Calendar.YEAR);
		int month1 = AmericaLA.get(Calendar.MONTH);
		int day1 = AmericaLA.get(Calendar.DAY_OF_MONTH);
		
		//���� �˾Ƴ���
		int week1 = AmericaLA.get(Calendar.DAY_OF_WEEK);
		String strWeek1 = null;
		switch(week1) {
			case Calendar.MONDAY:
				strWeek1 = "��";
				break;
			case Calendar.TUESDAY:
				strWeek1 = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek1 = "��";
				break;
			case Calendar.THURSDAY:
				strWeek1 = "��";
				break;
			case Calendar.FRIDAY:
				strWeek1 = "��";
				break;
			case Calendar.SATURDAY:
				strWeek1 = "��";
				break;
			case Calendar.SUNDAY: //�������� default�� �ص� ��.
				strWeek1 = "��";
				break;
		}

		//���� ���� �˾Ƴ���
		int amPm1 = AmericaLA.get(Calendar.AM_PM);
		String strAmPm1 = null;
		if(amPm1 == Calendar.AM) {
			strAmPm1 = "����";
		} else {
			strAmPm1 = "����";
		}
		
		//�ú��� �˾Ƴ���
		int hour1 = AmericaLA.get(Calendar.HOUR);
		int minute1 = AmericaLA.get(Calendar.MINUTE);
		int second1 = AmericaLA.get(Calendar.SECOND);
		
		System.out.println(year + "��" + month + "��" + day + "��");
		System.out.print(strWeek1 + "���� ");
		System.out.print(strAmPm1 + " ");
		System.out.println(hour1 + "��" + minute1 + "��" + second1 + "��");
	}
}
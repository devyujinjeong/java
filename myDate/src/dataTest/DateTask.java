package dataTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTask {
	public static void main(String[] args) {
//		Date now = new Date();
//		date��ü�� toString() �޼ҵ�� �������� �� ��¥�� ������.
//		String strNow1 = now.toString();
//		System.out.println(strNow1);
	
//		SimpleDateFormatŬ������ format() �޼ҵ带 ȣ���� ���ϴ� ������ ��¥ ������ ���� �� ����.
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
//		String strNow2 = sdf.format(now);
//		System.out.println(strNow2);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		Calendar calendar = Calendar.getInstance();
	    calendar.set(1900, 11, 4);
	    System.out.println(calendar);
	    System.out.println(simpleDateFormat.format(calendar.getTime()));
		
	}
}

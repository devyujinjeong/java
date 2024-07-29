package dataTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DataTest {
	public static void main(String[] args) {
//		���ڿ��� Date�� �����ؾ� �� ��: ���޹��� ���ڿ��� ��¥ ������ �ؾ� �� �� 
//		Date�� ���ڿ��� �����ؾ� �� ��: ȭ�鿡 �ѷ��� �� �� 
		
//		Date : ��¥�� �ð� ������ �����ϴ� Ŭ����
//		Calendar : �ü���� ��¥�� �ð��� ���� �� ���
		
//      > LocalDate
//      �� String -> LocalDate
//		���⿡���� LocalDate Ÿ���ΰ���.
//		����� localdate ������ 2020-12-04 �̷�����
		System.out.println(LocalDate.parse("2020��12��04��", DateTimeFormatter.ofPattern("yyyy��MM��dd��")));

//      �� LocalDate -> String
//      LocalDate localDate = LocalDate.of(2020, 12, 04);
//      System.out.println(localDate);
//      LocalDate�ȿ� ���ʿ� format�� ����. 
//		�׷��� �ؿ��� ó�� calendar ����, simpleDateFormat ���� ������ �ʿ䰡 ����
//		���ϴ� �������� ����ϱ�
//      System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
      
//      > Calendar
//		���ϴ� ��¥ ������ ���ڿ��� ��� ������쿡 simpledateformat ����ϱ�
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH�� mm�� ss��");
//      
//      �� String -> Date   
//      try {
//         System.out.println(simpleDateFormat.parse("1900/12/04 12�� 30�� 20��"));
//      } catch (ParseException e) {
//         System.out.println("���� ����");
//      }
      
//      �̱��� ����
//		��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ���. �� �ϳ��� �����Ǵ� ��ü��� �ؼ� �̱���
//		calendar�� new�� �Ⱥ��̴µ�, �̰��� �����ڰ� ����� �ȵǴ� ����.
//		�� ���� �޷��� 1���̱� ������ �̰͸� ����ϰ� �ϴ� ����.
//		getInstance()�� �ܺο��� ��ü�� ��� ������ ���
//		Calendar calendar = Calendar.getInstance();
//      calendar.set(1900, 11, 4);
//      System.out.println(calendar);
      
//      �� Date -> String   
//      System.out.println(simpleDateFormat.format(calendar.getTime()));
      
//		Date date = new Date(0, 11, 4);
//      date.setYear(0); //�⵵�� default���� 1900��
//      date.setMonth(11); //0���� ����
//      System.out.println(date);
//      System.out.println(simpleDateFormat.format(date));
   }
}

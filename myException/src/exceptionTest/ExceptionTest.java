package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

//����� ����
//Exception�� ��ӹ����� �ش� ���� ��� ��, try~catch�� ������ �������� �˻��ϰ� �ȴ�.
//	RunTimeException�� ��ӹ�����, ���� ������ �˻��ϰ� �ȴ�.
class BadWordException extends Exception{

public BadWordException() {;}

public BadWordException(String message) {
	super(message);
	}
}

public class ExceptionTest {

public void checkBadWord(String message) throws BadWordException{
	if(message.equals("�ٺ�")) {
		throw new BadWordException(); //throw�� ���� ���ܸ� �츮�� ���� �߻���Ű�� ��
	}
}
public static void main(String[] args) {
	
//	try {
//		String data = "������";
//		Integer.parseInt(data);
//	} catch (NumberFormatException e) {
//		System.out.println("������ �Է°����մϴ�.");
//	}
	
//	try {
//		System.out.print("�Է�: ");
//		new Scanner(System.in).nextInt();
//	} catch (InputMismatchException e) {
//		System.out.println("������ �Է��϶�� ���ݾƿ� ����");
//	}
	
//	try {
//		System.out.println(10 / 0);
//	} catch (ArithmeticException e) {
//		e.printStackTrace(); // ���� �������� ����� ��� �ڵ�κ��� ���� ��ȣ�� ��µȴ�.
//		System.out.println(e.getMessage());
//		System.err.println("0���� ���� �� �����ϴ�.");
//	}
}
}
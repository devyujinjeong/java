package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�. --> �� ������ �Է��� �Ұ�����. �׷��� �ٲ���� ��.
		Scanner sc=new Scanner(System.in);
		
		String number1=null, number2=null;
		int result=0;
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		number1=sc.next();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		number2=sc.next();
		
		result=Integer.parseInt(number1)*Integer.parseInt(number2);
		
		System.out.println(result);
		
		
	}
}


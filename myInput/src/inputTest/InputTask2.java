package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� �� ���� ��� 
//		(���͸� �ѹ��� �ĵ� 3���� ������ �ѹ��� ����Ǿ�� �Ѵ�.)
//		nextInt()
		Scanner sc=new Scanner(System.in);
		
//		3���� ����
		int number1 = 0, number2 = 0,number3=0, sum=0, subtraction=0, multiply=0,divide=0;
		String formatSum="%d+%d+%d=%d";
		String formatSubtraction="%d-%d-%d=%d ";
		String formatMultiply="%d*%d*%d=%d ";
		String formatDivide="%d/%d/%d=%d ";
		
		System.out.println("���� 3���� �Է��ϼ���:");

		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();

		sum=number1+number2+number3;
		subtraction=number1-number2-number3;
		multiply=number1*number2*number3;
		divide=number1/number2/number3;
		
		System.out.printf(formatSum,number1,number2,number3,sum);
		System.out.printf(formatSubtraction,number1,number2,number3,subtraction);
		System.out.printf(formatMultiply,number1,number2,number3,multiply);
		System.out.printf(formatSubtraction,number1,number2,number3,divide);
		
		
		
		
	}
}


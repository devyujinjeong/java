package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		������ �ѱ۷� ����
//		�Է� ��) 1024
//		��� ��) �ϰ��̻�
		
//		1. ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in); //��ĳ�ʸ� �̿��� ���� �Է��ϱ�
		String message = "���� �Է�: "; //message �ʱ�ȭ �ϱ�
		String hangle = "�����̻�����ĥ�ȱ�"; //hangle �ʱ�ȭ �ϱ�
		int number = 0; // number �ʱ�ȭ �ϱ�
//		String number = null;
		String result = ""; //result �ʱ�ȭ �ϱ�
		
		System.out.print(message); //�޼��� ���
		number = sc.nextInt(); //���� �Է��ϱ� (�ܼ�â��)
		
		while(number != 0) { //number�� 0�� �ƴҶ����� �ݺ�
			result = hangle.charAt(number % 10) + result; 
			//�Է��� number�� 10���� ���� ������ ���� �ش��ϴ� �濡 �ִ� ���ڿ� ���� result ���� ���ؼ� result�� �Ҵ�
			result = result + hangle.charAt(number % 10);
			number /= 10;
			//���� �۾��� ������ �ڿ� number�� 10���� ������. �׷��� �������� ������ �ǰ� �̰��� �ٽ� ���� ���� �ݺ�
		}
		System.out.println(result);
		
//		2. ���ڿ��� �Է¹ޱ�
//		number = sc.next();
//		for (int i = 0; i < number.length(); i++) { //������ ���̸�ŭ �ݺ��ϱ�
//		48�� �ƽ�Ű �ڵ�� '0'
//			result += hangle.charAt(number.charAt(i) - 48);
//		}
//		System.out.println(result);
	}
}


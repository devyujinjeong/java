package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5�� ������ �Է¹ޱ� 
//		1. ������ �Է¹��� �ʴ� ��쿡�� ������ �߻��ϰ� ��
//		2. 5�� �̻��� ������ �Է��ϰ� �� ��� ���� �߻�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		int[] arrayData = new int[5];
		int i= 0;
		String number=null;
		
		
		while(true) {
			System.out.print(++i+"��° ������ �Է��ϼ���: ");
			number=sc.next(); //���� �Է� �ޱ�
					
			// ���� �Է��� ���� q��� while���� ������
			// if������ break�� ���� ��쿡�� if���� ���ΰ� �ִ� �߰�ȣ�� ������ ��
			if(number.equals("q")) {break;}	
			
			try {
			// number�� ������ �ƴ� �ٸ� �ڷ����� �Է��ϰ� �� ��� ����ȯ�� �� �� ���� ������ ������ �߻��� �� �ִ� ����
				arrayData[i-1]=Integer.parseInt(number);
			} catch (NumberFormatException e) { // ���ڰ� �ƴ� �ٸ� ���� �Է����� ���
				System.out.println("������ �Է����ּ���!!");
				i--;
			} catch(ArrayIndexOutOfBoundsException e) { //�迭�� index ������ �ʰ�
				System.out.println("5���� ������ �Է����ּ���!!");
				for(int j=0;j<arrayData.length;j++) {
					System.out.println(arrayData[j]+"");
				}
				break;
			} catch(Exception e) {
				System.out.println("�ٽ� �õ����ּ���");
				i--;
			}		
		}
	}
}


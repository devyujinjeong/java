package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String title="Q. ����� �����ϴ� ���� �����ϼ���";
		String color="\n1.������ \n2.����� \n3.������ \n4.���";
		String redMessage="������: �Ұ��� �������̰� �������̴�.";
		String yellowMessage="�����: �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage="������: �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMessage="���: õ�簰�� ����ϰ� ������ �����ϰ� ������� �ִ�.";
		String errorMessage="���� �ٽ� �Է��ϼ���.";
		String result=null;
		 	
		int yourColor=0; //������ color�� 0�� �Ҵ��ϱ�

		System.out.println(title+color);
		
		yourColor=sc.nextInt();
		
		switch(yourColor){
		case 1:
			result=redMessage; //�̰͵� �ϰ�ó���� ������!!
			break; //switch���� break;�� �� �ۼ������ ��!!
			
		case 2:
			result=yellowMessage;
			break;
			
		case 3:
			result=blackMessage;
			break;
			
		case 4:
			result=whiteMessage;
			break;

		default:
			result=errorMessage;
			break;
		}
		System.out.println(result);
	}
}

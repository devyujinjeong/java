package controlStatementTest;

import java.util.Scanner;

public class IfTask {
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
		
		if(yourColor==1) { //�ʰ� 1���� ���ϸ�, redMessage�� result�� �Ҵ��ض�.
			result=redMessage;
		}
		else if(yourColor==2) { //�ʰ� 2���� ���ϸ�, yellowMessage�� result�� �Ҵ��ض�.
			result=yellowMessage;
		}
		else if(yourColor==3) { //�ʰ� 3���� ���ϸ�, blackMessage�� result�� �Ҵ��ض�.
			result=blackMessage;
		}
		else if(yourColor==4) { //�ʰ� 4���� ���ϸ�, whiteMessage�� result�� �Ҵ��ض�.
			result=whiteMessage;
		}
		else { //���� ���� ���ڿܿ� �ٸ� ���� �����ϸ�, errorMessage�� result�� �Ҵ��ض�.
			result=errorMessage;
		}
		
		System.out.println(result);
	}
}

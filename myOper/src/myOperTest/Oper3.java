package myOperTest;

import java.util.Scanner;

public class Oper3 {
//	�ɸ� �׽�Ʈ

//	Q. ����� �����ϴ� ���� �����ϼ���. (���ڷ� �Է¹ޱ�)
//	1. ������
//	2. �����
//	3. ������
//	4. ���
	
//	������ : �Ұ��� �������̰� �������̴�.
//	����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//	������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//	��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
	
	public static void main(String[] args) {
		// ���ڸ� �Է¹ޱ�
		Scanner sc=new Scanner(System.in);
		
		//������ ������ ���� �����ϱ�
		int yourColor=0; //yourColor��� ������ ���� �ʱ�ȭ �ϱ�
		boolean color1=false,color2=false,color3=false,color4=false;
		//color1,2,3,4��� ���� ���� �ʱ�ȭ �ϱ�
		String result=null;
		String title="Q. ����� �����ϴ� ���� �����ϼ��� \n1.������ \n2.����� \n3.������ \n4.���";
		
		String redMessage="������: �Ұ��� �������̰� �������̴�.";
		String yellowMessage="�����: �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage="������: �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMessage="���: õ�簰�� ����ϰ� ������ �����ϰ� ������� �ִ�.";
		String errorMessage="���� �ٽ� �Է��ϼ���.";

		System.out.println(title);
		yourColor=sc.nextInt(); //���� �Է� �ޱ�
		color1=yourColor==1; //color�� 1�� ���� ��� (��, ���� ������ �Ҵ��� ����)
		color2=yourColor==2; //color�� 2�� ���� ���
		color3=yourColor==3; //color�� 3�� ���� ���
		color4=yourColor==4; //color�� 4�� ���� ���
		//yourColor==n�� ���� ����!! �̰͵��� ������ �� �� �˾ƾ� ��
		
		//���Ⱑ ���γ�? �׷��ϱ� ���� �����ڴ� 1���� ���� �� ����ؾ߰ڴ�~!!
		result=color1?redMessage:color2?yellowMessage:color3?blackMessage:color4?whiteMessage: errorMessage;
		System.out.println(result);
		
	}

}

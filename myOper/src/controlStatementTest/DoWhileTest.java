package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1. ��� ��� ��ȸ\n2. �нǽŰ�\n3. ��Ż� �̵�\n0. ���� ����";
		Scanner sc =new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(message); //�ϴ� �� �޼����� �������!!
			choice = sc.nextInt(); //�׸��� ���� �Է� �޴� �͵� ��������!!
		} 
		
		while(choice != 0); //0�� �ƴҶ����� �ݺ��ϱ�
	}
}
package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		��ĳ�� �ϳ��� �� �����غ���
//		��ĳ�ʶ�� Ŭ������ �ְ�, ������ ��ü�� sc��� �̸� ���� ����.
//		�׸��� �����ڸ� �ҷ��ͼ� ����ϴ°�!! 
		Scanner sc=new Scanner(System.in);
		
//      �ʱⰪ: � ���� ������ �������� �ʾ��� �� �ִ� ��
//		����:0
//		�Ǽ�:0.0
//		����:''
//		���ڿ�:null
//		String firstName=null, lastName=null, name=null;
//		
//		System.out.print("�̸�: ");
//		firstName=sc.next();
//		lastName=sc.next();  //�Է��� ���� name�� ���� ��!!
//		name=firstName+lastName;
//		System.out.println(name + "�� ȯ���մϴ�.");
		
		String name = null;
	      
	    System.out.print("�̸�: ");
	    name = sc.nextLine();
	    System.out.println(name + "�� ȯ���մϴ�.");

	}
}

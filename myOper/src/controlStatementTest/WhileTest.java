package controlStatementTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		�̸� 10�� ����ϱ� (�̷� ��쿡�� for���� �� ����^^)
//		int count=0;
//		while(count!=10) {
//			System.out.println(count+1+". ������");
//			count++;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		String title = "Q. ����� �����ϴ� ���� �����ϼ���.";
		String menu = "1. ������\n2. �����\n3. ������\n4. ���\n5. ������";
		String redMessage = "�Ұ��� �������̰� �������̴�.";
		String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �õ����ּ���.";
		String result = null;
		
		int choice = 0;
		
		while(true) { //���ѹݺ�!! 
			System.out.println(title);
			System.out.println(menu);
			
			choice = sc.nextInt();
			if(choice == 5) { 
				//choice�� 5�� �Ǹ� �ؿ� switch���� �������� �ʰ� while�� ��ü�� ������ ��.
				//�ֳ�? ���� �ٸ� ��쿡 break�� ����ϰ� �Ǹ� �׳� �߰�ȣ�� �����⸸ �ϴµ�, 
				//if������ break�� ����ϰ� �� ��쿡�� if�� �����ϰ� �ִ� �߰�ȣ�� ������ ��.
				//�׷��� ���⿡���� break�� ����ϸ� while���� ������ �Ǵ� ��!!
				break;
			}
			
			switch(choice) {
			case 1:
				result = redMessage;
				break;
			case 2:
				result = yellowMessage;
				break;
			case 3:
				result = blackMessage;
				break;
			case 4:
				result = whiteMessage;
				break;
			default:
				result = errorMessage;
				break;
			}
			System.out.println(result);
		}
	}
}

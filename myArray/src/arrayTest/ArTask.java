package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		1. 1~10���� �迭�� ��� ���
//		int[] arData=new int[10];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			System.out.println(arData[i]);
//		}		
		
//		2. 10~1���� �� ¦���� �迭�� ��� ���
//		int[] arData=new int[5];
//		
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(i+1)*2;
//			System.out.println(arData[i]);
//		}
		
//		3. 1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData=new int[100]; //�迭�� ���� �Ŀ� ����̴ϱ� �켱 100���� �迭�� ���
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			if(arData[i]%2==1) { //1~100���� �� 2�� ���� �������� 1�� ���� ����ϱ�
//				System.out.println(arData[i]);			
//			}
//	
//		}
		
//		4. 1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData=new int[100];
//		int sum=0;
//		
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			if(arData[i]%2==0) {
//				sum+=i+1;			
//			}	
//		}
//		System.out.println(sum);
		
//		5. A~F���� �迭�� ��� ��� (65,66,67,68,69,70)
//		char[] arData=new char[6];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(char)(i+65);	
//			System.out.println(arData[i]);
//			}	
		
//		6. A~F���� �� C�� �����ϰ� �迭�� ���� �� ���
//		char[] arData=new char[6];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i<2?(char)(i+65):(char)(i+66);	
//			System.out.println(arData[i]);
//			}	

//		7. 5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		Scanner sc=new Scanner(System.in);
//		int[] arData=new int[5];
//		System.out.print("5���� ������ �Է����ּ���:");
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=sc.nextInt();
//		}
//		
//		int max=arData[0],min=arData[0];
//		for(int i=0;i<arData.length;i++) {
//			if(max<arData[i]) {max=arData[i];}
//			if(min>arData[i]) {max=arData[i];}
//		}
//		
//		System.out.println("�ִ밪��?"+max);
//		System.out.println("�ּҰ���?"+min);
		
//		8. ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
//		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		double average=0.0;
//		
//		System.out.print("�迭�� ������ �Է��ϼ���: ");
//		int[] arData=new int[sc.nextInt()];
//		
//		System.out.print("������ �Է��ϼ���: ");
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=sc.nextInt();
//			sum+=arData[i];
//		}
//		average=sum/(double)arData.length;
//		
//		System.out.println("��� ����?"+average);
		
		int[] arData = null;
		String messageOfIntegerCount = "�Է��Ͻ� ������ ����: ";
		String message = null;
		int total = 0;
		double average = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(messageOfIntegerCount);
		arData = new int[sc.nextInt()];
		
		for (int i = 0; i < arData.length; i++) {
			message = i + 1 + "��° ����: ";
			System.out.print(message);
			arData[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = total / (double)arData.length;
		System.out.println(average);
	}
}

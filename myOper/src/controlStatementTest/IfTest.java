package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		�� ���� ��Һ�(���� �����ڷ� ��� ���� if�� ���� �Ẹ��!!
	      Scanner sc = new Scanner(System.in);
	      int number1 = 0, number2 = 0;
	      boolean isBigger = false, isEqual = false;
	      String message = "�� ����: ", number1Message = null, number2Message = null, result = null;
	      String equalMessage = "�� �� �����ϴ�.";
	      
	      System.out.print(message);
	      number1 = sc.nextInt();
	      number2 = sc.nextInt();
	      
	      number1Message = "�� ū ��: " + number1;
	      number2Message = "�� ū ��: " + number2;
	      
	      isBigger = number1 > number2; //������ �� �� �˱�!! true�� false�� ������ ����!!
	      isEqual = number1 == number2;
	   
	      // �ϰ�ó���ϱ�!!
	      // ��, if���� ������ ���忡 ������ System.out.println();	�� ���� ���� �������� �ѹ��� �����ϱ�
	      if(isBigger) { //���࿡ isBigger�� �´ٸ� result�� number1Message�� �Ҵ��ض�.
	          result = number1Message;
	       } 
	      else if(isEqual) { //isBigger�� false���� �� else if�� �Ѿ���� ��!! 
	          result = equalMessage;
	      }
	      else { //���� ��찡 �� �ƴϸ� result�� number2Message�� �Ҵ��ض�
	          result = number2Message;
	      }
	       
	      System.out.println(result);	
	}

}

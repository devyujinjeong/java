package myOperTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ� (�� ������ ����ڿ��� �Է¹ޱ�)
	      Scanner sc = new Scanner(System.in);
	      int number1 = 0, number2 = 0;
	      //number1,number2��� ������ ���� �ʱ�ȭ ��Ű��
	      boolean isBigger = false, isEqual = false;
	      //isBigger, isEqual�̶�� ���� ���� �ʱ�ȭ ��Ű��, ����� boolean�� �⺻���� false
	      String message = "�� ����: ", number1Message = null, number2Message = null, result = null;
	      String equalMessage = "�� �� �����ϴ�.";
	      //������ ���ڿ� ������ �ʱ�ȭ ��Ű��
	      
	      System.out.print(message); //�޼����� ����ϱ� 
	      number1 = sc.nextInt(); //number1 �Է¹ޱ�
	      number2 = sc.nextInt(); //number2 �Է¹ޱ�
	      
	      number1Message = "�� ū ��: " + number1;
	      number2Message = "�� ū ��: " + number2;
	      //���ڿ�+����=���ڿ�(���⿡�� +�� ����!!)
	      
	      isBigger = number1 > number2;
	      isEqual = number1 == number2;
	      
	      result = isBigger ? number1Message : isEqual ? equalMessage  : number2Message;
	      //���� ������ ���. 
	      //isBigger�� true�� number1Message�� ����ϰ� false�� isEqual�� ���غ���.
	      //���⿡�� isEqual�� true�� equalMessage�� ����ϰ� false�� number2Message�� �������!

	      System.out.println(result);
	      
	   }
	}


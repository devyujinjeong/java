package methodTest;

public class MethodTask {
//  1~10���� println()���� ����ϴ� �޼ҵ�
//	printFrom1To10�̶�� �޼ҵ� �̸��̰� return���� ���� ���� void�� ����	
//	void �� ���� Ÿ���� ������ �ǹ�
//	void printFrom1To10(){ 
//		for (int i=0;i<10;i++) {
//			System.out.println(i+1);
//		}
//	}
	
//  "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
//	void printHong(int end){ //n�� ����� �ϴµ�, n���� ����ڰ� ������ ���̱� ������ �Ű������� �ޱ�
//		for (int i=0;i<end;i++) {
//			System.out.println("ȫ�浿");
//		}
//	}
	
//  �̸��� n�� println()���� ����ϴ� �޼ҵ�
//	void printName(String name,int end){
	//����ڰ� ���ϴ� �̸��� n�� �ޱ� ������ �̸��� �ݺ��� ���ڸ� ����ڿ��� �ޱ�
//		for (int i=0;i<end;i++) {
//			System.out.println(name);
//		}
//	}
	
//  �� ������ �������ִ� �޼ҵ� 
//	���ϴ� �� ���� ������ �Է¹ޱ� (�Ű�����)
//	������� ����ڿ��� ������� �ϴϱ� return �ϱ�
//	int sub(int number1,int number2,int number3){
//		return number1-number2-number3;
//	}
	
//  �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
//	int[] div(int number1, int number2) { //���� Ÿ���� �迭�ε� ���� �� ����
//		int[] results = null; 
//		//results��� �迭 �����ϱ�!!
//		//return�� 2���� ������ �� ���� ������, �迭 ���ϴ� ���� ��� �迭�� ���� �ϴ� ����!!
//		
//		if(number2 != 0) { //0���δ� �������� �� ���� ������!!
//			results = new int[] {number1 / number2, number1 % number2};
//			//results��� �迭�� ��� ������ ���
//		}
//		return results; //������ ȭ�鿡 �������� �ȳ��������� �����ϸ鼭 �Ǵ��ϸ� ����
//	}
	
//  1~n������ ���� �����ִ� �޼ҵ�
//	int getTotal(int n){ //���ϴ� ���� �Է¹ޱ�
//		int result=0;
//		for(int i=0;i<n;i++) {
//			result+=i;
//		}
//		return result;
//	}
	
//  Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
//	int oddEvenChange(int number) {
//		return ++number;
//	}
	
//  ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
//	�ҹ���97~, �빮�� 65~
//	String changeLetter(String string){
//		String result="";
//		
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i);
//			if(c>=97&&c<=122) {
//				result+=(char)(c-32);
//			}
//			else if(c>=65&&c<=90) {
//				result+=(char)(c+32);
//			}
//			else {
//				result+=c;
//			}
//		}
//		return result;
//	}
	
//  ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//	int getCount(String string, char character) {
//		int count=0;
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i); 
//			if(c==character) { //�� �濡 ����ִ� char�� �Է��� character�� ���ؼ� ������ 1���� ��Ű��
//				count++;
//			}
//		}
//		return count;
//	}
	
//  5���� ������ �Է¹��� �� ���ϴ� �ε��� ���� �����ִ� �޼ҵ�
//	int getValue (int[] arNumber,int index){
//		return arNumber[index];		
//	}
	
	
//  �ѱ��� ������ �ٲ��ִ� �޼ҵ�("�ϰ��̻�" -> 1024) 
	int changeHangle(String hangle) {
		String hangles="�����̻�����ĥ�ȱ�";
		String result="";
		
		for(int i=0;i<hangle.length();i++) {
			char c= hangle.charAt(i); //c�� ���� �Է��� hangle�� index�� ����ִ� char�� ���(���̸�ŭ �ݺ�)
			result+=hangle.indexOf(c); //�ݺ��� �͵� ����� ��Ƽ� �����ϱ�
		}
		return Integer.parseInt(result); //result���� ������ ��ȯ�ϱ�
	}
	
//  5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//	int[] maxAndMin(int[] arNumber){
//		int[] results= {arNumber[0],arNumber[0]};
//
//		for(int i=1;i<arNumber.length;i++) {
//			if(arNumber[0]<arNumber[i]) {results[0]=arNumber[i];}
//			if(arNumber[0]>arNumber[i]) {results[0]=arNumber[i];}
//		}
//		return results; 
//		return�� 2���� �ٷ� ���� ����. �׷��� �迭�� ��Ƽ� return�� ��. ���� �� return�� ���� �迭��
//	}
	
//  String Ŭ������ �ִ� indexOf() �����, ���ڿ��� �˻� ���ڸ� ���޹޾Ƽ� ó���Ѵ�.
//	int indexOf(String string,char character){
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i);
//			if(c==character) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	public static void main(String[] args) {
		MethodTask methodTask=new MethodTask();
//		System.out.println(methodTask.changeHangle("�����̻�"));
		
//		String �ʱⰪ�� null�� ������ �Ʒ����� ���ο� ���� �����Ѵٴ� ���̰�.
//		""(�� ���ڿ�)�� ���� �Ʒ����� ���� ������ �Ѵٴ� ���̴�.

//		String resultMessage=null; //null�� ����!! 
//		resultMessage=result? "Ȧ���� ¦���� ����Ǿ����ϴ�.":"¦���� Ȧ���� ����Ǿ����ϴ�.";
//		System.out.println(resultMessage);
		
//		int[] results = methodTask.div(10, 3);
//		
//		if(results != null) {
//			System.out.println("��: " + results[0]);
//			System.out.println("������: " + results[1]);
//		}else {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}

	}

}

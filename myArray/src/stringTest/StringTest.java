package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String data="ABCD"; 
		//Ŭ���� �ȿ� �ִ� �迭�� �����ϱ� ���� �޼ҵ� ���
		System.out.println(data.length());
		System.out.println(data.charAt(1)); //1���濡 �ִ� B�� ��µ�
		System.out.println(data.indexOf("D")); //D�� �ִ� index�� ��ȣ�� 3�� ��µ�
	}
}

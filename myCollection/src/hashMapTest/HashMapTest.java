package hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
//		String�� Ű, Integer�� value�̰� �츮�� �ñ��� ���� ������!!
		HashMap<String ,Integer> productMap = new HashMap<String, Integer>(); //key,value
		productMap.put("�ڵ���",1_000_000); //�ڵ��� ���� �ֱ�
		productMap.put("���������", 400_000_000); //int�� 21����� ��, ��������� ���� �ֱ�
		productMap.put("���̽�ũ��", 3_000); //���̽�ũ�� ���� �ֱ�
		
		System.out.println(productMap);
//		put�� ������(�ٲ�� ��) �ִ� value���� return ���ش�. 
		System.out.println("���� ����: "+productMap.put("���������", 450_000_000)); 
//		�� ��쿡�� ���� ��µ��� ����.
		System.out.println(productMap.put("���", 450_000_000)); 
//		������ �ٲ�� �ؿ����� �� ����ż� ��µ�
		System.out.println(productMap);
		
		System.out.println(productMap.get("�ڵ���")+"��"); //key���� ����

	}

}

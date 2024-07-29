package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest/*<T>*/ {
	
//	T data;
	
	public static void main(String[] args) {
//		<?> ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���.
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� ���� �ֱ� ������
//		Object�� �ƴ� ���׸����� �����Ѵ�.
//		ArrayListTest<Integer> arrayListTest = new ArrayListTest<Integer>();
//		���� ���� �ڵ忡�� <>�ȿ� �ִ� �κ��� �ڷ����� � �� ������ ���� data�� �ڷ����� �޶����� ��.		
		
//		capacity(�뷮): �̸� Ȯ���� ���� ����, ���� �޸��� �Ѱ踦 Ȯ���� �� �ִ�.
//		�뷮�� ������ �ִ� ���� �ƴ϶� ������ Ȯ���ϴ� ���̴�!! 
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(10);
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(80);
		datas.add(30);
		datas.add(70);
		datas.add(20);
		datas.add(60);
		
		System.out.println(datas.size());
		
//		data�� datas�� �ִ°͵��� ���ʷ� ��� ����ϱ�
		for(int data : datas) {
			System.out.println(data);
		}
		
		System.out.println(datas);
		
//		���� ����
		Collections.sort(datas);
		System.out.println(datas);
		
//		����� �������� �¿� �ݴ�� �ٲٱ�
//		���� ������������ �����͸� ���� �ʹٸ� �켱 ���� �������� ���� ��Ų ������ reverse �޼ҵ带 ����ؾ� �Ѵ�.
		Collections.reverse(datas);
		System.out.println(datas);
		
//		����
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		����, 60�� �׻� 30�ڿ� ���Եȴ�.
		if(datas.contains(60)) {
//			indexOf() �޼ҵ�� ���� �ε��� ��ȣ�� ����� 
//			60�ڿ� 30�� �����ϴ� �Ŵϱ�, 60�� �ִ� index��ȣ �������� index�� �����ؼ� �����ϸ� ��
			datas.add(datas.indexOf(60) + 1, 30);
			System.out.println(datas);
		}
		
//		����, 10�� 1�� �����Ѵ�.
		if(datas.contains(10)) {
//			set(�ε��� ��ȣ, ��ü�� ����)
//			����Ʈ�� �ִ� Ư���� ��ġ�� ���� ���ϴ� ������ ������ �� �ְ� ���ִ� ��.
			System.out.println(datas.set(datas.indexOf(10), 1) + "�� 1�� �����Ǿ����ϴ�.");
			System.out.println(datas);
		}
		
//		����, 20�� �����Ѵ�
//		1. �ε����� ����
//		if(datas.contains(20)) {
//			System.out.println(datas.remove(datas.indexOf(20)) + " �����Ǿ����ϴ�.");
//			System.out.println(datas.contains(20));
//		}
		
//		2. ������ ����
		if(datas.remove(Integer.valueOf(20))) {
			System.out.println("���� ����");
			System.out.println(datas.contains(20));
		}
	}
}
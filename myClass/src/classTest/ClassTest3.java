package classTest;
//this �����ϱ� ���� ���� Ŭ����

class Fruit{
	String name,color;
	int price;
	
	public Fruit(String name, String color, int price) {
		this.name = name;
//		�̷��� �ؾ� Fruit ��ü�� name �Ӽ� = name �Ű������� ��
		color = color; // �̷��� �ϸ� �Ű����� �̸��� �����ϴ� �̸��� �Ȱ��� �Ǳ� ������ ������ �Ұ�����.
		price = price;
	}
}

public class ClassTest3 {
	public static void main(String[] args) {
//		������ �ڵ尡 �ϳ��� ���� ��쿡��, �⺻ �����ڰ� �ڵ������� �������� ����
//		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit("�ٳ���", "�����", 1000);
		System.out.println(fruit2.name); //�̷��� �ϸ� name�� ���������� �� ��µ�
		System.out.println(fruit2.color); //color�� null���� �� ����
		System.out.println(fruit2.price); //price�� 0�� �� ����
	}
}

package classTest;
//this �����ϱ� ���� ���� Ŭ����

class Fruit{
	String name,color;
	int price;
	
	public Fruit(String name, String color, int price) {
		this.name = name;
//		�̷��� �ؾ� Fruit ��ü�� name �Ӽ� = name �Ű������� ��
		color = color; // �̷��� �ϸ� �Ű����� �̸��� �����ϴ� �̸��� �Ȱ��� �Ǳ� ������ ������ �Ұ�����.
//		��....�ᱹ�� �����ϱ� ���� ���°� ������, ����Ե� �̷��� �����ϼ̳�.....?
		price = price;
	}

}

public class ClassTest3 {
	public static void main(String[] args) {
		Fruit fruit = new Fruit("�ٳ���", "�����", 1000);
		System.out.println(fruit.name); //�̷��� �ϸ� name�� ���������� �� ��µ�
		System.out.println(fruit.color); //color�� null���� �� ����
		System.out.println(fruit.price); //price�� 0�� �� ����
	}
}

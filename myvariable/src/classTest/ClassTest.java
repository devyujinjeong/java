package classTest;

// ����: �߰�ȣ
// ����: Ŭ���� �߰�ȣ (���� ū ������ ����)
// ����: Ŭ���� �߰�ȣ �̿��� ��� �߰�ȣ

class Data{
//	���������� ��ü���� ���� �޶�� �ϴ� ���̴�.
//	���������� �ڵ��ʱ�ȭ �ȴ�.
	int data=10;
	
//	static�� ����ؾ��ϴ� ����: ���������� ��� ��ü�� �����ؾ� �ϴ� ���̴�.
	static int data_s=10; 
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		Data object=new Data();
//		���������� �����Ϸ��� �޸𸮿� �Ҵ����ֱ� ������
//		�������� ������ ���� �ʴ´�.

		object.increase_s();
		object.increase_s();
		object.increase_s();
		object.increase_s();
		object.increase_s();
		object=new Data(); 
		object.increase_s();
		object.increase_s();
		object.increase_s();
		object.increase_s();
		object.increase_s();
		
//		���������� �����ڸ� ���� �޸𸮿� �Ҵ�Ǳ� ������
//		�ٸ� �ʵ��� �ּҰ� ������ �Ǹ� �ʱ�ȭ�ȴ�.
		
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();	
//		object=new Data(); //�̷��� ���� �� ���, ���� object�� �ʵ�� ���󰡹�����
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
	}
}

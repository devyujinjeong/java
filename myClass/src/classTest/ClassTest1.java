package classTest;

class A{ //A��� Ŭ���� ����
//	�ʵ�� ������ �޼ҵ� �� �ʵ��� �̾߱��� 
	int data; //data��� �ʵ� �ϳ� �����ϱ�
	
	void printData() { //printData��� �ʵ�(�޼ҵ�)
		System.out.println(data); 
		//�̰� �̷��� ���� ������, ����ü � �ʵ��� data�� �ǹ��ϴ� ����?!�̷� �ǹ� ������ this ���
		System.out.println(this); //�ּҰ� ���
		System.out.println(this.data); //�� ���
	}
}

public class ClassTest1 {
	public static void main(String[] args) {
//		��üȭ �ϱ� 
		A a = new A(); //new A()�� �ʵ��� �ּҰ����� ����
		//a�� ���� A�� �ִ� �ʵ忡 �����ϱ� ���ؼ� AŸ���� ����
		//A()�� ���� A�ʵ带 heap �޸𸮿� ���Ӱ� �Ҵ�����.
		A b = new A();
		
		a.data = 10; // ���� �������, �ּҿ� �ִ� �ʵ尡 ���� -->�״ϱ� data�� �ִ� �ּҸ� �ҷ����ֶ�� �ǹ�
		b.data = 20;
		
		a.printData(); //�� �ڵ带 �����鼭 ���� �޼ҵ尡 ����ǰ�, a�� �ּҰ��� ��� �� �Ŀ� ���� ��µǴ� ����
		b.printData(); //�� �ڵ带 �����鼭 ���� �޼ҵ尡 ����ǰ�, b�� �ּҰ��� ��� �� �Ŀ� ���� ��µǴ� ����
		
		System.out.println(a); //�ּҰ� ���
		System.out.println(b); //�ּҰ� ���
	}
}

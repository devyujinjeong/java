package inheritanceTest;

class A{
	String name;
	int data;
	
//	�⺻ �����ڿ� �ʱ�ȭ �ϱ�!! �⺻ �����ڴ� �Ű������� ���� ������ (������ �̷��� ���� ���̱�)
	public A() { 
		//�θ� �����ڿ� �ڽ� ������ �� �� ���� ���� ȣ��Ǵ��� �˾ƺ��� ���� �ڵ�
		System.out.println("�θ� �����ڰ� ȣ���"); 
		this.name = "A";
		this.data = 10;
	}
	
//	�̸��� ����ϴ� �޼ҵ�
	void printName() {
		System.out.println(name);
	}
}

//  ���, A�� �θ� Ŭ������ B�� �ڽ� Ŭ����
class B extends A{
	public B() {
//		this()�� super()�� ���ÿ� ���� �ۼ��� �� ����.-->�� �� ����Ǳ� ������, �ϳ��� �ۼ��ϱ�
		super(); //�θ� ������ ȣ�� -->��� �����Ϸ��� �˾Ƽ� �ۼ��ؼ� ������ ����
		//�θ� �����ڿ� �ڽ� ������ �� �� ���� ���� ȣ��Ǵ��� �˾ƺ��� ���� �ڵ�
		System.out.println("�ڽ� ������ ȣ���");
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b=new B(); //�ڽ� �����ڸ� ȣ���ϸ� �ڵ������� �θ� �����ڰ� ȣ���
		System.out.println(b.data); //�θ� Ŭ������ ���
//		name�� �ּҰ��� ���� �����ͼ� B�� �־���.
		b.name="B";
		b.printName();
	}

}

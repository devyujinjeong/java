package inheritanceTest;

class Human {
	String name;
	
	public Human() {;} //�⺻ ������ �����ϱ�

//	������ �����ϱ�
	public Human(String name) {
		this.name = name;
	}
	
//	�Ա� �޼ҵ� �����ϱ�
	void eat() {
		System.out.println("�Ա�");
	}
	
//	�ȱ� �޼ҵ� �����ϱ�
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
}
//	�θ��� ���� ��� �޾Ҵµ�, ���� �ȵ�� ��쿡�� ��� �ұ�?
class Monkey extends Human{
	@Override //�������̵� �ϰ� ���� �޼ҵ� �̸��� �ۼ��ϰ�, ctrl+spacebar+enter
//	walk() �޼ҵ� �������̵� �ϱ�
	void walk() {
		super.walk(); //�������̵� �� ��, �̰� �״�� �ΰ� �ؿ� �ٸ� �͵��� �߰��ϰ� ���� ��
		System.out.println("�� �߷� �ȱ�");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}











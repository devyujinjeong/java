package classTest;

// ���� Ŭ���� ����
// �������� ����̰� �ִ�.
// ��� ������ �̸��� ���̰� �ִ�.
// ������ ����̴� ���� ���̸� �˰� �ֱ� ������, �̸��� �ٽ� ���� ������� �Ѵ�.
// �� ��Ȳ�� �°� Ŭ������ �����ϰ� �ʵ带 �����϶�.
class Animals{
	String name;
	int age;
	
//	�����ε� �ϱ�(�������� ������� �����ڸ� ���� �������)
//	�������� �̸��� ���� ��� �˰� �ֱ� ������ name�� age�� �� �� ���� ����!!
 	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
// 	����̴� ���̸� �˰� �ֱ� ������, age�� ���� ����!!
	public Animals(int age) {
		this.age = age;
	}
}

public class ClassTask4 {
	public static void main(String[] args) {
//		�������� �迭�� �����ϱ�!!
		Animals[] animal= {
				new Animals("����",24),
				new Animals(2)
		};
		
		System.out.println(animal[0].name);
		System.out.println(animal[0].age);
		
		System.out.println(animal[1].age);
		System.out.println("����̾� �׷��� �� �̸��� ����??");
		
		
	}
}



package methodTest;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); �̷��� �ۼ� �Ұ���
	}

	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // classVar���� ���� ����
//		System.out.println(Foo.instanceVar); //�Ұ���
		Foo.classMethod();
//		Foo.instanceMethod(); --> instance �Ҽ��̹Ƿ�, ��ü�� ���� ������ �Ŀ� �޼ҵ带 ����� �� �ִ�. 

		// ��üȭ
		Foo f1 = new Foo();
		Foo f2 = new Foo();

		System.out.println(f1.classVar); // I class var ��µ� --> ������ �ٷ� Ŭ������ �����ؼ� �����
		System.out.println(f1.instanceVar); // I instance var ��µ�

		f1.classVar="changed by f1";
//		static�� ����ϰ� �Ǵ� ��쿡 f1, f2�� ��üȭ �� �ڿ� ����ϸ�
//		static�� �����Ϸ��� �޸𸮿� ���� ���� �Ҵ����ֱ� ������
//		���ʿ� ���� ��°�� �ٲ�� �Ǵ� ���̰�, �׷��� ������ � ��ü�� ����ؼ� ����ϴ��� ������ ��µ�!! �� �����Ǵ� ����!

		System.out.println(f1.classVar); //changed by f1 ��µ� 
		System.out.println(f2.classVar); //changed by f1 ��µ� 

//		f1.instanceVar = "changed by f1";

//		static�� �ƴϱ� ������ �ٸ� ��ü���� ������ ��ġ�� ����
//		System.out.println(f1.instanceVar); // changed by f1 ��µ�
//		System.out.println(f2.instanceVar); // I instance var ��µ�

	}

}

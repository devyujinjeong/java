package methodTest;

//�̰� �׳� ���� ���ظ� ���� ���ؼ� ���� method class
class Foo{
	public static String classVar="I class var";	
	public String instanceVar="I instance var";
	public static void classMethod(){
		System.out.println(classVar);
//		System.out.println(instanceVar);
	} 
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); //classVar���� ���� ����
//		System.out.println(Foo.instanceVar);   //
		Foo.classMethod();
//		Foo.instanceMethod(); --> instance �Ҽ�
		
		Foo f1=new Foo(); //��üȭ
		Foo f2=new Foo();
		
		System.out.println(f1.classVar); //I class var ��µ�
		System.out.println(f1.instanceVar); //I instance var ��µ�
		
//		f1.classVar="changed by f1";
//		�״ϱ� static�� ����ϰ� �Ǵ� ��쿡 f1, f2�� ��üȭ �� �ڿ� ����ϸ�
//		static�� �����Ϸ��� �޸𸮿� ���� ���� �Ҵ����ֱ� ������
//		���ʿ� ���� ��°�� �ٲ�� �Ǵ� ���̰�, �׷��� ������ � ��ü�� ����ؼ�(?) ����ϴ��� ������ ��µ�!! �� �����Ǵ� ����!
//		�� �׷��� �̰� �� ������� �ڵ��� ����� �� �ߴ� ��� ����.
//		static�� ����ϸ� ����Ǵ� ���� �����ǰ� �Ǵ� ���̰�, ���࿡ ���� �ٲٸ� �ѹ��� �ٲ�� �Ǵ� ����!! ����!! �� ���
		
		
//		System.out.println(f1.classVar); //changed by f1 ��µ� 
//		System.out.println(f2.classVar); //changed by f1 ��µ� 
		
		f1.instanceVar="changed by f1";
		System.out.println(f1.instanceVar); //changed by f1 ��µ� 
		System.out.println(f2.instanceVar); //I instance var ��µ� 
		
		
	}
	

}

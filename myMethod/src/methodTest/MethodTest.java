package methodTest;

public class MethodTest {
	
//	f(x) = 2x + 1
	static int f(int x){ // �̸��� ���� � ���� �ϴ� �޼ҵ����� �˾ƺ��� ����� ������, �� �ڵ忡���� ���Ǹ� ���� f��� �̸��� ���ڴ�.
		int result=2*x+1;
		return result;
	}
	
//	static
//	�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//	�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ��� �� ���� ����� �����Ѵ�.
//	1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//	2. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.  
	
	public static void main(String[] args) { //main�� �޼ҵ�
//		MethodTest methodTest=new MethodTest();
//		methodTest.f(3); // ����ϰ� �ȴٸ� 7�� ��µ�
		
		MethodTest.f(4); // ��ü ���� ���� Ŭ������ ���� �޼ҵ� ���� ȣ�� ����
	}
}

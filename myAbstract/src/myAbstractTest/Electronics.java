package myAbstractTest;

public abstract class Electronics {
//	�߻�޼ҵ�� �ݵ�� �������϶�� �������� �ο��ϱ� ���ؼ� �����.
//	��ü���� �����ΰ� ����
	public abstract void on();
	public abstract void off();
	
	public void welcome() {
		System.out.println("���� ��ǰ�� ����� �ּż� �����մϴ�");
	}
	
//	final �޼ҵ�� �ٸ� ������ �����ǵ� �� ����.
	public final void shutDown() { 
		System.out.println("���� ���� �� 119 �Ű�");
	}
	
}

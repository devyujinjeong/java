package myAbstractTest;

public abstract class Electronics {
//	�߻�޼ҵ�� �ݵ�� �������϶�� �������� �ο��ϱ� ���ؼ� �����.
	public abstract void on();
	public abstract void off();
	
//	final �޼ҵ�� �ٸ� ������ �����ǵ� �� ����. �ڽľ� ������ ���� ���ƶ�~!!
	public final void shutDown() { 
		System.out.println("���� ���� �� 119 �Ű�");
	}
}

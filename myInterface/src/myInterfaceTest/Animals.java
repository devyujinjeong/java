package myInterfaceTest;

public interface Animals {
//	�������̽��� ����� �߻�޼ҵ常 ������ ����!!
	int eyes=2; //final static�� �����Ǿ� ����. �������̽������� ����ۿ� ������ �ȵǱ� ������!!
	final static int nose=1; //static�� ������ ���� ����� �ִ� ��

	public void sitDown(); //�߻� �޼ҵ�ۿ� ������ �ȵǱ� ������ abstract�� ���� ����!!
	public void waitNow(); 
	public void poop();
	public void bang();
	public void showHand();
}

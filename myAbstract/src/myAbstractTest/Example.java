package myAbstractTest;

public class Example {
	public static void main(String[] args) {
		Refrigerator rf = new Refrigerator();
		Airconditioner ac = new Airconditioner();
		
		// ���� on()�̶�� ����ε� 
		// ������ Ŭ�������� ��� �����ߴ����� ����
		// �ٸ� ����� �����س�
		rf.welcome();
		rf.shutDown();
		rf.on(); 
		rf.off();
		
		ac.welcome();
		ac.shutDown();
		ac.on();
		ac.off();
	}
}

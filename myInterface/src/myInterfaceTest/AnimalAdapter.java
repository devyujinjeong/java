package myInterfaceTest;

//	�������̽��� �������� �����ִ� Ŭ���� (�߻� Ŭ����)
public abstract class AnimalAdapter implements Animals {
// 	���� �߻�޼ҵ�� �������� �ο��ϴ� �޼ҵ���
//	�׷��� ���⿡���� �������� �����ִ� �뵵�� ��� (�ڿ� adapter�� �ٿ������ν� �̸� ǥ������)
//	�׸��� ������ �ؾ� �� �͵��� ������ �͵��� ��� �߰�ȣ�� ���� �������� ������ ����
//	�� ��쿡�� Tiger���� �����ǰ� �ʿ��� ���� poop�ۿ� ���� ������ �������� �� �������� �����ֱ� ���� �߰�ȣ�� �������
	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("�ɾ�");
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("��ٷ�");
	}

	@Override
	public void bang() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void showHand() {
		// TODO Auto-generated method stub
		System.out.println("��");
	}

}

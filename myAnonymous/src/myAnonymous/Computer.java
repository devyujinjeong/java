package myAnonymous;

public class Computer {
	public static void main(String[] args) {
//		Game�̶�� �������̽�
//		Game()�� �ڿ� �ִ� �͵��� �޸𸮿� �ø��� �� --> �͸� Ŭ������ �޸𸮿� �÷��ִ� �͸� Ŭ���� ������
//		�޼ҵ�� Ŭ���� �ȿ��� ����Ǵ� ���̹Ƿ�, Game()�ڿ� ��ȣ{}�� Ŭ���� �߰�ȣ
//		�ٵ� ���⼭ ���� Ŭ���� �߰�ȣ �տ� �̸��� ����.
//		���� ���⿡�� �����ϰ� ���ΰ���
		
		Game game = new Game() {
			
			@Override
			public void play() {
				System.out.println("����");
			}
			@Override
			public void exit() {
				// TODO Auto-generated method stub
			}
		};
		
		game.play();
	}
}

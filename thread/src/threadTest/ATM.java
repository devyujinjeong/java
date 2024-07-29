package threadTest;

public class ATM implements Runnable{
	private int money;
	
	public ATM() {
		this.money = 10000;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw();
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
	
	public synchronized void withdraw() {
//		synchronized (this) {
			this.money -= 1000;
//		}
		System.out.println(Thread.currentThread().getName() + "��(��) 1000�� ���");
		System.out.println("���� �ܾ�: " + this.money + "��");
	}
	
	
}



















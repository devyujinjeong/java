package threadTest;

public class ATM implements Runnable{
	private int money;
	
	public ATM() {
		this.money=10_000;
	}

	@Override
	public void run() {	//run���� ���� �޼ҵ�, ���� ��� �ڿ�
		for(int i=0; i<5; i++) {
			withdraw();
			try {Thread.sleep(500);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}
	
	public synchronized void withdraw() {
//		synchronized (this) {
			this.money -= 1000;
//		}
		System.out.println(Thread.currentThread().getName()+"��(��) 1000�� ���");
		System.out.println("���� �ܾ�: "+ this.money +"�� ");
	}
	
	
}

package threadTest;

public class Thread1 extends Thread{
	public String data;

	public Thread1() {;}
	
	public Thread1(String data) {
		super();
		this.data=data;
	}

	@Override
	public void run() { //�ڿ� --> run�� �ۼ��� �ڵ尡 thread
		for(int i=0;i<10;i++) {
			System.out.println(data);
			try {sleep(1000);} //Thread�� ��ӹ޾ұ� ������ �ٷ� �̷��� �� �� ����.
			catch (InterruptedException e) {;} 
			}
		}
	}


package threadTest;

public class Thread2 implements Runnable {
	@Override
	public void run() { //�ڿ�
		for(int i=0; i<10; i++) {
//			run�̶�� ���� this ���� �����̶�� �����ϸ� ��
			System.out.println(Thread.currentThread().getName()); //run�� ���� ������ �� ��ü
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {;}
		}

		
	}
	

}

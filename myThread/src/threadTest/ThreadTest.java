package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable t1 = new Thread2(); //Thread2�� �θ�� Runnable
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1,"��");
		Thread thread2 = new Thread(t2,"��");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ������ ����");
		
		
//		Thread1 t1 = new Thread1("!");
//		Thread1 t2 = new Thread1("?");
		
//		t1.run();
//		t2.run();
		
//		�����ٸ�(��Ƽ������� �ٲ��ִ� ��)�� ���ִ� �޼ҵ尡 start()
//		t1.start();
//		t2.start();
		
	}

}

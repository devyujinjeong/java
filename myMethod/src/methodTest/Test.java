package methodTest;

public class Test {
	void change(int[] data) {
		data[0]=20;
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		int[] data= {10}; //������ int data�� ���� int data�� �ٸ�
		test.change(data); //data�� 20���� �ٲ��ִ� �޼ҵ� ����
		System.out.println(data[0]); //20�� ��� --> �ּҰ��� �޾ƿ�, �ּҰ��� ���� �ߺ��� ����
	}
}

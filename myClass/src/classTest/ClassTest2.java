package classTest;

//����: �߰�ȣ
//����: Ŭ���� �߰�ȣ
//����: Ŭ���� �߰�ȣ �̿��� ��� �߰�ȣ 

class Data{
//	���������� ��ü���� ���� �޶�� �ϴ� ���̴�.
	int data=10;
//	���������� ��� ��ü�� �����ϴ� ���̴�. 
	static int data_s=10;
	
	void increase() {
		System.out.println(++data);
	}


	void increase_s() {
		System.out.println(++data_s);}
	}

public class ClassTest2 {
	public static void main(String[] args) {
		Data object=new Data();
		
//		���������� �����ڸ� ���� �޸𸮿� �Ҵ�Ǳ� ������
//		�ٸ� �ʵ��� �ּҰ� ������ �Ǹ� �ʱ�ȭ�ȴ�.
		
//		object.increase(); //���������� �ۼ��߱� ������ 11���� ��µ�
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object=new Data(); //���⿡���� ���Ӱ� �����ڰ� ���ܳ��� ��
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
	
//		���������� �����Ϸ��� �޸𸮿� �Ҵ����ֱ� ������ 
//		�������� ������ ���� �ʴ´�.
		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		
//		object=new Data();
//		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
		
		
	}
	
	

}

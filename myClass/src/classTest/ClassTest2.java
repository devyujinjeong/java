package classTest;

//����: �߰�ȣ
//����: Ŭ���� �߰�ȣ
//����: Ŭ���� �߰�ȣ �̿��� ��� �߰�ȣ 

class Data{
//	���������� ��ü���� ���� �ٸ� ��
	int data_i=10;
//	���������� ��� ��ü�� �����ϴ� �� (��� �ݺ��ؼ� ���� ����� ���� ���)
	static int data_s=10;
	
	void increase_i() {
		System.out.println(++data_i);
	}


	void increase_s() {
		System.out.println(++data_s);}
	}

public class ClassTest2 {
	public static void main(String[] args) {
		Data object=new Data(); // �⺻ �����ڸ� ������ ���� ���������� �ʾұ� ������, �ڵ������� �����Ϸ��� �⺻ �����ڸ� ������
		
//		���������� �����ڸ� ���� �޸𸮿� �Ҵ�Ǳ� ������
//		�ٸ� �ʵ��� �ּҰ� ������ �Ǹ� �ʱ�ȭ�ȴ�.
		
		object.increase_i(); // ���������� �ۼ��߱� ������ 11���� ��µ�
		object.increase_i();
		object.increase_i();
		object.increase_i();
		object.increase_i();
		
		object=new Data(); // ���⿡���� ���Ӱ� �����ڰ� ���ܳ��� ��
		
		object.increase_i(); // �ٽ� 11���� ��� ����
		object.increase_i();
		object.increase_i();
		object.increase_i();
		object.increase_i();
	
//		���������� �����Ϸ��� �޸𸮿� �Ҵ����ֱ� ������ 
//		�������� ������ ���� �ʴ´�.
//		11���� 20���� ��µ�
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		
//		object=new Data(); // �����ڿ� ������ ���� ����
//		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();		
	}
	
	

}

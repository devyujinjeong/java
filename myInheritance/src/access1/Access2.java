package access1; // ���� ��Ű��

public class Access2 { //�ٸ� Ŭ�������� �����ϱ�
	public static void main(String[] args) {
		Access1 access1=new Access1(); //���� ��Ű��, �ٸ� Ŭ����
	
		// data4�� �����ϰ� ���� ����
		System.out.println(access1.data1);
		System.out.println(access1.data2);
		System.out.println(access1.data3);
		System.out.println(access1.getData()); // getter�� ����ϸ� ������ ������
	}
}

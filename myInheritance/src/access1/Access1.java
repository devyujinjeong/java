package access1;

public class Access1 {
	int data1; //�ƹ��͵� �Ⱦ��� default
	public int data2; //��� ������ ���ٰ���
	protected int data3; //�ٸ� ��Ű������ ���� �Ұ�, �ڽ��� ��� 
	private int data4; 
//	ĸ��ȭ, ����ȭ
//	���� ���� ���� --> Access2��� Ŭ���������� ���� �Ұ���
	
	public Access1() {
		this.data1=10;
		this.data2=20;
		this.data3=30;
		this.data4=40;
	}
	
	// getter, setter �޼ҵ�
	public void setData(int data4) {
		this.data4=data4;
	}
	
	public int getData() {
		return data4;
	}

}

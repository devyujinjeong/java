package myOperTest;

public class Oper4 {
	public static void main(String[] args) {
		//���� ������ Ȯ���ϱ�!!
		int data=10;
		System.out.println(data=data+1);
		System.out.println(data+=1);
		System.out.println(data++); //���� ���� ��µǰ� ����, ��������� ���⿡���� 12�� ��µǰ� ���� 1 ����
		System.out.println(data); //������ ���� �����ǰ� ������ ������ 13�� ��µ�
		System.out.println(++data); //���� ��� �ݿ���. ���� 1�����ϰ� ��µ�
	}

}

package myOperTest;

public class Oper5 {
	public static void main(String[] args) {
//		1~10���� �� 4������ ���
		for(int i=0;i<10;i++) {
			System.out.println(i+1); 
			// ������� �����ϸ� 1~10���� ��µ�. 
			// ����� i�� 0���� �����̱� ������ 1~10���� ����ϱ� ���ؼ��� i�� 1�� ���ؼ� ���. �ȱ׷� 0~9���� ��µ�
			if(i==3) {break;}
			//���࿡ i�� 3�� ��� if���� ���δ� �߰�ȣ�� Ż���Ѵ�!! 
		}
		
//		1~10���� �� 4�����ϰ� ���
		for(int i=0;i<10;i++) {
			if(i==3) {continue;} 
			//���� i�� 3�̶�� ���� �ݺ����� �Ѿ��. ��, i�� 3�� ��� �ڵ带 �������� �ʰ� �������� �Ѿ��!!
			System.out.println(i+1);
		}
	}

}

package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData= {3,5,2,8,9}; //� ���� ������ �˰� ���� ��
		
		System.out.println(arData); //�ּҰ��� ���
		System.out.println(arData.length); //�迭�� ���� 
		
		for (int i=0;i<arData.length;i++) {
			System.out.println(arData[i]); //0~4���濡 ��� ���� ���
		}
//		
//		5,4,3,2,1�� arData�� ������� �ְ� ���
		for (int j=0;j<arData.length;j++) {
			arData[j]=5-j; //5~1������ arData�� �ֱ�
			System.out.println(arData[j]);
		}
		
	}
}

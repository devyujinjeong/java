package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		char data=48; //48�� �ǹ��ϴ� ���ڷ� �� 
		System.out.println('A'+3); //'A'�� 65��. �׸��� ���⿡ 3�� ���ؼ� 68�� ��µ�
		
		System.out.println(data);  //0�� ��µ�. 48�� �ƽ�Ű�ڵ�� '0'��	
		System.out.println(data+5); 
		//48�̶�� ������ ���ڷ� ��ȯ�ϸ� '0'���� ��ȯ�� �׷��� data+5�� '0'+5=53�� ������ ��
		//0�� 5�� ���ߴµ� �� 5�� �ƴ���? �� �� �ϳ��� �ڷ����� �ٸ��ٴ� ���� ����ϱ�!!
		System.out.println((int)data);
	}

}

package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 10.9, 'A', true, "ABC"
//		�� 5���� ���� 5ĭ �迭�� ���� �� ���
//		�⺻ �ڷ����� �ϳ��� Ÿ������ ���� �� ����.
//		������ Ŭ���� Ÿ���� ��� Object Ÿ���̴�. (Object�� �ֻ��� Ŭ������� �����ϸ� ��)
//		�׷��� ���� ���� �ٸ� 5���� ���� ���� ����, Wrapper Class�� boxing�� ����ؼ� ��� ObjectŸ������ ������ ��
//		Object �迭�� �־��ش�.

//		�ؿ� datas���� 'A', true, "ABC"�� auto_boxing
// 		1, 10.9�� �翬�� auto_boxing ����
		Object[] datas= {Integer.valueOf(1),Double.valueOf(10.9),'A',true,"ABC"};
	
//		���� for��, forEach��, ���� for��
		for(Object data:datas) { //	datas�� �ִ� ������ data�� ������� ���
			System.out.println(data); // data ����ϱ�
		}
	}
}

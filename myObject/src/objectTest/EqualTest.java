package objectTest;

public class EqualTest {
	public static void main(String[] args) {
		Student student = new Student(1,"������","���а�");
//		�� �ڼ��ϰ� �м��ϸ�, ������ ���� �ʵ��� �ּҿ� �ؿ��� ���� �ʵ��� �ּҴ� �ٸ�
//		�ֳ�? �����ڰ� 2�� ȣ��Ǿ����ϱ�, �翬�� �ʵ��� �ּҴ� �ٸ�����!!
//		�� ��� �ȿ� �� �ִ� ���� ������, �ּҰ� �ٸ��� ������ false�� ����ϰ� ��
		System.out.println(student==new Student(1,"������","���а�"));
		
//		�����ǵ� equals ����ϱ�
		System.out.println(student.equals(new Student(1,"������","���а�")));
	}

}

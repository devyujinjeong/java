package objectTest;

import java.util.Random;

public class ToStringTest {
	public static void main(String[] args) {
		Student student=new Student();
//		���� ���� ���� number,name,major�� �� ����ڰ� �Է��ؾ� �ϴ� ������
//		��, ����ڰ� �Է��� ������ �ʱ�ȭ �Ǵ� ����
//		�׸��� �ؿ��� print�� �ϴµ�, student ��ü �ڿ� toString() �޼ҵ尡 �����Ǿ� �ִ°���.
//		�츮�� toString()�� ������ �߱� ������, ���� ����ڰ� �Է��� ������ Ȯ���� �� �ְ� ��.
		student.number=1;
		student.name="������";
		student.major="���а�";
		
		System.out.println(student);
		
//		Random r= new Random();
//		�׵��� ��ü�� ����� �� toString()�� �����Ǿ� �־���.
//		r�̶�� ��ü�� ���� toString() �޼ҵ带 ���
//		System.out.println(r.toString());
	}
}


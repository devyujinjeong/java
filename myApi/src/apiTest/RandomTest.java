package apiTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
//		������ ����Ǿ� �ִ� API
		Random random = new Random();
//		nextInt��� �� �ȿ� �ִ� ���� �������� ������ ��
//		��, �� ��쿡�� 0~2���� ���� �߿��� �������� ���ڰ� ����
		System.out.println(random.nextInt(3)); 
	}

}

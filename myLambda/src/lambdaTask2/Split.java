package lambdaTask2;

public class Split {
	public static void main(String[] args) {
		String expression="1+9-7";
//		���� 1+9-7�̶�� String�� +�Ǵ� -�� �����ְ� numbers��� String �迭�� �ٹ�
		String[] numbers=expression.split("\\+|\\-");
		
//		�迭�� ���� �͵��� ������ ��ȯ�ϱ�
		for(int i=0;i<numbers.length;i++) {
			System.out.println(Integer.parseInt(numbers[i]));
		}
	}
}

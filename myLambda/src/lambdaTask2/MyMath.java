package lambdaTask2;

public class MyMath {
	public static Calc operator(String oper) {
		//���� ������ ����ϱ�!! 
//		���࿡ oper�� ��ȣ�� "+"�� ���ٸ� �ΰ��� ���� ���� return, �ƴ϶�� �� ���� �� ���� return
		return oper.equals("+")? (num1,num2)->num1+num2:(num1,num2)->num1-num2;
	}
	
	public static void main(String[] args) {
//		�Լ��� �������̽��� �޼ҵ� �����
		OperCheck operCheck = e -> {
//			�̰� null�� �ִ°Ͱ� ""�� �ִ°��� ���ӻ��� �ٸ��� �ִٰ� �ϼ̴µ�, �װ� ��Ȯ�� ����??
			String result="";
			for(int i=0;i<e.length();i++) { //�Է��� e�� ���̸�ŭ �ݺ��ϱ�.
				char c=e.charAt(i); 
				// e�� ������ ���ڵ��� char ���� c�� ���
				// ����� charAt(i)�� i��° �濡 �ִ� ���ڰ��� �ǹ���.
				if(c=='-'||c=='+') { //���࿡ c�� - �Ǵ� +���
					result+=c; // result�� +,- ���
				}
			}
			return result.split("");
		};
		
		String expression="1+9-7";
		String[] opers = operCheck.getOpers(expression);
//		1+9-7�̶�� String�� +,- ������ ���� �ֱ�
//		�и��� �ڿ� numbers��� String �迭�� ��� �ֱ�
		String[] numbers=expression.split("\\+|\\-");

		int number1=0, number2=0;
		number1=Integer.parseInt(numbers[0]);
		
//		���ڰ� n���� ������ n-1����ŭ ������.
		for(int i=0;i<opers.length;i++) {
			number2= Integer.parseInt(numbers[i]+1);
			number1=MyMath.operator(opers[i]).calculate(number1,number2);
		}
		
		System.out.println(number1);
		
	}
}
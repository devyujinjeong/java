package myOperTest;

public class Oper1 {
	public static void main(String[] args) {
		boolean isTrue=10>6; //10>6�� true�� false��� ������ ����
		
		System.out.println(10==11); //�̰� ������ �� �� �˾ƾ� ��!! true�� false��� ��!!
		System.out.println(10>3); //10>3�̸� true��� ��!!
		System.out.println(isTrue);
		System.out.println(isTrue&&10!=10); //true&&false:!=�� not�̶�� �ǹ� (and)
		System.out.println(isTrue||10!=10); //true||false (or)
		
//����� true�� �������� �����Ѵ�.
		System.out.println(!(isTrue&&10 !=10)); 
		//������ ���� false�� ������ �Ǵµ�, ���⿡ !�� ������ false�� �ݴ��� true�� ������ ��.
	}

}

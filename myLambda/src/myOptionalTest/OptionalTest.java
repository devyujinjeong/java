package myOptionalTest;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
//		NPE(NullPointerException)
//		�������� NPE�� �߻��ϸ�,
//		�ϳ��� ������ ã�⵵ ����� null �˻縦 ���� �ڵ尡 ����������.
		
//		Optional
//		���� ����� ���� Optional�ʵ忡 �����س���,
//		Optional�� �����ϴ� �پ��� �޼ҵ�� ���ϰ� NPE�� ����� �� �ִ�.
		
		String data=null;
		
//		of(T value) : ����� null�� �ƴ� ���� ���� �� ���
//		ofNullable(T value) : null�� �� �� �ִ� ���� ���� �� ���
		Optional<String> optionalData = Optional.ofNullable(data);
		
//		isPresent() �� Optional�� ��� ���� null �̸� fasle,
//		null�� �ƴϸ� true�̴�.
		System.out.println(optionalData.isPresent());
		
		if(optionalData.isPresent()) { //null�� �ƴϸ� true
			System.out.println(optionalData.get()); //���� ���� �����´�.
		}	
	
//		ifPresent(): null�� �ƴ� �� ������ ���ٽ��� ����ȴ�.
//		ifPresentOrElse(): null�� �ƴ� �� ù ��°�� ������ ���ٽ��� ����ǰ�, null�� �� �� ��°�� ������ ���ٽ��� ����ȴ�.
		optionalData.ifPresent(System.out::println);
//		null�� �ƴҶ��� �����ϰ�, null�϶��� "������ �����ϴ�." ����ϱ�
		optionalData.ifPresentOrElse(System.out::println, ()-> System.out.println("������ �����ϴ�."));
	}
}


















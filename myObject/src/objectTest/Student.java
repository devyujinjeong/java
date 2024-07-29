package objectTest;

public class Student {
	int number;
	String name;
	String major;
	
	public Student() {;}
	
	public Student(int number, String name, String major) {
		super();
		this.number = number;
		this.name = name;
		this.major = major;
	}

//	toString() ������ �ϱ�
//	ObjectŬ������ ��� Ŭ������ �θ��̱� ������ �������ؼ� ����ϸ� ��
	@Override
	public String toString() {
		return number + "," + name + "," + major;
		
	}

	@Override
//	���� �ణ fm��� �ڵ带 § ��
	public boolean equals(Object obj) {
		if(obj==this) {return true;} //obj �� ��(this)�� �ּҰ� ����? �� ó������ �ּ� ���ϱ�
		if(obj instanceof Student) { //obj �� Ȥ�� �л��̱� �ϴ�?
//			downcasting ����ϱ�
//			���� ���⿡�� ���� obj�� �ڷ����� Object��. ��������� ���� upcasting�Ǿ� �ִ� ������ ��.
//			�ֳĸ� upcasting �ϸ� student�� �ִ� �κ��� �߷��� upcasting�Ǳ� ������ number�� ����� �� ���� �ȴ�.
//			�̶� downcasting�� �����ν� number�� ����� �� �ְ� �������ִ� ���̴�. 
			Student anotherStudent = (Student) obj; 
			if(number==anotherStudent.number) {
				return true;
			}
		}
		return false; 
	}
}

package classTest;

class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member() {;}
	
	public Member(String name, String id, String password, int age) {
//		this�� ��ü �ڽ��� �� �ٸ� �����ڸ� ȣ���� �� �����
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}	
}

public class ClassTask5 {
	public static void main(String[] args) {
//		�⺻ �����ڸ� �������� ������ �̷������� ������� ����. �׷��� ������� �⺻ �����ڸ� �����϶�� �Ͻô� ��
		Member member = new Member();
		member.name = "������";
		member.age = 23;
		System.out.println(member.name);
		System.out.println(member.age);
	}
}

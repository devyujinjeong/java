package classTest;

class School{
	String name, major; // �ν��Ͻ� ���� 
	
	// �����ڴ� Ŭ������ �̸��� ����
	public School() {} // �⺻ ������
	
	public School(String name, String major) { // �Ű������� ���� ������, �Ű������� ���� ���� name�� major�� �����.
		this.name = name; // this.name�� �ν��Ͻ� ����, ������ name�� ���� ���� (�Ű�����)
		this.major = major; // this.major�� �ν��Ͻ� ����, ������ major�� ���� ���� (�Ű�����)
	}
	
	void showSchool(String name, String major) { // �б��� �а� ������ �����ִ� �޼ҵ�
		System.out.println("�б�:" + name);
		System.out.println("����:" + major);
	}
}

public class ClassTest4 {
	public static void main(String[] args) {
//		��üȭ �ϱ�
		School school1 = new School();
		School school2 = new School("������б�","���а�");
		
		school1.showSchool("������б�","���а�");
		
		System.out.println(school2.name);
		System.out.println(school2.major);
	}
}


package classTest;

class Student{
//	���� �����ϱ� 
	static int sequence; //��ȣ�� �����Ǿ� �����Ƿ� static���� �����ϱ�
	int studentId;
	int korScore, engScore, mathScore, total;
	double average;
	
//	�ʱ�ȭ ���: � �����ڸ� ȣ���ϴ��� �̰ͺ��� ����ǰ� �����ڰ� ȣ��� 
	{sequence++;}
	
//	������ �����ϱ�
	public Student(int korScore, int engScore, int mathScore) {
		this.studentId = sequence;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.total=korScore+engScore+mathScore;
		this.average=total/3.0;
	}
}
	
public class ClassTask2 {
	public static void main(String[] args) {
//		��üȭ �ϱ�!!
		Student student=new Student(20, 30, 40);
		Student student2=new Student(50, 60, 70);
		
		System.out.println(student.studentId);
		System.out.println(student2.studentId);
		System.out.println("����"+student.total+"��");
		System.out.println("���"+student.average+"��");

	}
}

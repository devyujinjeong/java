package classTest;

class Board{
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
//	1. this�� �̿��ؼ� �ߺ��� �����ϴ� ����!!
//	2. this.title�� �ڽ��� ������ �ִ� title�ʵ��� ��
//	�����ڿ� �޼ҵ��� �Ű� ���� �̸��� �ʵ�� ������ ���, �ν���Ʈ ����� �ǵ����� ����ϰ��� �� �� ���
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	
	Board(String title, String content) {
		this(title,content,"�α����� ȸ�����̵�","���� ��ǻ�� ��¥",0);
	}
	
	
	Board(String title, String content, String writer) {
		this(title,content,writer,"���� ��ǻ�� ��¥",0);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title,content,writer,date,0);
	}	
}

public class ClassTask6 {
	public static void main(String[] args) {
		Board board = new Board("���б�", "�а�");
		System.out.println(board.content);
		System.out.println(board.date);
		
	
	}
}

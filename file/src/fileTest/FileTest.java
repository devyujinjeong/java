package fileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	���� ������: throws
//	�޼ҵ� �ȿ��� ������ Exception�� ���� �߻��Ͽ� try~catch�� �ۼ��ؾ� �Ѵٸ�,
//	throws�� ���ؼ� ����� �κ����� Exception�� �����ش�.
//	throws�� ����ϸ� �� �̻� �޼ҵ� �ȿ��� �ش� Exception�� �߻����� �ʰ�,
//	�޼ҵ带 ����ϴ� �κп��� �� ���� try~catch�� ������ָ� �ȴ�(�ϰ�ó��).
	public static void main(String[] args) throws IOException{
//		���� ���: ��𼭵� ã�ư� �� �ִ� ���, C:/���� ���۵Ǹ� �������̴�.
//		��� ���: ���� ��θ� �������� ã�ư��� ���, ../a/c, ./a/d
//		��Ŭ�������� ���� ��δ� ��Ű�� ������ �ƴ϶� ������Ʈ �����̴�.
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
		bufferedWriter.write("�ѵ���");
		bufferedWriter.close();
		
		File file = new File("test.txt");
		file.delete();
	}
}



















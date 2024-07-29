package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	���� ������ : throws
//	�޼ҵ� �ȿ��� ������ Exception�� ���� �߻��Ͽ� try~catch�� �ۼ��ؾ� �Ѵٸ�,
//	throws�� ���ؼ�, ����� �κ����� Exception�� �����ش�.
//	throws�� ����ϸ� �� �̻� �޼ҵ� �ȿ��� �ش� Exception�� �߻����� �ʰ�,
//	�޼ҵ带 ����ϴ� �κп��� �ѹ��� try~catch�� ������ָ� �ȴ�. (�ϰ�ó��)
	public static void main(String[] args) throws IOException{
//		���� ���: ��𼭵� ã�ư� �� �ִ� ���, C:/���� ���۵Ǹ� �������̴�. (������ �����)
//		��� ���: ���� ��θ� �������� ã�ư��� ���, ../a/c, ./a/d(a/d�ε� �ᵵ ��)
//		��Ŭ�������� ���� ��δ� ��Ű�� ������ �ƴ϶� ������Ʈ �����̴�.
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt",true));
//		bufferedWriter.write("������"); //write�� �̾���� ������� ����
//		bufferedWriter.close(); //������ �ݰ� �� ���� �۾��� �����ؾ� ��.
		
//		File file = new File("test.txt");
//		file.delete();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
		String line=null;
		while((line=bufferedReader.readLine()) !=null) {
			System.out.println(line);
		}
		bufferedReader.close();		
	} 
}

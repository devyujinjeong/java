package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		�м�
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));
//		bufferedWriter.write("����\n");
//		bufferedWriter.write("����\n"); 
//		bufferedWriter.write("�ƿ���\n");
//		bufferedWriter.write("�Ǽ�����\n");
//		bufferedWriter.close();
		
//		�Ǽ������� �Ź߷� ����
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("fashion.txt"));
//		String line=null,temp=""; 
//		while((line=bufferedReader.readLine())!=null) {
//			if(line.equals("�Ǽ�����")){ //���࿡ �Ǽ������� �ִٸ�
//				temp+="�Ź�\n"; //�Ǽ����� ��ſ� �Ź��� temp�� �߰��ϱ�
//				continue; // �������� �Ѿ��
//			}
//			temp+=line+"\n"; //�ٸ� �͵��� �׳� temp�� �߰��ϰ� line���� ���Ⱑ ���� ������ ���� �߰����ֱ�!!
//		}
//		
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));
//		bufferedWriter.write(temp);
//		bufferedWriter.close();
		
//		�Ź� ����
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fashion.txt"));
		String line=null,temp=""; 
		while((line=bufferedReader.readLine())!=null) { //null�� ������ �ݺ��ϱ�
			if(line.equals("�Ź�")){ //���࿡ �Ź��� ������ �׳� ���� �ʰ� �Ѿ
				continue;  //�������� �׳� �Ѿ�� ���ؼ� ���
			}
			temp+=line+"\n";
		}
		
		bufferedReader.close(); //�� �ݾ���� ��
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));  // �����
		bufferedWriter.write(temp);  //temp�� �����
		bufferedWriter.close(); //�� �ݾ���� ��
		
		
	}

}

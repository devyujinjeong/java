package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
   public void printDoubleTime(int data) {
      System.out.println(data * 2);
   }
   
   public static void main(String[] args) {
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      StreamTest streamTest = new StreamTest();
      
//      forEach(): �ݺ�
//      ���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//      forEach() �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//      Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//      �Ű��������� �÷��� ��ü �ȿ� �ִ� ������ ������� ����,
//      ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
      
//	    ������ �ؿ�ó�� stream()�� ��� ������, ���� ����ϴ� �Ŷ� �׷� �ʿ䰡 ���� �������
//      datas.stream().forEach(data -> System.out.println(data));
//      datas.forEach(data -> System.out.println(data));
//      datas.forEach(System.out::println);
//      datas.forEach(streamTest::printDoubleTime);
      
//      IntStream
//      - range(start, end) : start���� end-1����
//      - rangeClosed(start, end) : start���� end����
      
//      IntStream.range(1, 11).forEach(System.out::println);
//      IntStream.rangeClosed(1, 10).forEach(System.out::println);
   
//      map() : ���� �� ����
//      IntStream.range(1, 11).map(data -> data * 2).forEach(System.out::println);

//      chars() : ���ڿ��� ���� �÷������� ���� --> �ƽ�Ű �ڵ� ����
//	   "ABC".chars().forEach(System.out::println);
//	   "ABC".chars().forEach(c -> System.out.println((char)c)); //���ڿ��� ���� �÷������� �����ϰ�, char������ �����Ͽ� return
//	   "�����̻�".chars().forEach(number->System.out.println(number));
      
//      filter() : ���ǽ��� true�� ��� ����
//      IntStream.rangeClosed(1, 10).filter(data -> data % 2 == 1).forEach(System.out::println);
      
//      collect() : ����� �پ��� Ÿ������ �������ش�.
//	   	�տ��� �۾��ߴ� ����� �ڿ��� �����ϰ� ���� ��.
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.range(1, 11).forEach(datas::add); //1~10����
//	    datas�� streamŸ������ �ٲ���� map�� ����� �� ���� (for each�� �����ϰ� �� �̷��� ����ؾ� ��.)
//	    upcasting�ؼ� ���� ��.
//	    List<Integer> results = datas.stream().map(data -> data * 2).collect(Collectors.toList());
//	    results.forEach(System.out::println);
//      
//	   	ArrayList<String> datas = new ArrayList<String>(Arrays.asList("10", "25", "15"));
//	   	String result = datas.stream().collect(Collectors.joining(":"));
//	   	System.out.println(result);
//      
//      sorted() : ����
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      
////      ���� �� stream API �۾� ����
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//      
////      ���� �ּҷ� �����Ͽ� ����
//      datas.sort(null); //��������
//      System.out.println(datas);
//      
//      datas.sort(Collections.reverseOrder()); //��������
//      System.out.println(datas);
//      
   }
}



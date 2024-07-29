package stream;
// day10������~ day11 ù�κ�

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//	    1~10���� ArrayList�� ��� �������� ���
		//�̰� rangeClosed(1~10����)�� ����ؼ� �����͸� ��� �� 
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 10).forEach(datas::add);
//	    datas.forEach(data -> System.out.println(11 - data));
		
		//�̰Ŵ� ���� arraylist�� ���� ���ϴ� ���� �߰� �Ѱ�
//	    ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	    datas.forEach(data -> System.out.println(11 - data));

//	    1~10���� ArrayList�� ��� 2�� ����� ���
//	    �� 1~10���� �� 2�� ����� ArrayList�� ���, map() ���
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 5).map(data -> data * 2).forEach(datas::add);
//	    datas.forEach(System.out::println);

//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 10).forEach(datas::add);
//	    datas.forEach(data -> {
//	       if(data % 2 == 0) {
//	          System.out.println(data);
//	       }
//	    });
		
//	    ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	    datas.forEach(data -> {
//	       if(data % 2 == 0) {
//	          System.out.println(data);   
//	       }
//	    });

//	    ABCDEF�� BCDEFG�� ����
//		"ABCDEF".chars().map(c->c+1).forEach(c->System.out.println((char)c));

//	    ABCD �߿��� B�� �����ϰ� ���
//		B�� �ƽ�Ű �ڵ�� 66�̹Ƿ�, 66�� �����ϰ� �������� ����ϸ� ��
//	    "ABCD".chars().filter(c -> c != 66).forEach(c -> System.out.println((char)c));

//	    ���� �̸��� ArrayList�� ���� �� �̸� ��ü ���
//	    ArrayList<String> datas = new ArrayList<String>(Arrays.asList("��", "����"));
//		���⿡�� datas�� arraylist�̱� ������ stream���� �ٲ���� ��.
//	    String name = datas.stream().collect(Collectors.joining());
//	    System.out.println(name);

// 		����
//	    10~1���� ArrayList�� ��� ��� '
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		�����ϴ°� �����غ��� (�����ؼ� ����Ʈ �ϸ� ���ڰ� ������� ������ �ǳ�?)
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,5,4,3,10));
//		datas.stream().sorted()	

//	    1~10���� ArrayList�� ��� ��� 
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(System.out::println);

//	    ABCDEF�� �� ���ں��� ��� 
//		"ABCDEF".chars().forEach(c->System.out.println((char)c));

//	    1~100���� �� Ȧ���� ArrayList�� ��� ��� 
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data->data%2==1).forEach(datas::add);
//		datas.forEach(System.out::println);

//	    A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.rangeClosed(65, 70).filter(data -> data != 68).forEach(data -> datas.add((char)data));
//		System.out.println(datas);

//		IntStream.rangeClosed(65, 69).map(number -> number > 67 ? number + 1 : number).forEach(data -> datas.add((char)data));
//		IntStream.rangeClosed(65, 69).map(streamTask::exclude_D).forEach(data -> datas.add((char)data));

//	    5���� ���ڿ��� ��� �ҹ��ڷ� ����("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() ���
//		������ ���ڿ��� ��� arraylist�� �ְ� �����鼭 ��½�Ŵ!! 
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//      1~100���� �� ¦���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		changeToEven �޼ҵ��� �Ҽ��� ��������� �˷��ְ� ����ϱ�
//		IntStream.rangeClosed(1, 50).map(streamTask::changeToEven).forEach(datas::add);
//		System.out.println(datas);
		
//      �ѱ��� ������ ����, �ϰ��̻� -> 1024
		String hangle = "�����̻�����ĥ�ȱ�";
		String input = "�ϰ��̻�";
		input.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
//      ������ �ѱ۷� ����, 1024 -> �ϰ��̻�
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String input = "1024";
//		
//		input.chars().map(i -> i - 48).forEach(i -> System.out.print(hangle.charAt(i)));
		
	}
	
	public int exclude_D(int number) {
		return number > 67 ? number + 1 : number;
	}
	
	public boolean checkOdd(int number) {
		return number % 2 == 1;
	}
	
	
	public int change(int number) {
		return 10 - number;
	}
	
	public int changeToOdd(int number) {
		return number * 2 - 1;
	}
	
	public int changeToEven(int number) {
		return number * 2;
	}
	
}

package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		StreamTask streamTask = new StreamTask();
//		1~10���� ArrayList�� ��� �������� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(data -> System.out.println(11 - data));
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//		datas.forEach(data -> System.out.println(11 - data));
		
//		1~10���� ArrayList�� ��� 2�� ����� ���
//		�� 1~10���� �� 2�� ����� ArrayList�� ���, map() ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 5).map(data -> data * 2).forEach(datas::add);
//		datas.forEach(System.out::println);
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(data -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//		datas.forEach(data -> {
//			if(data % 2 == 0) {
//				System.out.println(data);	
//			}
//		});
		
//		ABCDEF�� BCDEFG�� ����
//		"ABCDEF".chars().map(c -> c + 1).forEach(c -> System.out.println((char)c));
		
//		ABCD �߿��� B�� �����ϰ� ���
//		"ABCD".chars().filter(c -> c != 66).forEach(c -> System.out.println((char)c));
		
//		���� �̸��� ArrayList�� ���� �� �̸� ��ü ���
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("��", "����"));
//		String name = datas.stream().collect(Collectors.joining());
//		System.out.println(name);
		
//      10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(streamTask::change).forEach(datas::add);
//		System.out.println(datas);
		
//      1~10���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(datas::add);
//		System.out.println(datas);
		
//      ABCDEF�� �� ���ں��� ���
//		String data = "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
//		System.out.println(datas);
		
//		IntStream.rangeClosed(1, 50).map(streamTask::changeToOdd).forEach(datas::add);
//		System.out.println(datas);
		
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.rangeClosed(65, 70).filter(data -> data != 68).forEach(data -> datas.add((char)data));
//		System.out.println(datas);
//		
//		IntStream.rangeClosed(65, 69).map(number -> number > 67 ? number + 1 : number).forEach(data -> datas.add((char)data));
//		IntStream.rangeClosed(65, 69).map(streamTask::exclude_D).forEach(data -> datas.add((char)data));
//
//		System.out.println(datas);
		
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() ���
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//      1~100���� �� ¦���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 50).map(streamTask::changeToEven).forEach(datas::add);
//		System.out.println(datas);
		
//      �ѱ��� ������ ����, �ϰ��̻� -> 1024
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String input = "�ϰ��̻�";
		
//		input.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
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














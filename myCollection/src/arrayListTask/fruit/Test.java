package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
//		���� ��üȭ�ϱ�
		Market market = new Market();
//		���� �߰�		
//		Fruit�� �ִ� �ʵ带 ����ϱ� ���ؼ� ��üȭ�ϱ�
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		
		fruit1.setFruitName("���");
		fruit1.setFruitPrice(1000);
		fruit2.setFruitName("����");
		fruit2.setFruitPrice(2000);
		
		market.insert(fruit1);
		market.insert(fruit2);
		
		System.out.println(DBConnecter.fruits);

//		���� ����
//		market.delete("���");
//		System.out.println(DBConnecter.fruits);

//		���� ��� ���� �˻�
		System.out.println(market.checkPrice("���")); //��� ���ݺ��� ����
		System.out.println(market.checkPrice());
		
//		���� ��ü ��ȸ
		System.out.println(market.selectAll());
		
//		���� �̸����� ���� ��ȸ
		System.out.println(market.selectPrice("���"));
		
	}

}

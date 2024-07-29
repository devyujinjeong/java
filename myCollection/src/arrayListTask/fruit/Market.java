package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
	
//	���ȭ�ϱ�: ����� ����� ��� �빮�ڷ� �ۼ�!!
	private final int LESS = 1; 
	private final int MORE_OR_EQUAL = 0;
	private final int NOT_FOUND = -1;
	
//	���� �߰�
	public void insert(Fruit fruit) {
		DBConnecter.fruits.add(fruit);
	}
	
//	���� ����
	public void delete(String name) {
		for(int i=0; i<DBConnecter.fruits.size(); i++) {
			if(DBConnecter.fruits.get(i).getFruitName().equals(name)) {
				DBConnecter.fruits.remove(i);
			}
		}
		
//		for(Fruit fruit : DBConnecter.fruits) {
//			if(fruit.getName().equals(name)) {
//				DBConnecter.fruits.remove(fruit);
//			}
//		}
	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
//	1. ��ü ���� �� ��� ���ݺ��� ���� ���� ��ȸ
//	2. ������ ������ ��� ���ݺ��� ���� �� ��ȸ
	
	public int checkPrice(String name) { 
		for(Fruit fruit : DBConnecter.fruits) { //����Ǿ� �ִ� ������ ������ŭ �ݺ�
			if(fruit.getFruitName().equals(name)) { //���࿡ ������ ������ �̸���, �Է��� �̸��� ���ٸ�
				return fruit.getFruitPrice() < getAverage() ? LESS : MORE_OR_EQUAL;
			}
		}
		return NOT_FOUND; //�Է��� ������ DBConnecter�� ����Ǿ� ���� �ʴ� ���
	}
	
	public ArrayList<Fruit> checkPrice() { 
		ArrayList<Fruit> results = new ArrayList<Fruit>();
		
		for(Fruit fruit : DBConnecter.fruits) {
			if(fruit.getFruitPrice() < getAverage()) {
				results.add(fruit);
			}
		}
		return results;
	}
	
	public double getAverage() {
		int total = 0;
		for(Fruit fruit : DBConnecter.fruits) {
			total += fruit.getFruitPrice();
		}
		return (double)total / DBConnecter.fruits.size();
	}
	
	
//	���� ��ü ��ȸ
	public ArrayList<Fruit> selectAll(){ 
		return DBConnecter.fruits; //��ȸ�ؼ� ȭ�鿡 ������� �ϱ� ������ return���
	}
	
//	���� �̸����� ���� ��ȸ
	public int selectPrice(String name) { //� ������ ��ȸ�� ������ �̸��� �Է��ؾ� ��
		for(Fruit fruit : DBConnecter.fruits) { //����Ǿ� �ִ� ������ ������ŭ �ݺ�
			if(fruit.getFruitName().equals(name)) { //���࿡ ������ ������ �̸���, �Է��� �̸��� ���ٸ�
				return fruit.getFruitPrice(); //������ ��ȸ������ ����ڿ��� ������ ������߰���?
			}
		}
		
		return NOT_FOUND;
	}

}


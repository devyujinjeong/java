package arrayListTask.food;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
//		���� �߰��ϱ�
		Food food1 = new Food();
		Food food2 = new Food();
		Food food3 = new Food();
		
		food1.setFoodName("�����");
		food1.setFoodPrice(8_000);
		food1.setFoodType("�ѽ�");

		food2.setFoodName("¥���");
		food2.setFoodPrice(6_000);
		food2.setFoodType("�߽�");
		
		food3.setFoodName("����");
		food3.setFoodPrice(6_000);
		food3.setFoodType("�ѽ�");
		
		restaurant.insert(food1);
		restaurant.insert(food2);
		restaurant.insert(food3);
		
		System.out.println(DBConnecter.foods);
		
//		���� �̸����� ���� ��ȸ�ϱ�	
		System.out.println(restaurant.select("�����"));
		System.out.println(restaurant.select("«��"));
		
//		����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
		System.out.println(restaurant.selectAllByType("�ѽ�"));

		
//		���� ���� ���� �� ���� 10% ���
		restaurant.update(food1,"�߽�");
		System.out.println(food1);
		
//		����ڰ� ���ϴ� ������ ���� ���� ��ȸ
		System.out.println(restaurant.checkNumberByType("�ѽ�"));
		System.out.println(restaurant.checkNumberByType("�߽�"));

	}
	
}

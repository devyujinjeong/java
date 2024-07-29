package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

//CRUD���� ����� ��Ƴ��� Ŭ���� ����(restaurant)
public class Restaurant {
//	���� �߰�
	public void insert(Food food) {
		DBConnecter.foods.add(food);
	}
	
//	���� �̸����� ���� ���� ��ȸ
	public Food select(String name) {
		Food result = null;
		for(Food food : DBConnecter.foods) {
			if(food.getFoodName().equals(name)) {
				result = food;
				break;
			}
		}
		return result;
	}
		
//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> selectAllByType(String type) {
		ArrayList<Food> results = new ArrayList<Food>();
		for(Food food : DBConnecter.foods) {
			if(food.getFoodType().equals(type)) {
				results.add(food);
			}
		}
		return results;
	}
	
//	���� ���� ���� �� ���� 10% ���
	public void update(Food food, String type) { 
		//� ������ �������� �ް�, � ������ �������� �޾ƺ���
		for(Food data : DBConnecter.foods) {
			if(data.getFoodName().equals(food.getFoodName())) {
				data.setFoodType(type); //foodType�� �����ͼ� ��ȭ ��Ű��
				data.setFoodPrice((int)(data.getFoodPrice() * 1.1)); //���� ������ ������ �Ŀ� ��ȭ ��Ű��
			}
		}
	}
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int checkNumberByType(String type) {
		int count=0;
		for(Food food : DBConnecter.foods) {
			if(food.getFoodType().equals(type)) {
				count++;
				
			}
		}
		return count;
	}
	
	


}

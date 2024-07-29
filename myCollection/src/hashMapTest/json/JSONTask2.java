package hashMapTest.json;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask2 {
//  �ֹ���ȣ, ���̸�, �ֹ��� ���� : restaurant Ŭ������ ����
	public static void main(String[] args) {
		
//	    1. ���� 3���� JSONArray�� ������
//		arraylist�� ���
//	      ArrayList<JSONObject> restaurantJSONs 
//	         = new ArrayList<JSONObject>(
//	               Arrays.asList(
//	                     new JSONObject(new Restaurant(1,"¥���","ȫ�浿")),
//	                     new JSONObject(new Restaurant(2,"«��","ö��")),
//	                     new JSONObject(new Restaurant(3,"������","¯��"))
//	                  )); 
//	      
//	      JSONArray arRestaurantJSON = new JSONArray(restaurantJSONs);
//	      String restaurants = arRestaurantJSON.toString();
//	      
//	      System.out.println(restaurants);
//	}
	
//      2. ���� JSONArray�� �� ������ ��� ����ϱ�
		String restaurant = 
				"[{\"foodName\":\"¥���\",\"orderNumber\":1,\"customerName\":\"ȫ�浿\"},{\"foodName\":\"«��\",\"orderNumber\":2,\"customerName\":\"ö��\"},{\"foodName\":\"������\",\"orderNumber\":3,\"customerName\":\"¯��\"}]";        
	     try {
	         JSONArray arRestaurantJSON = new JSONArray(restaurant);
	         
	         for(int i=0; i<arRestaurantJSON.length(); i++) {
	            JSONObject productJSON = arRestaurantJSON.getJSONObject(i);
	            System.out.println(productJSON.get("orderNumber"));
	            System.out.println(productJSON.get("foodName"));
	            System.out.println(productJSON.get("customerName"));
	            System.out.println("=============================");
	         }
	         
	      } catch (JSONException e) {
	         e.printStackTrace();
	      }
	}
}

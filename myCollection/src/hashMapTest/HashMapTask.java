package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTask {
	public static void main(String[] args) {
//		���̵�, ��й�ȣ, �̸��� String Ÿ���̰�, ���̴� int Ÿ����!!
//		�׷��� upcasting�� �ؼ� objectŸ������ ���� ���� �Է¹��� �� �ֵ��� ����.
		HashMap<String , Object> userMap = new HashMap<String, Object>(); //key,value
		JSONObject userJSON=null, resultJSON=null;
		String json = null;
		
		userMap.put("id", "jyj1234"); //���̵� ���� �ֱ�
		userMap.put("password", "12341234"); //��й�ȣ ���� �ֱ�
		userMap.put("name", "������"); //�̸� ���� �ֱ�
		userMap.put("age", 23); //���� ���� �ֱ�
			
		System.out.println(userMap);
		System.out.println(userMap.get("name")+"�� ȯ���մϴ�~!!");
		
//		JSONObject �����ڿ� HashMap �����ڸ� �ѱ��
		userJSON=new JSONObject(userMap);
		json=userJSON.toString();
		System.out.println(json);
		
		try {
			resultJSON = new JSONObject(json); //json ������ �ƴ� ��� ������ �߻��� �� ����
			System.out.println(resultJSON.get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
}
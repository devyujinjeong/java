package arrayListTask.user;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
		UserField userField = new UserField();
//		ȸ�� ����
		User user = new User();
		user.setId("jyj1234");
		user.setName("������");
		user.setPassword("1234");
		user.setPhoneNumber("01012341234");
		
		userField.join(user);
		System.out.println(DBConnecter.users);
	
		
//		���̵� �ߺ� �˻�
		if(userField.checkId("jyj1234") != null) {
			System.out.println("�ߺ��� ���̵�");
		}else {
			System.out.println("��� ������ ���̵�");
		}
	
		
//		�α���
		if(userField.login("jyj1234", "1234")) {
			System.out.println("�α��� ����");
			System.out.println(UserField.userId);
		}else {
			System.out.println("�α��� ����");
		}

//		ȸ������ ��ȸ
		user = userField.select();
		System.out.println(user);
		
//		���� ����
		user.setName("ȫ�浿");
		userField.update(user);
		
		System.out.println(DBConnecter.users);
		
		userField.logout();
		
		if(UserField.userId == null) {
			System.out.println("�α׾ƿ� ����");
		}
	}
}
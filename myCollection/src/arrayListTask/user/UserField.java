package arrayListTask.user;

import arrayListTask.DBConnecter;

public class UserField {
	
	public static String userId;
	
//	���̵� �ߺ��˻�
	public User checkId(String id) { //ȭ���� �������� �� ���̵�� ����ڿ��� �Է� �޾ƾ� ��
		User temp = null; //User��� �ڷ����� temp
//		DBConnector�� users��� ��ü�� ����ִ� ���� user�� �ֱ� �ݺ��ϱ� 
		for(User user : DBConnecter.users) {
			if(user.getId().equals(id)) { //���� user�� id�� �Է��� id�� ���ٸ�
				temp = user; // temp�� user�� �Ҵ��ض�
				break; //if���� break�� if���� ���ΰ� �ִ� �߰�ȣ ��ü�� Ż���ϴ� ����.
			}
		}
		return temp;
	}
	
//	ȸ������
	public void join(User user) { 
//		DBConnecter�� �ִ� users��� arraylist�� user ������ �߰��ϱ�
		DBConnecter.users.add(user); 
	}
	
//	�α���
	public boolean login(String id, String password) {
//		�α����� �Ϸ��� �翬�� �ߺ� �˻翡�� ����� ���̵� ����ؾ� �ϹǷ� ������ ���� ���̵� üũ �޼ҵ带 ���
//		�ߺ� �˻簡 �Ϸ�� ���̵� ���� �ʱ�ȭ
		User user = checkId(id); 
		if(user != null) { //user�� �ִٸ�. �� �ڵ忡���� user�� null�� �ƴ϶��
//			�н����忡 ����Ǿ� �ִ� �н������ �Է��� �н����尡 ���ٸ�
			if(user.getPassword().equals(password)) {
				userId = id;
				return true; 
			}
		}
//		user�� ���� --> �� �׷��� ���� ��й�ȣ�� Ʋ�Ƚ��ϴٳ� ���̵� Ʋ�Ƚ��ϴٰ� �ƴ϶�
//		���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ��� ������ ������ ��
		return false; 
	}
	
//	�α׾ƿ�
	public void logout() {
		userId = null; 
	}
	
//	ȸ������ ��ȸ
	public User select() {
		return checkId(userId);
	}
	
//	���� ����
	public void update(User user) {
		User foundUser = checkId(user.getId());
		foundUser.setName(user.getName());
		foundUser.setPassword(user.getPassword());
		foundUser.setPhoneNumber(user.getPhoneNumber());
	}
}
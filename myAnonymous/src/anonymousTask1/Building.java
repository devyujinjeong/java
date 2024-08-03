package anonymousTask1;

public class Building{
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() { 	
//		������ ����� �ѹ��� �ϸ� �� --> �׷��� �͸� �޼ҵ�� ������ , �� ����� �� �� �ʿ䰡 ����
//		���� Form�̶�� �������̽��� �����Ǿ� ���� ����
			@Override
			public void sell(String order) { //�޴����� �����ͼ� �˻��ϴ� �޼ҵ�		
				String[] menu = getMenu(); //�ؿ��� �޴� ������ ����
				for(int i=0;i<menu.length;i++) {
					if(menu[i].equals(order)) { //�޴� �߿� order�� ������ �� ������ �ؿ� ���� ����ϱ�
						System.out.println(order+"�ǸſϷ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��","ī���","��������"};
				
			}
		});
		
//		����� ����, �Ǹ� ��� ���� ���� ����� ���
//		FormAdapter ���� -> getMenu()�� ������
//		���� Form�̶�� �������̽��� �޾Ҵٸ� ���� ������ó�� ��� �����ؾ� ��.
//		jamsil�̶�� ��ü�� ������ ���� (Starbucks�� �ִ� �ʵ带 ���)
//		�׷��� ���� 
		Starbucks jamsil = new Starbucks();
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "ī���", "��������"};
			}
		});
		
	}
}

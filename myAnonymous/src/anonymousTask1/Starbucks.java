package anonymousTask1;

public class Starbucks {
//	����(��ü)���� ù 1ȸ ��Ͻ� ����� �޼ҵ�
//	Form�̶�� Ʋ�� �Ű������� �޾ƾ���.
	public void register(Form form) { // �������� �ۼ��ؾ� �ϴ� ����(���) �ޱ�
		String[] menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) { // �޴� ����ϱ�
			System.out.println(i + 1 + "." + menu[i]);
		}
		
		if(form instanceof FormAdapter) {// form�� FormAdapter Ÿ���̸� "���ᳪ�� ������Դϴ�." ����ϱ�
			System.out.println("���ᳪ�� ������Դϴ�.");
		}
		else {
			form.sell("�Ƹ޸�ī��");
		}
	}
}

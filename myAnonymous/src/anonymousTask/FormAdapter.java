package anonymousTask;
// adapter ��Ȯ�� ������� ����ϴ°��� �� ���ذ� �ȵ�
// ���⿡�� ����, ������� ��� getMenu()�� ������ �ϸ� �Ǵ� ����. 

public abstract class FormAdapter implements Form {
	@Override 
	public String[] getMenu() {return null;}
	@Override //������ ���� ���� ���̱� ������, �߰�ȣ�� �־� �������� ������.
	public void sell(String order) {;}
}

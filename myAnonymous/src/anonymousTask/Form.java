package anonymousTask;

public interface Form { // ���� �����Ǿ� ���� ����.
//	������ �޴� --> �߻� �޼ҵ�
	public String[] getMenu(); //String[] �迭�� return��
//	������ �Ǹ� ��� -->�ܺο��� �ֹ��� �޾ƾ� �ϴϱ� �Ű����� �ʿ�
	public void sell(String order);	// return�� �ʿ䰡 ����. �ֹ��� ������ �Ǵϱ�
}

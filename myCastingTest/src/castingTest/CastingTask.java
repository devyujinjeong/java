package castingTest;

// ���ø���
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ������ ������
// �ִϸ��̼� �̶�� "�ڸ� ����" ��� ���
// ��ȭ��� "4D" ��� ���
// ��󸶶�� "����" ��� ���

// Ŭ���� �����ϱ�
public class CastingTask {
//	������ Ȯ���ϴ� �޼ҵ� �����ϱ�
	public void checkVideo(Video video) {
		if(video instanceof Animation) { // ��ü ���� Ÿ�� ���ϱ�
			((Animation)video).printStubtitle(); // down casting

		}
		
		else if(video instanceof Drama) { // ��ü ���� Ÿ�� ���ϱ�
			((Drama)video).print4D(); // down casting
		}
		
		else { // ��ü ���� Ÿ�� ���ϱ�
			((Movie)video).sellGoods(); // down casting
		}
	}

	public static void main(String[] args) {
//		�׽�Ʈ
		CastingTask castingTask = new CastingTask();
		
//		���� �迭�� ���
		Video[] video= {
				new Animation(),
				new Drama(),
				new Movie()
		};
		
		for(int i=0;i<video.length;i++) {
			castingTask.checkVideo(video[i]);
		}
	}
}

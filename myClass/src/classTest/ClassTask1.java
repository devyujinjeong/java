package classTest;

class SuperCar { 
//	���� �����ϱ�
//	�ؿ� �ִ� �������� ������ �ٸ� �͵��̹Ƿ� �׳� ���� �����ϴ� ��ó�� �ϸ� ��
	String brand;
	String color;
	int price;
	boolean engine;
	
//	Alt+shift+s --> O --> s --> enter
//	������ �����ϱ�
	public SuperCar(String brand, String color, int price) {//SuperCar����!!
		this.brand = brand; // �Ķ����� ������ �ֱ�
		this.color = color; // this�� �� ����
		this.price = price; 
	}
	
//	�����ε� �ϱ� --> ���� �̸��� ������ ����ϱ�
	public SuperCar(String brand) {
		this.brand=brand;
	}
	
//	�õ� �ѱ�
	void engineStart() {
		engine=true;
	}

//	�õ� ����
	void engineStop() {
		engine=false;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ferrari=new SuperCar("���","red",50_000);  
//		��󸮰� ��ü�� �ű⿡ �ּҰ��� �� �ִ°���! �߰�ȣ�� ������ ���.
//		�ٵ� ���������� ���µ� ���� ���?!
		SuperCar lamborghini=new SuperCar("���������", "yellow",60_000); 
		
		System.out.println(ferrari.brand);
		System.out.println(ferrari.color);
		System.out.println(ferrari.price);

//		ferrari.engine ���� ������, ���� �ѱ�
		if(!ferrari.engine) { //ferrari.engine�� false��� -->!����ؼ� true�� �ٲ���
			ferrari.engineStart(); //���� �ѱ�
			System.out.println(ferrari.brand+" �õ� ����");
		}
		else{
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�.");
		}
		
//		ferrari.engine ���� ������, ���� ����
		if(ferrari.engine) {  //ferrari.engine�� true���
			ferrari.engineStop(); //���� ����
			System.out.println(ferrari.brand+" �õ� ����");
		}
		else{
			System.out.println("�̹� �õ��� ���� �ֽ��ϴ�.");
		}
		
	}
	
}

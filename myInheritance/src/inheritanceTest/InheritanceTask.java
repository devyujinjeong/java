package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("����� �õ� ����");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}

// SuperCar�� �귣��, ����, ����, ��尡 �ִ�.
// �õ��� ���� �� ����� �������� �Ӽ� �ִ�.
// �õ��� ���� �� �������θ� �� �� �ִ�.
class SuperCar extends Car{
	String mode; //��� �߰���
	
//	�⺻ ������ �����ϱ�
	public SuperCar(){;}

//	������ �����ϱ�
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand,color,price); //�θ� Ŭ�������� �ޱ�
		this.mode = mode; //mode �߰�
	}

	@Override
//	���⿡�� �������̵� �Ҷ��� Car���� ��� �޼ҵ嵵 �����ϰ�, �� �ؿ� ���ϴ°� �߰�
	void engineStart() {
		super.engineStart();
		System.out.println("�������� �õ� ����");
	}
	
//	���⿡�� �������̵� �Ҷ��� Car���� ��� �޼ҵ�� ������� �ʰ�, ���� ���ϴ� �޼ҵ�� ��ü�ϱ�
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar superCar=new SuperCar("���","red",50_000,"sport");
		System.out.println(superCar.brand);
		System.out.println(superCar.color);
		System.out.println(superCar.price);
		System.out.println(superCar.mode);
		
		superCar.engineStart();
		superCar.engineStop();

	}
}
 


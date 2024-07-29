package castingTest;

class Car{
	void engineStart() { //���� ���� �޼ҵ�
		System.out.println("����� �õ��� ��");
	}
}

//	Car�� ��ӹޱ� (SuperCar�� �ڽ�, Car�� �θ�)
class SuperCar extends Car{ 
	@Override
	void engineStart() {
		System.out.println("�������� �õ� ��");
	}
	
	void openRoof() {
		System.out.println("���ؿ���");
	}
}
public class CastingTest {
	public static void main(String[] args) {	
//		��üȭ �ϱ�
		Car matiz = new Car(); //��Ƽ�� ��ü
		SuperCar ferrari = new SuperCar(); //��� ��ü
		
//		up casting
//		�θ�Ŭ���� ��ü�� = new �ڽ�Ŭ����();
		Car noOptionFerrari=new SuperCar(); //SuperCar�� Car Ÿ��!!
		
//		down casting (�ڽ� Ŭ������ ������)
//		up casting�ߴ� ���� down casting �� ����!!
//		�ڽ� Ŭ���� ������=(�ڽ� Ŭ����)��ĳ�����ߴ� ��ü;
		SuperCar fullOptionFerrari=(SuperCar)noOptionFerrari; 
		
//		����
//		SuperCar brokenFerrari=(SuperCar) new Car();
		
		noOptionFerrari.engineStart(); //�Ѳ��� �� �� ����
		
		fullOptionFerrari.openRoof();
				
		System.out.println(matiz instanceof Car); //true
		System.out.println(matiz instanceof SuperCar); //false
		System.out.println(ferrari instanceof Car); //true
		System.out.println(ferrari instanceof SuperCar); //true
		System.out.println(noOptionFerrari instanceof Car); //true
		System.out.println(noOptionFerrari instanceof SuperCar); //true
		System.out.println(fullOptionFerrari instanceof Car); //true
		System.out.println(fullOptionFerrari instanceof SuperCar); //true
	
	}
}

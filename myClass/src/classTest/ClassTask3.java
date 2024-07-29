package classTest;

//	�� ���������� �ᱹ, �������� ������ �������� ��ǰ�� �Ǹ�
//	���� �ܰ��� �Ǹ� ������ �������ְ�
//	��ǰ ������ �ϳ��� ���� �����ָ� ��

//	�մ� Ŭ���� �����ϱ�
class Customer{
//	�ʵ� �����ϱ�(�̸�, �ڵ��� ��ȣ, ���� �ܰ�, ������)
	String name; 
	String phone;
	int money;
	int discount;
	
//	������ �����ϱ�
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

class Market{ //���� Ŭ���� �����ϱ�
//	�ʵ� �����ϱ�(��ǰ �̸�, ��ǰ ����, ��ǰ ���)
	String productName;
	int productPrice;
	int productStock;
	
//	������ �����ϱ�	
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	�Ǹ� �޼ҵ� ����, �Ű������� Customter�� (Ŭ����)
	void sell(Customer customer){ 
		customer.money-=productPrice*(100-customer.discount)/100; //���� �ܾ� ���ϱ�
		productStock--;	//��ǰ ��� 1�� ���ֱ�
		
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
		Market emart=new Market("�����",1000,10); 
		
//		���� ���� ���̴ϱ� �迭�� �����!!
		Customer[] customers= { 
				new Customer("������","01012345678",3000,20),
				new Customer("A","01098765432",5000,30)
		};
	
		for (int i=0;i<customers.length;i++) {//sell�̶�� �޼ҵ带 customer ����ŭ ���� ����
			emart.sell(customers[i]);  
			System.out.println(customers[i].name+"���� �ܾ��� "+customers[i].money+"�Դϴ�.");
		}
	}
}


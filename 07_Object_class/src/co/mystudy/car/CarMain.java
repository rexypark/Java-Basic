package co.mystudy.car;

public class CarMain {
	
	public static void main(String[] args) {
		//Car Ŭ������ �̿��ؼ� ��ü(�ν��Ͻ�) ����
		Car car1 = new Car();
		System.out.println("�ڵ��� �̸� : " + car1.name);
		System.out.println("�𵨸� : " + car1.model);
		System.out.println("������ : " + car1.color);
		System.out.println("���� : " + car1.CAR_LENGTH);
		System.out.println("�ʺ� : " + car1.CAR_WIDTH);
		//boolean �ʱⰪ false
		System.out.println("����� ���� : " + car1.existAirbag);
		
		car1.name = "rexyCar";
		car1.existAirbag = true;
		System.out.println("car name : " + car1.name);
		System.out.println("Airbag : " + car1.existAirbag);
		
		System.out.println();
		// car1.CAR_WIDTH = 400;  // final ������ ���� �Ұ�
		System.out.println("==== ��� ���(�׽�Ʈ) ====");
		System.out.println();
		
		car1.run(70);
		car1.stop();
		car1.back();
		System.out.println();
		car1.dispData();
		
		System.out.println();
		
		System.out.println("==== car2 ���� ====");
		Car car2 = new Car("rexypark", "�", "����");
		car2.dispData(); // �ι�° ���� ����
		System.out.println();
		car1.dispData(); // ù��° ���� ����
		
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
		car2 = car1; //���� ��ü 
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
		
		
	}
}

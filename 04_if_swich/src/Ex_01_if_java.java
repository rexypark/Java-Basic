import java.util.Scanner;

public class Ex_01_if_java {

	public static void main(String[] args) {
		/* ��� - �б⹮(�񱳹�) : if ��
		if(���ǹ�) { 
			������ ����(��); <- ���ǹ��� ����� ��(true)�� ��
		}
		*/
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(">> ���۾� ��");
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		System.out.println(">> ���۾� ��");
		
		System.out.println("---------------------------");
		/* ������ ���� �� ��� ���
		 90 ~ 100 : ���
		 80 ~ 89 : ��ȣ
		 70 ~ 79 : ����
		 60 ~ 69 : ����
		 0 ~ 59 : ����
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է� �ϼ���");
		System.out.println(">");
		int score = scan.nextInt();
		System.out.println("---- �򰡰�� ----");
		System.out.println();
		System.out.println("���� : " + score);
		
		if(score>=90 && score <= 100) {
			System.out.println("�򰡰�� : ���");
		}else if(score >=80) {
			System.out.println("�򰡰�� : ��ȣ");
		}else if(score >=70) {
			System.out.println("�򰡰�� : ����");
		}else if(score >=60) {
			System.out.println("�򰡰�� : ����");
		}else {
			System.out.println("�򰡰�� : ����");
		}
		
		System.out.println(">> ����ó�� ��");
		
		
		
		scan.close();	
	}
	
}

import java.util.Scanner;

public class Ex_03_sungJuk {
	
	public static void main(String[] args) {
		/* (�ǽ�) ����ó��
		 ����(kor), ����(eng), ����(math) ���� �Է� �ޱ�
		 ����(tot) = ���� + ���� + ����
		 ���(avg) = ���� / 3
		------------------------
		�� : ��������� �������� ��
		 90 ~ 100 : A
		 80 ~ 89 : B
		 70 ~ 79 : C
		 60 ~ 69 : D
		 0 ~ 59 : F �����
		 =================
		 �������
		 ���� : 100
		 ���� : 90
		 ���� : 80
		 -----------
		 ���� : 270
		 ��� : 
		 <�򰡰��>
		 
		 *********************
		 
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ��� : ");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ��� : ");
		int eng = scan.nextInt();
		System.out.println("���������� �Է��ϼ��� : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		String grade;
		if (avg >= 90 && avg <= 100) {
			grade = "A";
		} else if (avg>=80) {
			grade = "B";
		} else if (avg>=70) {
			grade = "C";
		} else if (avg>=60) {
			grade = "D";
		} else {
			grade = "F �����";
		}
		
		System.out.println("90 ~ 100 : A");
		System.out.println("80 ~ 89 : B");
		System.out.println("70 ~ 79 : C");
		System.out.println("60 ~ 69 : D");
		System.out.println("0 ~ 59 : F �����");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("--------------");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("<�򰡰��>");
		System.out.println(grade);
		System.out.println("******************");
		
		scan.close();	
	
	}
	
}


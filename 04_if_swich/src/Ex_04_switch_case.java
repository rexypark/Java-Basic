
public class Ex_04_switch_case {
	public static void main(String[] args) {
		//switch case�� : ���� �� ����
		/*
		 * ���ذ����� �Ǽ��� �� ����
		 switch (���ذ�) {
		 case �񱳰� :
		 	������ ����(��);
		 	break;
		 case �񱳰�2 :
		 	������ ����(��);
		 	break;
		 ...
		 default :
		 	������ ����(��);
		 	break;
		 }
		 */
		int month = 3;
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
			System.out.println("31�� ���� �ֽ��ϴ�.");
			break;
		case 2 :
			System.out.println("28�� ���� �ֽ��ϴ�.");
			break;
		
		default :
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			break;
		case 4 :
			System.out.println("31�� ���� �ֽ��ϴ�.");
			break;	

			
		}
		System.out.println("switch ��");
		System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
		System.out.println( "===============");
		/* ��ǰ��õ ����� ���� ��ǰ ����
		 1�� :  �����, 2�� : ��ġ�����, 3�� : ��Ź��, 4�� : û�ұ�
		 ����� �ش����� ������(���� ���) : ����
		 
		 
		 */
		String result = "1��";
		String gift = "";
		switch(result) {
		case "1��" :
			gift = "�����";
			break;
		case "2��" :
			gift = "��ġ�����";
			break;
		case "3��" :
			gift = "��Ź��";
			break;
		case "4��" :
			gift = "û�ұ�";
			break;
		default :
			gift = "����";
			break;
		}
		System.out.println("���  :  " + result);
		System.out.println("��÷���  :  " + gift);
	}
}

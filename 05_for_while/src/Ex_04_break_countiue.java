
public class Ex_04_break_countiue {
	public static void main(String[] args) {
		// ���� ��ɹ� : break, countiue
		// break : �ݺ����� �ߴ� ��Ű�� ��������
		// continue : ��� ���� (���� �ݺ� ó���� ����)
		// �ݺ����� �� ������ �̵�
		
		// ���� : 1 - 10���� ����ϵ� 8�� ������� ����
		for (int i = 1;  i <= 10; i++) {
			
			if (i == 8) continue;
				System.out.println(i);
			
		}
		
		System.out.println("====break====");
		// 1~10���� ��� �� 7�� ��� ó�� �ߴ�
		for (int i = 1; i <=10; i++) {
			
			if (i==7) {
				break;
			}
			System.out.println(i);
			
		}
		
	}
}

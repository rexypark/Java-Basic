
public class Ex_09_Double {

	public static void main(String[] args) {
		// �Ǽ��� double
		// ǥ�� ���� : ����.���� / ����.���� + D �Ǵ� d
		double d1 = 1.1;
		double d2 = 1.123456789092831231231238D;
		
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.123456789091231232838 : " + d2);
		
		System.out.println("3.4d + 3.4d : " + (3.4d+3.4d));
		System.out.println("======================");
		
		float f1 = 3.4f;
		double d3 = 2.3d;
		d1 = f1;

		f1 = (float)d3;
		
		// ������ <-> �Ǽ��� : �ڵ��� ��ȯ ���� ���δ� ǥ������
		// int, long, -> float, double : �ڵ� ����ȯ �����ϳ� ���� ����
		
	}
}

package java_standard_1;

public class Ex2_8 {

	public static void main(String[] args) {
		// x�� y�� ����� �� ���� �ٲٱ�
		
		int tmp ;
		int x = 100 ,y = 50;
		
		System.out.println("���� ��");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		tmp = x;
		x = y ; 
		y = tmp;
		System.out.println("���� ��");
		System.out.println("x = " + x); // 50
		System.out.println("y = " + y); // 100

	}

}

package ch08;

public class TryCatchTestNumber2 {

	public static void main(String[] args) {
		System.out.println("try-catch���� �� ���۵˴ϴ�.");
		try {
			System.out.println(0/0);
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		} // try-catch�� ��
		
		System.out.println("try-catch���� ����Ǿ����ϴ�.");

	}

}
 
package ch08;

public class TryCatchTestNumber4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException ���ܹ߻�
			System.out.println(4); // ������� ����
		} 
		catch(ArithmeticException ae){
			if (ae instanceof ArithmeticException) {
				System.out.println("True");
			System.out.println("ArithmeticException");	
			}
		}
//		catch(Exception e) {
//			System.out.println("Exception"); // ��� ���� ó������
//		}
		System.out.println(6);
	}

}

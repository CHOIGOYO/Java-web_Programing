package ch08;

public class TryCatchTestNumber2 {

	public static void main(String[] args) {
		System.out.println("try-catch문이 곧 시작됩니다.");
		try {
			System.out.println(0/0);
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		} // try-catch의 끝
		
		System.out.println("try-catch문이 종료되었습니다.");

	}

}
 
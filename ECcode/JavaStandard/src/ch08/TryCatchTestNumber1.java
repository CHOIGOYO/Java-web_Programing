package ch08;

public class TryCatchTestNumber1 {

	public static void main(String[] args) {
		System.out.println("try-catch문이 곧 시작됩니다.");
		try {
			System.out.println(1);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		} // try-catch의 끝
		
		System.out.println("try-catch문이 종료되었습니다.");
	}
}

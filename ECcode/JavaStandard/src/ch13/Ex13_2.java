package ch13;
 // 싱글 스레드 확인하기 
public class Ex13_2 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("o"));
		}
		
		System.out.print("(1000/1)소요시간 1 ->" + (System.currentTimeMillis() - startTime));
		System.out.println();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("+"));
		}
		System.out.print("(1000/1)소요시간 2 ->" + (System.currentTimeMillis() - startTime));
		
	}

}

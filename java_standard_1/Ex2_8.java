package java_standard_1;

public class Ex2_8 {

	public static void main(String[] args) {
		// x와 y에 저장된 값 서로 바꾸기
		
		int tmp ;
		int x = 100 ,y = 50;
		
		System.out.println("변경 전");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		tmp = x;
		x = y ; 
		y = tmp;
		System.out.println("변경 후");
		System.out.println("x = " + x); // 50
		System.out.println("y = " + y); // 100

	}

}

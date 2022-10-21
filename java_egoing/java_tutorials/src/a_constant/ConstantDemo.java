package a_constant;

public class ConstantDemo {

	public static void main(String[] args) {
		//상수형 데이터타입
		
		//int(정수형데이터 타입) a = 2.2(실수); <-오류
		//float(실수형 데이터타입) a = 2.2(실수); <-오류
		//double(실수형 데이터타입중 float보다 큰 데이터타입) a = 2.2(실수); <-오류없음
		
		float a = 2.2F; //변수의 값을 float형이라 변환해주어 오류 수정(형변환)
		
		
		//int b = 2147483648; // 2147483647 까지 담을 수 있는 데이터 타입 int , 오류
		long b = 2147483648L; // 변수의 값을 long형이라 변환해주어 오류 수정(형변환)
		
		byte c = 100; //byte범위 내 값 오류없음
		short d = 200; // short범위 내 값 오류없음
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}

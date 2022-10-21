package a_conversion;

public class TypeConvertion {

	public static void main(String[] args) {
		// 자동 형변환 (암시적 형변환)
		double a = 3.0F; // 변수 a의 값을 float형으로 명시하여도 오류는 발생하지 않는다 (float < double)
		// 자동 형변환은 표현범위가 좁은 데이터타입에서 넓은 데이터 타임으로의 변환만 허용
		
		System.out.println(a);
		/*반대의 예) 오류내용
		   
		float b = 2.0;
		
		기본적으로 상수는 double형으로 인식한다.
		범위가 상대적으로 큰 double형에서 보다 작은 float형으로 변환은 불가하다 
		
		
		byte -> short/char -> int -> long -> float -> double
		
		*/
		
		int aa = 3;  
		float b = 1.0F; //(변수 값에 F로 float형이라 명시)
		double c = aa+b;
		//서로 다른 데이터 타입을 연산하려면 변환시켜 계산해야한다
		
		System.out.println(c); //4
		
		
	}

}

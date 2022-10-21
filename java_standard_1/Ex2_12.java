package java_standard_1;

public class Ex2_12 {

	
	public static void main(String[] args) {
		// 타입 간의 변환방법
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // 문자열 "3"을  문자로 변환하고 ㅡ 숫자형으로 변환
		
		System.out.println('3' - '0' + 1); // 문자 3을 숫자로 변환후 연산
		
		System.out.println(Integer.parseInt("3") + 1 ); // 문자열을 숫자로 변환
		System.out.println(Double.parseDouble("3") + 1); // 문자열을 숫자(double 형)로 변환 
		
		System.out.println("3" + 1); // 문자열 3뒤 바로 숫자1의 결합
		
		System.out.println((char)(3 + '0')); // 숫자 3을 문자로 변환
	}

}

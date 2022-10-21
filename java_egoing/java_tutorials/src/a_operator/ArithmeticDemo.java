package a_operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//                                                                         
		int result = 1 + 2 ; // 더하기연산
		System.out.println(result); //3
		
		result = result - 1; // 뺄셈연산
		System.out.println(result); //2
		
		result = result * 2; // 곱셈연산
		System.out.println(result); //4
		
		result = result / 2; // 나눗셈연산
		System.out.println(result); //2
		result = result + 8;
		result = result % 7; // 나머지를 구하는 연산
		System.out.println(result); //3
		
		
		//문자열 연산
		
		String firstString = "This is ";
		String secondString = "a concatenated string";
		String thirdString = firstString + secondString;
		
		System.out.println(thirdString); 
		//+연산자는 문자열과 문자열을 결할할 때 사용되기도 함
		
		
		
	}

}

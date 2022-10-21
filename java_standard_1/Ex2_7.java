package java_standard_1;

public class Ex2_7 {

	public static void main(String[] args) {
		// 문자열 결합 
		// 덧셈 연산자는 왼쪽에서 오른쪽 방향으로 연산 수행 
		 String name = "JA" + "VA";
		 String str = name + 8.0;
		 
		 
		 System.out.println(name);
		 System.out.println(str);
		 
		 System.out.println(7 + " " ); // 7 + 문자열(공백)
		 System.out.println(" "+ 7);   // 문자열(공백) 7
		 
		 System.out.println(7 + "");  //7
		 System.out.println("" + 7 ); // 문자열 7
		 
		 System.out.println("" + "");
		 
		 System.out.println(7 + 7 + "");
		 System.out.println("" + 7 + 7); // 문자열로 변환할 때 ""를 맨앞에 배치
		 
	}

}

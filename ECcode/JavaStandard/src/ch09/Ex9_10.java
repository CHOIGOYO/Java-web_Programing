package ch09;

public class Ex9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String striVal = String.valueOf(iVal); // 방법 1 : int 를 String 변환하고 strVal에 저장
		
		double dVal = 200.0;
		String strdVal = dVal+ "";  // 방법 2 : 숫자를 빈 문자열과 더해 String 변수 strVal1에 저장
		
		double sum = Integer.parseInt("+" + striVal)+ Double.parseDouble(strdVal);
		double sum2 = Integer.valueOf("+" + striVal)+ Double.valueOf(strdVal);
		
		System.out.println(sum);
		System.out.println(sum2);
		
		System.out.println(String.join("",striVal,"+" ,strdVal ,"=")+sum);
		
		System.out.println(striVal + "+" + strdVal + "=" + sum );
	}
}

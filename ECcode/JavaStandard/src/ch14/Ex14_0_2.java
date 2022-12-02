package ch14;
import java.util.function.Function;
public class Ex14_0_2 {
	public static void main(String[] args) {
		// 메서드 참
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String,Integer> f = 클래스이름::메서드이름;
		
		Function<String,Integer> f = Integer::parseInt; // -> 메서드 참조
		System.out.println(f.apply("100")+200); // String이 Integer로 바뀜 
		
		
		

	}

}

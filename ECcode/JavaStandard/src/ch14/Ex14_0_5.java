package ch14;
import java.util.*;
import java.util.stream.*;
public class Ex14_0_5 {

	public static void main(String[] args) {
		// Stream - 배열 만들기 
		Stream<String> strStream = Stream.of("a","b","c","d");
		strStream.forEach(System.out::print);
		System.out.println();
		
		//Stream.of(new 연산자를 통해 괄호안에 직접 배열 생성)
		Stream<String> strStream2 = Stream.of(new String[] { "A","B","C","D" });
		strStream2.forEach(System.out::print);
		System.out.println();
		
		
		// 참조변수에 배열을 넣고 Stream3에 Stream.of(strArr)
		String[] strArr = new String[] { "1","2","3","4" };
		Stream<String> strStream3 = Stream.of(strArr);
		strStream3.forEach(System.out::print);
		System.out.println(); 
		
		// Arrays.stream() 사용하여 배열 출력 
		Stream<String> strStream4 = Arrays.stream(strArr);
		strStream4.forEach(System.out::print);
		System.out.println();
		
		
		// 기본형 Stream 
		int[] intArr = {0,1,2,3,4,5,6};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(System.out::print);
		System.out.println();
		
		// 최종연산 끝으로 닫힘 즉, Stream 새로 생성해야함 
		intStream = Arrays.stream(intArr);
		System.out.println("count : "+intStream.count());
		// Stream close
		intStream = Arrays.stream(intArr);
		System.out.println("sum : "+intStream.sum());
		// Stream close
		intStream = Arrays.stream(intArr);
		System.out.println("average : "+intStream.average());
		
		
		// 자동으로 AutoBoxing
		Integer[] integerArr = {1,1,1,1,1,1}; // {new Integer (1),(1),(1),(1),(1),(1)}
		Stream<Integer> integerStream = Arrays.stream(integerArr);
		integerStream.forEach(System.out::print);
		System.out.println();
		
		
	}

}

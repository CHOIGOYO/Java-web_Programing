package ch14;

import java.util.*;
import java.util.stream.*;

public class Ex14_0_4 {

	public static void main(String[] args) {
		// 스트림 생성하기
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		// Stream의 모든요소 출력 
		intStream.forEach(System.out::print); // 스트림 닫힘 (1회용 , 최종연산을 마치면 닫힘.)
		System.out.println();
		
		// 다시 스트림 생성하기
		intStream = list.stream();
		// 람다식으로 Stream의 모든요소 출력 
		intStream.forEach(i->System.out.print(i));

	}

}

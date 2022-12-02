package ch14;
import java.util.*;
public class Ex14_4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}// for
		
		// list에서 저장된 모든 요소를 출력 
		list.forEach(i->System.out.print(i+", "));
		System.out.println();
		
		// list에서 2 또는 3의 배수 제거 
		list.removeIf(x-> x%2 ==0 || x%3 ==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10); // list의 요소에 모두 10을 곱한다.
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map 의 모든 요소를 {k,v} 형식으로 출력한다.
		map.forEach((k,v)->System.out.print("{"+k+", "+v+"}, "));
		System.out.println();
		
	}
}

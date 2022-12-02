package ch14;
import java.util.function.*;
import java.util.*;
public class Ex14_2 {
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get()); // Supplier 로부터 1~100난수를 받아 리스트에 더한다. 
		}
	}
	
//	Consumer<Integer> c = i -> System.out.print(i+", ");
//	Predicate<Integer> p = i -> i%2 ==0; // 짝수 확인 
	static<T> void printEvenNum(Predicate<T> p , Consumer<T> c ,List<T> list) {
		System.out.print("[");
		
		for(T i : list) {
			if(p.test(i)) // 짝수인지 검사 
				c.accept(i);// true인 경우에만 화면에 출력 
		}
		System.out.println("]");
	}
	
	static<T> List<T> doSomething(Function<T,T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) {
			newList.add(f.apply(i)); // list의 값들의 1의자리를 없애 newList에 새로운 값 저장 
		}
		return newList;
	}
	
	public static void main(String[] args) {
		
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1~100 난수 
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2 ==0; // 짝수 확인 
		Function<Integer,Integer> f = i -> i/10*10; 
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list); // 난수를 출력 
		System.out.println(list);
		printEvenNum(p, c, list); // 짝수를 출력 
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}
}

package ch11;
import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
	public static void main(String[] args) {
		// 기본 길이(용량, capasity)가 10안 ArrayList를 생성
		ArrayList list = new ArrayList(10);
		
		// ArrayList에는 객체만 저장가능
		// autoboxing에 의해 기본형이 참조형으로 자동 변환
		list.add(5);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(1));
		
		// 지정한 범위를 뽑아 새로운 리스트를 생성 subList(from, to)
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		print(list,list2);
		
		// sort로 오름차순 정렬
		// Collection은 인터페이스 Collections는 util클래스
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		// containsAll()사용하여 list에 list2의 모든 요소가 포함되어있는지 확인
		System.out.println("list.containsAll(list2)"+list.containsAll(list2));
		System.out.println();
		
		// list2에 add메서드 사용
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); // A를 추가할 위치를 지정  : 자리이동
		print(list, list2);
		
		// set메서드를 이용하여  값 변경
		list2.set(3,"aa"); // A를 추가할 위치를 지정  : 자리이동
		print(list, list2);
		
		// indexof사용하여 list에 위치를 지정하여 문자열 1추가하고 문자열 1의 위치 검색 
		list.add(0,"1");
		print(list, list2);
		System.out.println("index = " + list.indexOf("1")); // String
		// Integer 1 검색
		System.out.println("index = " + list.indexOf(new Integer(1))); // Integer
		
		//remove 사용하여 index삭제
		System.out.println();
		list.remove(0); // index가 0인 객체 삭제
		list2.remove(new Integer(3)); // Integer(3) 삭제
		print(list, list2);
		
		// list에서 list2와 겹치는 부분만을 남기고 나머지 제거
		System.out.println("list.retainAll(list2) : " + list.retainAll(list2));
		print(list, list2);
		
		// list에서 list2와 겹치는 부분 제거
		for(int i = list2.size() -1; i >=0; i--) {
			if(list.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list, list2);
	}

	
	// 보기좋게 출력하기 위한 print메서트 
	private static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 :"+ list2);
		System.out.println();
		
	}

}

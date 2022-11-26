package ch12;

enum Direction { EAST, SOUTH, WEST, NORTH }
public class Ex12_5 {
	public static void main(String[] args) {
	Direction d1 = Direction.EAST;	
	Direction d2 = Direction.valueOf("WEST");	
	Direction d3 = Enum.valueOf(Direction.class, "EAST");	
	Direction d4 = Direction.NORTH;
	
	System.out.println("d1 = " + d1);
	System.out.println("d2 = " + d2);
	System.out.println("d3 = " + d3);
	
	System.out.println("d1 == d2 ?" + (d1 == d2)); // 열거형 상수에는 == 사용 가능
	System.out.println("d1 == d3 ?" + (d1 == d3));
	System.out.println("d1.equals(d3) ?" + d1.equals(d3));
	
//	System.out.println("d2 > d3 ?" + (d2 > d3)); //  <,> 비교연산자 사용불가 compareTo()로 비교가
	System.out.println("d2.compareTo(d3) ?" + d2.compareTo(d3)); // 왼쪽 크면 양수로 반환
	System.out.println("d1.compareTo(d3) ?" + d1.compareTo(d3)); // 같으면 0을 반환함 
	System.out.println("d1.compareTo(d4) ?" + d1.compareTo(d4)); // 오른쪽이 크면 음수 반환 
	
	switch(d1 ) {
	case EAST : // Direction.EAST 라고 작성할 수 없다. 
		System.out.println("The Direction is EAST."); break;
	
	case SOUTH : 
		System.out.println("The Direction is SOUTH."); break;
		
	case WEST :  
		System.out.println("The Direction is WEST."); break;
	case NORTH :  
		System.out.println("The Direction is NORTH."); break;
		
	default :
		System.out.println("Invalid Direction."); break;
	}
	Direction[] dArr = Direction.values();
	for(Direction d : dArr ) {
		System.out.printf("%s = %d%n",d.name(),d.ordinal());
	}
	}

}
/*
 * Enum.valueOf(Direction.class, "EAST"); -> 열거형 상수의 이름으로 문자열 상수에 대한 참조를 얻을 수 있게 해준다. 
 * d.ordinal() -> 열거형 상수가 정의된 순서를 반환한다. 
 * Direction.values(); -> 열거형 Direction에 정의된 모든 상수를 출력하는데 사용된다.
 */
 

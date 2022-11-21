package ch09;
class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	// 조상 Object클래스를 형변환하여 오버라이딩 
	public boolean equals(Object obj) {
		// 형변환 하기전에는 instanceof로 확인을 꼭 해주어야 한다
		if (!(obj instanceof Value)) {
			return false;
		}
		Value v = (Value)obj; // 조상에 value가 없으니 형변환
		return this.value == v.value; // 내용 오버라이딩 
	}
}

public class ObjectTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
			System.out.println("v1.equls(v2) : True");
		else 
			System.out.println("v1.equls(v2) : Flase");
	}
}

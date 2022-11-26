package ch12;

import java.util.ArrayList;
interface Eatable2 {}
class Fruit22 implements Eatable2 {
	public String toString() { return "Fruit";}
}
class Apple22 extends Fruit22 { public String toString() { return "Apple";}}
class Grape22 extends Fruit22 { public String toString() { return "Grape";}}
class Toy2                 { public String toString() { return "Toy"  ;}}

class FruitBox22<T extends Fruit22 & Eatable2> extends Box<T> {}

class Box22<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);     }
	T get(int i)     { return list.get(i); }
	int size()       { return list.size(); }
	public String toString() { return list.toString();
}
	}

public class G1 {
	public static void main(String[] args) {
	// 지네릭 타입 형변환 test
		FruitBox22<? extends Fruit22> fbox = (FruitBox22 <? extends Fruit22>)new FruitBox22<Fruit22>();
		
		FruitBox22<? extends Fruit22> abox = (FruitBox22<? extends Fruit22>)new FruitBox22<Apple22>();
		
		FruitBox22 <Apple22> abox2 = (FruitBox22<Apple22>) abox; // 가능하지만 경고
		
				
	}

}

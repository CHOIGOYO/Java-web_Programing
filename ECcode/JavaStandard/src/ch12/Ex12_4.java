package ch12;
import java.util.ArrayList;

class Fruit2		       	{ public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}

class Juice {
	String name;

	Juice(String name)       { 
		this.name = name + "Juice"; 
	}
	public String toString() { 
		return name;                
	}
}

class Juicer { 
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) { // Fruit2 와 그 자손들 ok
		String tmp = "";

		for(Fruit2 f : box.getList())  // 향상된 for문 
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class Ex12_4 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		// Fruit와 그 자손들 타입변수 가능 , ? 와일드 카드 사용  
		FruitBox2<? extends Fruit2> appleBox2 = new FruitBox2<Apple2>();
//		appleBox2 = new FruitBox2<Fruit2>();
//		appleBox2 = new FruitBox2<Apple2>();
//		appleBox2 = new FruitBox2<Grape2>();

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(appleBox2));
	}  // main
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i);  }
	ArrayList<T> getList() { return list;   }
	int size()       { return list.size();  }
	public String toString() { return list.toString();}
}

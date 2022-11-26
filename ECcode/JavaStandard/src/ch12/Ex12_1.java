package ch12;
import java.util.*;
public class Ex12_1 {
	static class Product{}
	static class Tv extends Product{}
	static class Audio extends Product{}
	
	public static void main(String[] args) {
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		ArrayList<Tv> tvList1 = new ArrayList<Tv>();
//		ArrayList<Product> tvList2 = new ArrayList<Tv>(); // 지네릭 타입이 달라 오류 
		List<Tv> tvList3 = new ArrayList<Tv>();  //  다형성 ok
		
		// Product와 그 자손은 ok 
		// public boolean add(Product e)
		productlist.add(new Tv());  
		productlist.add(new Audio());
		
		// Tv와 그 자손은 ok 
		// public boolean add(Tv e)
		tvList1.add(new Tv());
		tvList3.add(new Tv());
		
		printAll(productlist);
//		printAll(tvList);
	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	}
}

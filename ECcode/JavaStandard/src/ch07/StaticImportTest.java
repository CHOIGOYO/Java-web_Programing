package ch07;
import static java.lang.System.out; 
import static java.lang.Math.*;

public class StaticImportTest {
	public static void main(String[] args) {
		//System.out.println(Math.random());
		out.println(random());
		//System.out.println("Math.PI : "+Math.PI);
		out.println("Math.PI : "+ PI);
	}

}

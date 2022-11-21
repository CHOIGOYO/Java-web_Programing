package ch07;

interface PlayingCard{
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int HART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber();
	String getCardKind();
}
public class InterfaceTest {
	public static void main(String[] args) {
		
	}
}

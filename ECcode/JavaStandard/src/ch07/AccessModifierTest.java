package ch07;

class Myparent{
	private		int prv; // 같은 클래스
				int dfv; // 같은 패키지
	protected 	int prt; // 같은 패키지 + 자손(다른 패키지)
	public 		int pub; // 접근제한 없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dfv);
		System.out.println(prt);
		System.out.println(pub);
	}		
}

public class AccessModifierTest {
	public static void main(String[] args) {
		Myparent mp = new Myparent();
		//System.out.println(mp.prv); // Error
		System.out.println(mp.dfv);
		System.out.println(mp.prt);
		System.out.println(mp.pub);
	}
}




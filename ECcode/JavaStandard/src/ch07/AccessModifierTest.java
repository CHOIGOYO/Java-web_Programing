package ch07;

class Myparent{
	private		int prv; // ���� Ŭ����
				int dfv; // ���� ��Ű��
	protected 	int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public 		int pub; // �������� ����
	
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




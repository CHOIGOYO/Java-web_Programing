package a_conversion;

public class TypeConvertion {

	public static void main(String[] args) {
		// �ڵ� ����ȯ (�Ͻ��� ����ȯ)
		double a = 3.0F; // ���� a�� ���� float������ ����Ͽ��� ������ �߻����� �ʴ´� (float < double)
		// �ڵ� ����ȯ�� ǥ�������� ���� ������Ÿ�Կ��� ���� ������ Ÿ�������� ��ȯ�� ���
		
		System.out.println(a);
		/*�ݴ��� ��) ��������
		   
		float b = 2.0;
		
		�⺻������ ����� double������ �ν��Ѵ�.
		������ ��������� ū double������ ���� ���� float������ ��ȯ�� �Ұ��ϴ� 
		
		
		byte -> short/char -> int -> long -> float -> double
		
		*/
		
		int aa = 3;  
		float b = 1.0F; //(���� ���� F�� float���̶� ���)
		double c = aa+b;
		//���� �ٸ� ������ Ÿ���� �����Ϸ��� ��ȯ���� ����ؾ��Ѵ�
		
		System.out.println(c); //4
		
		
	}

}

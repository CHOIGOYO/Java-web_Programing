package java_standard_1;

public class Ex2_12 {

	
	public static void main(String[] args) {
		// Ÿ�� ���� ��ȯ���
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // ���ڿ� "3"��  ���ڷ� ��ȯ�ϰ� �� ���������� ��ȯ
		
		System.out.println('3' - '0' + 1); // ���� 3�� ���ڷ� ��ȯ�� ����
		
		System.out.println(Integer.parseInt("3") + 1 ); // ���ڿ��� ���ڷ� ��ȯ
		System.out.println(Double.parseDouble("3") + 1); // ���ڿ��� ����(double ��)�� ��ȯ 
		
		System.out.println("3" + 1); // ���ڿ� 3�� �ٷ� ����1�� ����
		
		System.out.println((char)(3 + '0')); // ���� 3�� ���ڷ� ��ȯ
	}

}

package a_operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		//                                                                         
		int result = 1 + 2 ; // ���ϱ⿬��
		System.out.println(result); //3
		
		result = result - 1; // ��������
		System.out.println(result); //2
		
		result = result * 2; // ��������
		System.out.println(result); //4
		
		result = result / 2; // ����������
		System.out.println(result); //2
		result = result + 8;
		result = result % 7; // �������� ���ϴ� ����
		System.out.println(result); //3
		
		
		//���ڿ� ����
		
		String firstString = "This is ";
		String secondString = "a concatenated string";
		String thirdString = firstString + secondString;
		
		System.out.println(thirdString); 
		//+�����ڴ� ���ڿ��� ���ڿ��� ������ �� ���Ǳ⵵ ��
		
		
		
	}

}

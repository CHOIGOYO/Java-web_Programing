package a_constant;

public class ConstantDemo {

	public static void main(String[] args) {
		//����� ������Ÿ��
		
		//int(������������ Ÿ��) a = 2.2(�Ǽ�); <-����
		//float(�Ǽ��� ������Ÿ��) a = 2.2(�Ǽ�); <-����
		//double(�Ǽ��� ������Ÿ���� float���� ū ������Ÿ��) a = 2.2(�Ǽ�); <-��������
		
		float a = 2.2F; //������ ���� float���̶� ��ȯ���־� ���� ����(����ȯ)
		
		
		//int b = 2147483648; // 2147483647 ���� ���� �� �ִ� ������ Ÿ�� int , ����
		long b = 2147483648L; // ������ ���� long���̶� ��ȯ���־� ���� ����(����ȯ)
		
		byte c = 100; //byte���� �� �� ��������
		short d = 200; // short���� �� �� ��������
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}

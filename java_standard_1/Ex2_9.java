package java_standard_1;

public class Ex2_9 {

	public static void main(String[] args) {
		// printf�� �̿��� ��� ����
		
		String url = "www.naver.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		
		double d = 1.23456789;
		
		System.out.printf("f1 = %f , %e , %g%n",f1 ,f1 ,f1);
		System.out.printf("f2 = %f , %e , %g%n",f2 ,f2 ,f2);
		System.out.printf("f3 = %f , %e , %g%n",f3 ,f3 ,f3);
		
		System.out.printf("d =%14.10f %n" ,d); // ��ü 14�ڸ��� �Ҽ��� �Ʒ� 10�ڸ� ���
		
		System.out.printf("[%s] %n" , url);
		System.out.printf("[%20s] %n" , url); //20�ڸ� ������ ���ķ� ���
		System.out.printf("[%-20s] %n" , url); //20�ڸ� ���� ���ķ� ���
		
		System.out.printf("[%.8s]%n" , url); //8�ڸ��� ���
		
		
		
	}

}

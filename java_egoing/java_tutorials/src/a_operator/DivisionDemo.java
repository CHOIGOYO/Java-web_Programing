package a_operator;

public class DivisionDemo {

    public static void main(String[] args) {
        // ������ �Ǽ� Ÿ�Ժ��� �������� ������ϱ�
        
        int a = 10;
        int b = 3;
        
        float c = 10.0F;
        float d = 3.0F;
        
        System.out.println( a / b ); //3(int ������ ����) �������� ������ �� ���
        
        System.out.println( c / d ); //3.3333333(float ������ ����) 

        System.out.println( a / d ); //3.3333333(int / float ����) �Ͻ��� ����ȯ�� �Ͼ ������ �Ǽ��� ����

    }

}

package a_operator;

public class UnaryOperator {

    public static void main(String[] args) {
        // ���� ������
        
        int i = 3;
        // ++ ����(increment) �����ڷ� ���� ���� 1�� ���� ��Ų��.
        
        i++; 
        System.out.println(i); //4
        ++i;
        System.out.println(i); //5
        System.out.println(++i);//6
        
        
        System.out.println(i++);//6 
        
        //���⼭ i++ ����� �������� �Ѿ �� ����̵ȴ� 
         
        System.out.println(i);//7
    }

}

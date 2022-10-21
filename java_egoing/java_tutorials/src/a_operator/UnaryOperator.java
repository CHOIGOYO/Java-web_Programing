package a_operator;

public class UnaryOperator {

    public static void main(String[] args) {
        // 단항 연산자
        
        int i = 3;
        // ++ 증가(increment) 연산자로 항의 값을 1씩 증가 시킨다.
        
        i++; 
        System.out.println(i); //4
        ++i;
        System.out.println(i); //5
        System.out.println(++i);//6
        
        
        System.out.println(i++);//6 
        
        //여기서 i++ 결과는 다음으로 넘어갈 때 출력이된다 
         
        System.out.println(i);//7
    }

}

package a_operator;

public class EqualDemo {

    public static void main(String[] args) {
        // 비교 연산자
        
        
        //== 좌항과 우항이 서로 같다
        System.out.println( 1 == 2 ); //false
        System.out.println( 1 == 1 ); //true
        System.out.println( "goyo" == "GOYO" ); //false
        System.out.println( "goyo" == "goyo" ); //true
        
        System.out.println();
        //!= 좌항과 우항이 서로 같지않다
        System.out.println( 1 != 2 ); //true
        System.out.println( 1 != 1 ); //false
        System.out.println( "goyo" != "GOYO" ); //true
        System.out.println( "goyo" != "goyo" ); //false
        
    }

}

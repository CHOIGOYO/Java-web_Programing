public class Ex6_5 {
    //호출 스택 
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
/*
 - 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다
 - 메서드가 수행을 마치고 나면 사용했던 메모리를 반환하고 스택에서 제거된다
 - 호출스택의 제일 위에있는 메서드가 현재 실행중인 메서드이다
 - 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다 
 */
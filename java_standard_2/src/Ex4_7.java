public class Ex4_7 {
    public static void main(String[] args) {
    // 임의 정수 만들기 Math.random()
    // 0.0 ~ 1.0 범위의 속하는 하나의 double값을 반환한다
    // 0.0 <= Math.random() < 1.0

    // ex) 1~10 범위의 숫자의 난수(임의의 수)를 출력

    int num = 0; // 변수 num 초기화
    
    // {} 안의 내용을 5번 반복
    for (int i = 1; i <=5  ; i++) {
        num = (int)(Math.random()* 10)+1 ; // 10은 포함하지 않기 때문에 +1을 해준다 
        System.out.println(num);
    } 
    
    }
    
}

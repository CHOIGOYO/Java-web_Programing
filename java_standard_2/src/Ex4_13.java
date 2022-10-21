public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0; // 합을 저장할 변수 
        int j = 0; // 초기화

        while(sum <=100) { // 합계가 100을 넘지 않을 때 까지
            
            System.out.printf("%d - %d%n", j, sum);
            sum += ++j; // sum은 1씩 증감하는 j씩 증감한다 
    }
}
}

public class Ex4_16 {
    public static void main(String[] args) {
        // break 문
        int sum = 0;
        int i = 0;

        while(true) {
            i++; 
            sum += i;
            if(sum > 100) { // 합계가 100을 넘어가면 
                
                break; // if문 종료
             }
            System.out.printf("%d -> %d%n", i, sum); // 13 -> 91
        } // end of while

        System.out.println("i = "+ i);
        System.out.println("sum = "+ sum);
        // i = 14
        // sum = 105
        // 13까지의 합이 100을 넘지않고 14부터 넘는것을 확인

    }
}

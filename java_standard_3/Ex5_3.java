
public class Ex5_3{
    public static void main(String[] args) {
        int [] score = {
            79, 88, 91, 33, 100, 55, 95
        };
        int max = score[0]; // score 첫 번째 값으로 최대값을 초기화
        int min = score[0]; // score 첫 번째 값으로 최소값을 초기화
        
        for(int i = 0; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            } else if(score[i]< min) {
                min = score[i];
            }
        }//end for
        
        System.out.println("max = " + max);
        System.out.println("min = " + min);
   
    }


}
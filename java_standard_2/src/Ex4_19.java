public class Ex4_19 {

	public static void main(String[] args) {
		// 이름 붙은 반복문 
		
		
		Loop1 : for(int i = 2; i <= 9; i ++) { // for문에 Loop1이라는 이름을 붙여
			for(int j = 1 ; j <=9; j++) {
				if(j == 5 ) {
					break Loop1 ; //Loop1의 이름을 가진 반복문 전체를 나감.
				  //break;
				  //continue Loop1;
				  //continue;
				}//end of for i
				System.out.println(i + "*" +j + "=" + i*j );
			System.out.println(" ");
			}// end of Loop1
		}

	}

}
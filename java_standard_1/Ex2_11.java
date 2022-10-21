package java_standard_1;

public class Ex2_11 {

	public static void main(String[] args) {
		// 부호있는 정수의 오버플로우
		
		short sMin = -32768, sMax = 32767;
		char cMin = 0 , cMax = 65535;
		
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin -1 = " + (short)(sMin - 1) ); // (계량기처럼)최소값에서 1을 빼면 최대값이 된다
		
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1)); // 최대값에서 1을 더하니 최소값으로 출력됨
		
		System.out.println("cMin = " +(int)(cMin));
		System.out.println("cMin -1 = " +(int) -- cMin);
		
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax + 1 = " + (int) ++cMax);
	}

}

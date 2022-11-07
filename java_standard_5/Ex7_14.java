public class Ex7_14 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private멤버 접근 가능 
        int iiv2 = outerCv;
    }
    static class StaticInner {
//      int siv = outerIv;   // static 클래스는 외부 클래스의 instance 멤버에 접근할 수 없다
        static int scv = outerCv;
    }
     void myMethod() {
        int lv = 0;        // 값이 바뀌지 않는 변수는 상수로 간주함 
        final int Lv = 0;  // jdk1.8부터 final 생략 가능 그래도 final 작성하는 것을 권장 

        class LocalInner{
            int liv = outerIv; 
            int liv2 = outerCv;
            // 외부 클래스의 지역변수는 final이 붙은 상수만 접근가능
            //int liv3 = lv;                                  
            // jdk1.8부터 final 생략 가능 _이전 버전은 에러
            int liv4 = Lv;
        }
     }
}

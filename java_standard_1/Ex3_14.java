package java_standard_1;
public class Ex3_14 {
    public static void main(String[] args) {
        // 문자열의 비교
        String str = new String("ABC"); // String은 Class임으로 new를 사용하여 객체를 생성해야함

        boolean result = str.equals("ABC"); // 문자열의 비교는 ==을 사용하지않고 equals() 메서드를 사용해야함
        
        System.out.println(result); //true

        // 그러나, String Class만  new 를 사용하지 않고 간단히 나타낼 수 있다

        String str1 = "abc";
        String str2 = new String("abc");


        System.out.printf("\"abc\"==\"abc\" ? %b%n" ,"abc" == "abc"); // "abc"=="abc" ? true
        System.out.printf("str1 == \"abc\" ? %b%n" , str1 == "abc"); // str1 == "abc" ? true


        System.out.printf("str2 == \"abc\" ? %b%n" , str2 == "abc"); // str2 == "abc" ? false

        /*
         바로 위 코드가 false 인 이유는 ==을 사용해서 같은 내용이더라도 객체가 다르기 때문에 false값이 출력된 것이다
         equals()는 객체가 서로 달라도 내용이 같으면  true를 출력한다 
         */

        System.out.printf("str1.equals( \"abc\" ) ? %b%n" ,str1.equals("abc")); // str1.equals( "abc" ) ? true
        System.out.printf("str2.equals( \"abc\" ) ? %b%n" ,str2.equals("abc")); // str2.equals( "abc" ) ? true

        // 대소문자 구분 
        System.out.printf("str2.equals( \"ABC\" ) ? %b%n" ,str2.equals("ABC")); // str2.equals( "ABC" ) ? false
        
        // 대소문자 구분 없이 비교
        System.out.printf("str2.equalsIgnoreCase( \"ABC\" ) ? %b%n" , 
        str2.equalsIgnoreCase("ABC")); // str2.equalsIgnoreCase( "ABC" ) ? true
            
        
        
    }
}

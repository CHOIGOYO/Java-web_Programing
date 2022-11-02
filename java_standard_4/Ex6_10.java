package JScode.java_standard_4;
//오버로딩
public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 m3 = new MyMath3();
        System.out.println("m3.add(3, 3) 결과 : " + m3.add(3, 3));
        System.out.println("m3.add(3, 3L) 결과 : " + m3.add(3, 3L));
        System.out.println("m3.add(3L, 3L) 결과 : " + m3.add(3L, 3L));
        System.out.println("m3.add(3L, 3) 결과 : " + m3.add(3L, 3));
        int[] a = {100, 200, 300};
        System.out.println("m3.add(a) 결과 : "+ m3.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a + int b) -> ");
        return a + b;
    }
    
    long add(int a, long b){
        System.out.print("long add(int a + long b) -> ");
        return a + b;
    }

    long add(long a, long b){
        System.out.print("long add(long a + long b) -> ");
        return a + b;
    } 
    long add(long a, int b){
        System.out.print("long add(long a + int b) -> ");
        return a + b;
    }

    int add(int[] a){ // int형 배열 a의 합을 return
        System.out.print("int add(int[] a) -> ");
        int resurt = 0;
        for (int i = 0; i < a.length; i ++) {
            resurt += a[i];
        }
        return resurt;
    }

}

/*
rusult>
int add(int a + int b) -> m3.add(3, 3) 결과 : 6
long add(int a + long b) -> m3.add(3, 3L) 결과 : 6
long add(long a + long b) -> m3.add(3L, 3L) 결과 : 6
long add(long a + int b) -> m3.add(3L, 3) 결과 : 6
int add(int[] a) -> m3.add(a) 결과 : 600
 */
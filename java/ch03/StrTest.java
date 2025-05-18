package ch03;

public class StrTest {
    public static void main(String[] args) {


        // 리터럴 사용
       // String a= "hello";
       // System.out.println(a); // hello 출력 
        // System.out.println(a.hashCode());

       // a= a+"world";
        //System.out.println(a);
       // System.out.println(a.hashCode());


        String a = "Hello";
        String b = "Hello";

        // 실제 저장된 메모리의 주소
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        // 리터럴로 반환시 위치가 똑같다.

        //객체 내부 상태에 기반해서 생성된 주소
        System.out.println("a.hashcode() : "+a.hashCode());
        System.out.println("b.hashcode() : "+b.hashCode());



        // new () 메모리를 런타임 시 동적으로 생성한다.->Heap 메모리에 저장
        // new 를 사용하는 이유: 자바에서 객체를 메모리에 올리기 위해 
        String str = new String ("Hello");
        String str2 = new String ("Hello");


        if (str.equals(str2)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

        // 이떄 str은 변수여서 스택에 저장. 똑같은 글자엳 각자 공간이 생기기 때문에 메모리 차지됨


        // == 연산 ) 가리키는 주소로 연산을 진행하기 때문에 not equal이 나옴
        if (str == str2){
            System.out.println("str, str2 : equal");
        }else{System.out.println("str, str2 : not equal");}


        //equals ) 연산 value로 연산을 진행하기 때문에 equal이 나옴 -> 해시코드
        if (str.equals(str2)){
            System.out.println("str, str2 : equal");
        }else{System.out.println("str, str2 : not equal");}
    

    }
}
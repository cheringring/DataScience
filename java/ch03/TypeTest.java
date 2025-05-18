package ch03;

public class TypeTest {
    public static void main(String[] args) {

        int i = 10; // 지역변수

        var age = 10; // 자기가 알아서 타입을 지정해줌, 지역변수내에서만 활용
         // 함수블럭 안에서만 사용 가능 ex) public class 여기선 사용 x

        //  var을 쓰면 문자를 재 할당할 수 없다.
        //   age = "kim"  < 이렇게 못함.


        int intVal = 10;
        double doubleVal = intVal; // 묵시적 형변환
        System.out.println(doubleVal);
        

        double doubleVal2 = 10.99;
        int intVal2 = (int)doubleVal2; // 명시적 형변환
        System.out.println(intVal2);


        int bigNum = 1000000;
        byte smallNum = (byte)bigNum; // 오버플로우 발생함.
        System.out.println(smallNum);


        double dNum = 1.2;
        float fNum = 0.9F;

        // 큰타입과 작은타입의 연산시 큰타입으로 흡수
        float fSum = (float)(dNum + fNum);

    }
}
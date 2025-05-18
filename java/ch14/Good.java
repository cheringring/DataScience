package ch14;


public class Good {
    int sum;
    static int index;
    String str;

    {

        index=1;
        for (int i=0; i<50; i++){
            sum +=i;
        }
        System.out.println("인스턴스 블록");
    } // 함수 필드가 아닌 것에 코드 블럭 처럼 사용하는 것 



// static 블럭 = 제일 먼저 올라간다.
static {
        String data = loadConfigData();
        index= 9;
        System.out.println("static block");
}


private static String loadConfigData(){
        System.out.println("load data.........");
        return "load data.........";
}


// 생성자 함수 
    public Good(){
        str = "hello";
        System.out.println("default constructor block");
    }
}

class Main3{
    public static void main(String[] args) {
        var good = new Good();
        var good1 = new Good(); // 두번째부터는 Static 은 호출되지 않는다.
        var good2 = new Good();
        System.out.println(good.sum);
    }
}
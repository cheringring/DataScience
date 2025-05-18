package ch06.HandsOn;


public class DoWhileOn {
    public static void main(String[] args) {

        var i = 0;
        var sum = 0;


        do {
            sum += i;
            i++;
        }
        while (i <= 10);
        System.out.println(sum);
    }
}
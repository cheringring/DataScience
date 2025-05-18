package ch04;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        int charge = 0;

        // else if 가 2개 이상이면 switch 문으로 바꿔서 계산하는게 속도가 훨씬 빠름
        if (age < 5) {
            charge = 1000;
            System.out.println("아동");
        } else if (age <= 20) {
            charge = 2000;
            System.out.println("청소년");
        } else {
            charge = 10000;
            System.out.println("성인입니다.");
        }
        System.out.println(charge);
   
    }
}
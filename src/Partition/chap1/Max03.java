package Partition.chap1;

import java.util.Scanner;

public class Max03 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in); // 키보드와 연결된 표준 입력 스트림

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 :"); int a = stdIn.nextInt(); //키보드에서 입력한 정수 값을 가져옴
        System.out.println("b의 값 :"); int b = stdIn.nextInt();
        System.out.println("c의 값 :"); int c = stdIn.nextInt();

        //Algorithm
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}

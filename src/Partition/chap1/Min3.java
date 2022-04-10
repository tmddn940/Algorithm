package Partition.chap1;

public class Min3 {

    //숫자 3개의 최솟값 구하기
    static int min3(int a, int b, int c){
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    public static void main(String[] args){
        System.out.println("min(3,2,1)의 최솟값은 = " + min3(3,2,1));
        System.out.println("min(10,2,13)의 최솟값은 = " + min3(10,2,13));
    }
}

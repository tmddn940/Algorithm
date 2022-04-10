package Partition.chap1;

public class Min4 {

    //숫자 네개의 최솟값 구하기
    static int min4(int a, int b, int c, int d){
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args){
        System.out.println("min(1,2,3,4)의 최솟값은 = " + min4(1,2,3,4));
        System.out.println("min(5,7,2,4)의 최솟값은 = " + min4(5,7,2,4));
    }
}

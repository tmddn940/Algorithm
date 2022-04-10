package Partition.chap1;

public class Max4 {

    //숫자 4개중 최댓값 구하기
    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    public static void main(String[] args){

        System.out.println("max(1,2,3,4)의 최댓값 = " + max4(1,2,3,4));
        System.out.println("max(3,2,6,1)의 최댓값 = " + max4(3,2,6,1));
    }
}

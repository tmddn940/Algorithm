package Partition.chap1;

public class Max03m {

    //최댓값을 계산하는 Method
    // int형 a, b, c는 메세변수(parameter)
    static int max3(int a, int b, int c){
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    public static void main(String[] args){
        System.out.println("max(3,2,1) = " + max3(3,2,1));
        System.out.println("max(3,4,5) = " + max3(3,4,5));
    }
}

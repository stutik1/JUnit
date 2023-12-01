package Stuti.codes;

public class MyMath {
    public static int sum(int[] arr){
        int sum =0;
        for (int i=0;i<arr.length;i++){
             sum = arr[i] + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sum(arr));
    }
}

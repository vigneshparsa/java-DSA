package DSA_Problems.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int sum = fibo(7);
        System.out.println(sum);
    }
    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        return  fibo(n-1) + fibo(n-2);
    }
}

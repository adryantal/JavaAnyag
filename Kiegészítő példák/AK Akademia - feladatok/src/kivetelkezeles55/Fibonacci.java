package kivetelkezeles55;

public class Fibonacci {
    
        private static long getFibonacciNumber(int n) {
        if (n < 2) {
            return n;        }
        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }

    public static void main(String[] args) {
    //System.out.println (getFibonacciNumber(100)); //idővel stackoverflow errort kapnánk

}
}

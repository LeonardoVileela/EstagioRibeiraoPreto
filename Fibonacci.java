import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static void calc(ArrayList<Integer> n) {
        n.forEach((number) -> System.out.print("(" + number + "):" + Fibonacci.fibo(number) + "\t"));
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList( 0, 1, 1, 2, 3, 5, 8, 13, 21, 34));

        Fibonacci.calc(array1);
    }
}

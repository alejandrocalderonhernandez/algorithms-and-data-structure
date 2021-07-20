package recursion;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.showSeriesFibonacci(0, 1, 20);
    }
}

//example  c = (a + b) -> 0, 1, 1, 2, 3, 5, 8, 13, 21...
class Fibonacci {

    public void showSeriesFibonacci(int a, int b, int seriesSize) {
        if (seriesSize != 0) {
            System.out.println(a + b);
            showSeriesFibonacci(b, (a + b), (seriesSize - 1));
        }
    }
}

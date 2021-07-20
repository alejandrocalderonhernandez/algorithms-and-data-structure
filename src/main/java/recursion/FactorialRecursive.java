package recursion;

public class FactorialRecursive {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.getFactorial(4));
    }
}

//Example n! = n * (n - 1) -> 4! = 1 * 2 * 3 * 4 = 24
class Factorial {
    public int getFactorial(int toFactorial) {
        if(toFactorial != 0) {
            return toFactorial * getFactorial((toFactorial - 1));
        } else {
            return 1;
        }
    }
}

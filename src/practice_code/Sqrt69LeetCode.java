package practice_code;

public class Sqrt69LeetCode {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(mySqrtByFormula(10));
    }

    public static int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int)sqrt;
    }

    public static int mySqrtByFormula(int x) {
        if (x == 0) return 0;

        long guess = x;  // Start with x as the first guess

        while (guess * guess > x) {
            guess = (guess + x / guess) / 2;
//            System.out.println(guess);
        }

        return (int) guess;
    }
}

package recursion;

public class Sum_of_digits {
    public static void main(String[] args) {

        System.out.println(sumOfDigit(123));
        System.out.println(product(505));
    }


    private static int sumOfDigit(int n){
        if(n<=0){
            return 0;
        }
        return (n%10)+sumOfDigit(n/10);
    }

    private static int product(int n){
        if(n<=0){
            return 1;
        }
        return (n%10)*product(n/10);
    }

}

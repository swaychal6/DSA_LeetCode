package recursion;

public class RecorsionExample {
    public static void main(String[] args) {

//        printNum(10);

        int a=0,b=1;
        System.out.print(a+" "+b);
        int sum=0;
        for (int i = 1; i <5; i++) {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }

    public static void printNum(int n){
        if (n == 0) {
            return; // Base case: stop when n reaches 0
        }
        printNum(n - 1); // Recursive call first
        System.out.print(n + " "); // Print during unwinding
    }
}

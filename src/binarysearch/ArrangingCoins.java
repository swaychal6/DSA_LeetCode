package binarysearch;

public class ArrangingCoins {
    public static void main(String[] args) {

        System.out.println(arrangeCoin(5));

    }

    public static int arrangeCoin(int n) {

        long start = 0;
        long end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (n >= mid * (mid + 1) / 2) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) start - 1;
    }

}


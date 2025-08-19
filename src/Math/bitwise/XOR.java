package Math.bitwise;

public class XOR {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,3,6,4};
        System.out.println(findNonDuplicateNumber(arr));
    }

    static int findNonDuplicateNumber(int arr[]){
        int duplicate=0;
        for (int n:arr){
            duplicate=duplicate^n;
        }

        return duplicate;
    }
}

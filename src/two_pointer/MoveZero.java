package two_pointer;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[]={3,4,0,5,0,2,1};
        moveZeroToRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroToRight(int arr[]){
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[index++]=arr[i];
            }
        }

        while (index<arr.length){
            arr[index++]=0;
        }
    }
}

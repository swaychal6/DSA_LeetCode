package recursion.array;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutSpaces {
    public static void main(String[] args) {
        int arr2[] = {1, 4, 6, 7};
        int arr1[] = {2, 3, 5};

        merge(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {

            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
            }

            int first=arr2[0];
            int j;
            for ( j = 1; arr2[j]<first && j<m ; j++) {
                arr2[j-1]=arr2[j];
            }

            arr2[j-1]=first;

        }
    }

}

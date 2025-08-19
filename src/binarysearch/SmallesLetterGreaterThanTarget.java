package binarysearch;

public class SmallesLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[]  letters = {'c','f','j'};
        char target = 'c';
        System.out.println(3%4);
        System.out.println(nextGreatestLetter(letters,target));
    }

    private static char nextGreatestLetter(char[] arr, char target) {

        int start=0;
        int end=arr.length-1;

        while (start<=end) {

            int mid=start+(end-start)/2;

            if(target <arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return arr[start% arr.length];
    }
}


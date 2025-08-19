package test;

import java.util.Arrays;

public class CodeTest {
    public static void main(String[] args) {

        int arr[]={2,2,0,1,2};

        int arr2[]={1,1,2,0,1};

        sort(arr);
        sort(arr2);


        System.out.println(Arrays.toString(arr2));


    }


    private static void sort(int arr[]){
                // 2,3,1,0
        for (int i = 1; i <arr.length ; i++) {
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

     static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

class A{
    B b=new B();
}

class B{

}

class C{
    B b=new B();
    A a=new A();
}


interface s{
    default void sort() {

    }
}
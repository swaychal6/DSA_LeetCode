package morganstanley;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiverCrossing {
    public static void main(String[] args) {

        int arr[] = {40, 50, 100, 70};
        int capacity = 100;
        List<String> strings = crossingRiverDSA(arr, capacity);
        for (String str : strings) {
            System.out.println(str);
        }
    }


    public static List<String> crossingRiver(int arr[], int capacity) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        ArrayList<String> steps = new ArrayList<>();
        int heaviestPersonCount = 0;

        if (arr.length == 1) {
            steps.add("send: " + arr[left]);
            return steps;
        }

        while (right > 1) {
            if (heaviestPersonCount > 0 && arr[right] <= capacity) {
                steps.add("send: " + arr[right]);
                steps.add("return:" + arr[left + 1]);
                heaviestPersonCount--;
                right--;
            } else if (arr[left] + arr[left + 1] <= capacity) {
                steps.add("send:" + arr[left] + "+" + arr[left + 1]);
                steps.add("returned:" + arr[left]);

                if (arr[right] <= capacity) {
                    steps.add("send:" + arr[right]);
                    steps.add("returned:" + arr[left + 1]);
                } else {
                    steps.add("person weight is beyond capacity:" + arr[right]);
                    heaviestPersonCount++;
                }
                right--;

            } else if (arr[left] <= capacity) {
                steps.add("send:" + arr[left]);

                if (arr[left] + arr[left + 1] >= capacity) {
                    steps.add("first 2 peoples extended the weight capacity and no one is there to return from land");
                    return steps;
                }
            }

        }

        steps.add("send:" + arr[left] + "+" + arr[right]);

        return steps;

    }


    public static List<String> crossingRiverDSA(int arr[], int capacity) {
        Arrays.sort(arr);
        List<String> steps = new ArrayList<>();

        // Step 0: check if any person > capacity
        for (int w : arr) {
            if (w > capacity) {
                steps.add("Person weight " + w + " exceeds boat capacity. Cannot cross.");
            }
        }

        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] <= capacity) {
                // send two people
                steps.add("Send: " + arr[left] + " + " + arr[right]);
                right--;
                left++;

                // someone must return (if still people on original side)
                if (left <= right) {
                    steps.add("Return: " + arr[left]); // lightest comes back
                }
            } else {
                // send the heavier alone if possible
                if (arr[right] <= capacity) {
                    steps.add("Send: " + arr[right]);
                    right--;

                    if (left <= right) {
                        steps.add("Return: " + arr[left]);
                    }
                } else {
                    // can't cross
                    steps.add("Person weight " + arr[right] + " is stuck, cannot cross.");
                    right--;
                }
            }
        }

        // last person if still left
        if (left == right && arr[left] <= capacity) {
            steps.add("Send: " + arr[left]);
        }

        return steps;
    }

}

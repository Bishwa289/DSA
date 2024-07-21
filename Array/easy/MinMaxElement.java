package Array.easy;
// first method
public class MinMaxElement {
    public static int min(int arr[]) {
        int min_element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min_element) {
                min_element=arr[i];
            }
        }
        return min_element;
    }
    public static int max(int arr[]) {
        int max_element = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max_element) {
                max_element=arr[i];
            }
        }
        return max_element;
    }
    public static void main(String[] args) {
        int arr[] = {22, 14, 8, 17, 35, 3};
        int minimum = min(arr);
        int maximum = max(arr);
        System.out.println("minumum: "+minimum);
        System.out.println("maximum :"+maximum);

    }
}

//second method
// import java.util.Arrays;

// public class MinMaxFinder {

//     /**
//      * Finds the minimum element in an array of integers.
//      *
//      * @param A The input array.
//      * @param N The size of the array.
//      * @return The minimum element in the array.
//      */
//     public static int setmini(int[] A, int N)
//     {
//         int mini = Integer.MAX_VALUE;
//         for (int i = 0; i < N; i++) {
//             if (A[i] < mini) {
//                 mini = A[i];
//             }
//         }
//         return mini;
//     }

//     /**
//      * Finds the maximum element in an array of integers.
//      *
//      * @param A The input array.
//      * @param N The size of the array.
//      * @return The maximum element in the array.
//      */
//     public static int setmaxi(int[] A, int N)
//     {
//         int maxi = Integer.MIN_VALUE;

//         for (int i = 0; i < N; i++) {
//             if (A[i] > maxi) {
//                 maxi = A[i];
//             }
//         }
//         return maxi;
//     }

//     public static void main(String[] args)
//     {
//         int[] A = { 4, 9, 6, 5, 2, 3 };
//         int N = A.length;
//         System.out.println("Minimum element is: "
//                            + setmini(A, N));
//         System.out.println("Maximum element is: "
//                            + setmaxi(A, N));
//     }
// }

//third method
// class Solution {
//     public Pair<Long, Long> getMinMax(int[] arr) {
//         // Code Here
//         long min = arr[0];
//         long max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         return new Pair<>(min, max);
//     }
// }

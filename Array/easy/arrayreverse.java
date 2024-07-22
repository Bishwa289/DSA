package Array.easy;

public class arrayreverse {
// array reverse through an extra array ***********
    // public static int[] reverse(int arr[]) {
    //     int j = 0;
    //     int newarr[] = new int[arr.length];
    //     //using a counter 
    //     // for (int i = arr.length - 1; i >= 0; i--) {
    //     //     newarr[j] = arr[i];
    //     //     j++;
    //     // }

    //     //without using any counter
    //     for (int i = 0; i < newarr.length; i++) {
    //         newarr[i] = arr[arr.length-1-i];
    //     }

    //     return newarr;
    // }

    //array reverse using while loop and swappping ********
    // public static int[] reverse(int arr[]) {
    //     int start = 0;
    //     int end = arr.length-1;
        
    //     while(start<end){
    //         int temp=0;
    //         temp = arr[start];
    //         arr[start]=arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    //     return arr;
    // }


    //now using recurssion ********
    public static int[] reverse(int arr[],int start,int end) {
        if(start>=end){
            return arr;
        }
        int temp=0;
        temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        return reverse(arr, start+1, end-1);
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Your reversed array is: ");
        int newarr[] = reverse(arr,0,4);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}


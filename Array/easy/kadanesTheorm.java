//divide conquer 2nd approach
package Array.easy;
//1st approach(kadane)this is to find maximum sub array
public class kadanesTheorm {
    public static int maxsubarray(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum<=0){
                sum=0;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        int maxsubarraysum=maxsubarray(arr);
        System.out.println(maxsubarraysum);
    }
}

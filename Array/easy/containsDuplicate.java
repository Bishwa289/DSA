package Array.easy;

public class containsDuplicate {
    public static boolean dupPresent(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
            if(i==arr.length-2){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(dupPresent(arr));
    }
}

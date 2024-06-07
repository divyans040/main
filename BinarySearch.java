public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-21,-5,4,8,13,21,37};
        int target = 13;

        int index = binarySearch(arr,target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                //target found
                return mid;
            }
        }
        return -1;
    }
}

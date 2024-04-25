public class findInMountain {

    // submission letter

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,8,9,11,12,11,9,8,3,7,6,4,2,1};
        int target = 3;
        int peak = binary(nums);
        int ans;
        int firsttry = orderAgnosticBS(nums, target ,  0, peak);
        if (firsttry != -1) {
            ans = firsttry;
            
        }else { 
             ans = orderAgnosticBS(nums, target, peak, nums.length);

        }
        System.out.println(ans);

        
    }
    static int binary(int[]nums ) {
        int start = 0;
        int end = nums.length-1;
        while (start < end ){
            int mid = start +(end - start )/2;

            if (nums[mid]>nums[mid+1]){
                end = mid;
            }
            
            else  {
                 start = mid +1 ;

             } ;
        } return start;
    }
    
    // static int lere(int[] arr , int tagret , int start , int end) {
    //     // int start = 0;
    //     // int end = arr.length -1;
    //     // int mid = start + (end-start) / 2;
    //     while (start<=end) {
    //         int mid = start + (end-start) / 2;
    //         if (tagret < arr[mid]) {
    //             end = mid -1;
    //         }
    //         else if (tagret > arr[mid]) {
    //             start = mid +1 ;
    //         }
    //         else   {
    //             return mid; 
    
    //         }
    //         // else{
    //         //     return arr[start]; 
    //         // }  
            
            
    //     }return end;
    // }
    static int orderAgnosticBS(int[] arr, int target ,int start , int end ) {
        

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

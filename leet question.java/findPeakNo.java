public class findPeakNo {
    public static void main(String[] args) {
        int [] nums= {15,16,18,20,2,3,6,11,12};
        // System.out.println(nums.length);
        int target = 15;
        int ans = searchByPiviot(nums, target);
        // searchByPiviot(nums, target)
        System.out.println(ans);
        //System.out.println(piviot(nums));
    }
   static int searchByPiviot(int [] nums ,int target){
        int pivot  = piviot(nums , target );
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int mid = start +(end- start)/2;
            

            if ( nums[mid] == target ){
                return pivot;
            }

            else if (target >= nums[0]) {
                    return binarySearch(nums, target, 0, pivot - 1);

                }
                else{
                    return binarySearch(nums, target, pivot + 1, nums.length - 1);
                }
        
                
            }
            
        return -2;


    }
     static int piviot(int[] nums ,  int target  ){
        int start = 0;
        int end = nums.length -1;

        
        while (start <= end) {
            int mid = start +(end- start)/2;
            if ( mid<end && nums[mid]> nums[mid +1]){
                return mid;

            }else if ( mid>start && nums[mid]<nums[mid-1]){
                return mid -1;
            
            }if (nums[start]>nums[mid]){
                end = mid-1;
            }else {
                start = mid =1;
            }
            
        }
        return -1;
    }
    static int binarySearch(int[] nums, int target, int start, int end) {
    while(start <= end) {
        // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start) / 2;

        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            // ans found
            return mid;
        }
    }
    return -1;
}}

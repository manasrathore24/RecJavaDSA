public class mountainArray {
    public static void main ( String [] args){
        int[] nums = {1,2,3333,12,11,9,8,7,6,4,2,1};
        int peak = binary(nums);
        System.out.println(peak);
        
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
}

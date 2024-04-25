public class infinitArray{
    public static void main(String[] args) {
        int[ ] nums = {1,23,24,54,55,57,62,63,68,76,86,89,94,98,112,115,313,632,4573,8822,85566};
        int tagret = 54;
        System.out.println(ans(nums, tagret));
        
    }
    static int ans(int[] nums , int tagret ){
        int start = 0;
        int end = 1;
        while (tagret> nums[end]) {
            int start2 = end +1;
            // previous end + previous bracket *2
            end = end + (end - start + 1 )*2;
            start = start2;
            
        }
        return infinitArrayk(nums, tagret, start, end);
        
    }
    static int infinitArrayk(int[] nums , int tagret, int start , int end){
        
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if (tagret < nums[mid]) {
                end = mid -1;
            }
            else if (tagret > nums[mid]) {
                start = mid +1 ;
            }
            else   {
                return mid; 
    
            }
            // else{
            //     return nums[start]; 
            // }  
            
            
        }return -1;

    }
}
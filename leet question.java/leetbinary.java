import java.util.Arrays;

public class leetbinary {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int [] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
        
    }

    
    static int[] searchRange(int[] nums , int tagret ){
        int[] ans = {-1,-1};
        int start = search(nums, tagret, true);
        // int tagret = 8;
        int end = search(nums, tagret, false);

        ans[0] = start;
        ans[1] = end;

        return ans ;

        



    }
    static int search(int[] nums, int target , boolean firstindex) {
        int ans = -1 ;
        
        int start = 0;
        int end  = nums.length -1;
        while (start <= end) {
            int mid = start + (end -start ) / 2 ;
           
            if( target < nums[mid]){
                end = mid -1;
            }    
            else if (target > nums[mid]) {
                start = mid +1;
            }else { 
                ans = mid ;
                if (firstindex) {
                    end = mid -1;
                }else{
                    start = mid +1;
                }


            }
           
            
        }
        return ans;
    }
}

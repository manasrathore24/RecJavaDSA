public class binarysearch {  
    public static void main(String[] args) {

        char[] letters ={'c' , 'f' , 'j'};
        char tagret = 'c';
        int [] nums ={1,2,3,12,122,1222,1441};
        int target = 4;
        // int ans = lere(arr , tagret);
        // System.out.println(ans);
        System.out.println(lere(nums , target));
    }

   static int lere(int[] nums , int target) {
    int l = 0;
    int r = nums.length;

    while (l < r) {
       int m = (l + r) / 2;
      if (nums[m] == target)
        return m;
      if (nums[m] < target)
        l = m + 1;
      else
        r = m;
    }

    return l;
  }/*  int start = 0;
    int end = nums.length -1;
    while (start <= end ){
        int mid = start + (end - start)/2;
        if( nums[mid] == target){
            return mid;
        }else if (nums[mid] < target){
            start = mid+1;
        }else if (nums[mid]> target) {
            end = mid ;
        }
       
       
    }
    
    int i =0 ;

    return 1; */
   


    // int start = 0;
    // int end = arr.length -1;
    // // int mid = start + (end-start) / 2;
    // while (start<=end) {
    //     int mid = start + (end-start) / 2;
    //     if (tagret < arr[mid]) {
    //         end = mid -1;
    //     }
    //     else if (tagret > arr[mid]) {
    //         start = mid +1 ;
    //     }
    //     else   {
    //         return mid; 

    //     }
    //     // else{
    //     //     return arr[start]; 
    //     // }  
        
        
    //     }return end;

    }
    static char next(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1 ;
        while (start <= end ) {
            int mid = start + (end - start) / 2 ;

            if ( target < letters [ mid ] ){
                end = mid -1 ;
            }
            else { 
                start = mid +1;
            }

        } return letters[start % letters.length];

    }           
    
}

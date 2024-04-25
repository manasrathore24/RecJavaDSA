import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[][] arry = {
            {1,23,4,22,34},
            {23,234,385,32,24},
            {2,3,5,7,2},
            {25,76}
        };
        
        int target = 5;
        int[] ans = search(arry,target) ;
        System.out.println(Arrays.toString(ans));

    }
    static int max(int[][] arry ){
        int max = Integer.MIN_VALUE; 
        for (int[] in : arry) {
            for (int el : in) {
                if (el > max) {
                    max = el ;
                    
                }
                 {   

                }   
            }
            
        }
    return max;
    }
    static int[] search (int[][] arry , int target){
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j]== target) {
                    return new int[]{i,j};
                    
                }

                
            }
            
        }
        return new int[]{-1,-1};
    
    }
    static void yh (){
        
    //     String se = " save water save life " ;
    //     char target = 'v';
    //     boolean b = search(se, target);
    //     System.out.println(b);

    // }
    // static boolean search (String see , char target ){
    //     if (see.length() == 0 ) {
    //         return false ;
            
    //     }
    //     for (int i = 0; i < see.length(); i++) {
    //         if (target == see.charAt(i)) {
    //             return true;
                
    //         }
            
    
        
    //     return false;}
    //     int[] num = {21, 14 ,14 ,24 ,2};
    //     int target = 14;
    //     int aa = search(num, target);
    //     System.out.println(aa);

    // }
    // static int search (int arr[] , int target ){

    //     if (arr.length == 0) {
    //         return -1 ;
            
    //     }
    //     for (int index  = 0; index < arr.length; index++) {
    //         int element =arr[index];
    //         if (element == target) {
    //             return index;
                
    //         }
            
    //     }
    //     return -1; 
    // }
    
            







    }


            

}
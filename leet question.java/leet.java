// import java.util.Scanner; 
public class leet {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[] nums = {12,24,534,134,34,2343,5646,};
        System.out.println(findnum(nums));
        
    }
    static int findnum(int[] nums){
        int count = 0 ;
        for (int num : nums){
            if (even(num)) {
                count++;
                
            }
            
        }
        return count;
    }
    static boolean even(int nums){  
        int evenOrNot = digitcount(nums);
        if (evenOrNot % 2 == 0) {
            return true;
            
        }return false ;


    }
    static int digitcount (int num ){
        int count = 0;
        while (num > 0) {
            count ++;
            num = num / 10 ;
            
        }
        return count;

    }

}

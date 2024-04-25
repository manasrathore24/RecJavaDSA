public class squareRoot {
    public static void main(String[] args) {
        int a = guessNumber(10);
        System.out.println(a );
    }
    static int guessNumber(int n) {
        int start = 1 ;
        int end = n;
        while ( start <= end ){
            int mid  = start + (end - start)/2;
            int num = guess(mid);
            if (num == 0 ){
                return mid ;
            }else if(num == 1 ){
                start = mid +1;
            }else if (num == -1 ){
                end = mid - 1;
            }
            
        }
        return 0;

    }static int guess (int mid){
        int pick =6;
        if (mid == pick)
        return 0;
        else if ( mid > pick){
            return  -1;}
        else {
                return 1;
            }
        }
        
    
        
    static boolean
    }
        

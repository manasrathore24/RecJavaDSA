import java.util.Arrays;

public class searchin2Darray {
    
    public static void main(String[] args) {
        int [][] D2 = {
            {10,20,30,40 },
            {12,22,32,42},
            {14,24,34,44}
        };
        int tagret = 34;
        System.out.println(Arrays.toString(searchIn2d(D2, tagret)));

    }
   
    static int [] search(int [][] matrix , int tagret){
        int r = 3;
        int[] arr = {};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == tagret) {
                    return new int [] {i , j };
                    
                }   
            }  
        }
        return new int []{-1,-1};

    } 
    static int []searchIn2d(int [][] matrix , int tagret ){
        int s = 0 ;
        int e = matrix.length -1;
        while (s < matrix.length && e>=0) {
            if (matrix[s][e]== tagret){
                return new int[] {s,e};
            }
            if(matrix[s][e] < tagret){
                s ++ ;
            }else {
                e --;
            }
            
        }

        return new int[] {-1,-1};
    }
}

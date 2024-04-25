import java.util.Arrays;
import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int [][] u = {
            {3,4,5,6,},
            {83,84,5},
            {37,4,63,345,3,4,}
        };
        System.out.print(" your order of matrix: ");
        int row = e.nextInt();
        int col = e.nextInt();
        System.out.print("enter no. ");
        int [][]  md = new int[row][col];
        int w;

        for (int i = 0; i < row ; i++) {
            for (w = 0; w< col; w++) {
                md[i][w] = e.nextInt();
                
            }
        } 
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++){
                System.out.print(md[i][k] + " ");

            }System.out.println();
        }
        System.out.print(" another way:" );
        for( int[] kl : md ){
            System.out.println(Arrays.toString(kl));
        }
        // System.out.println(" direct way:" );
        // System.out.println(Arrays.toString(md));



    }
}
//         int o = 3 ;
//         int q =  3  ;
// System.out.println( " enter matrix ");
//         int [][] a = new int[o][q];
        
    //    int [][] u = {
    //         {3,4,5,6,},
    //         {83,84,5},
    //         {37,4,63,345,3,4,}
    //     };  
//         // System.out.println(Arrays.toString(u[2]));
//         for ( int row = 0 ; row < o  ;row++ ){
//             for (int col  = 0; col < q ; col++) {
//                 a[row][col] = e.nextInt();
                
//             }
//         }
        
//         for (int[] l : a){
//             System.out.println(Arrays.toString(l));
//         }
        
//         // for ( int row = 0 ; row <o; row ++ ){
//         //     for (int col  = 0;  col < q; col++) {
//         //         System.out.print(a[row][col] + "  ");
//         //     }
//         //     System.out.println();
//         // }
           
//     }
    
// }

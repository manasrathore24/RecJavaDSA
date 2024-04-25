import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    
    public static void main(String[] args) {
        int[] ja = {
          68,99,88,77,66,55,33
        };
        // System.out.println(Arrays.toString(ja));

       
        System.out.println(max(ja));
       
    }

    static int max(int[] ja) {
        int max = ja[0];
        for (int index = 1; index < ja.length; index++) {
            if (ja[index]>max) {
                max = ja[index];
               
            }


            
        }return max;

        
    }

    // static void swap(int[] ja, int index1 , int index2) {
    //     // TODO Auto-generated method stub
    //     int temp = ja[index1];
    //     ja[index1] = ja[index2];
    //     ja[index2] = temp
    //     ;

    // }
}
/* ArrayList<integer> jss= new ArrayList<>();
        jss.add(8392); jss.add(8237.0283f);
        jss.add(29837);
        jss.add(98327);
        jss.add(897349);        jss.add(29837);

        jss.add(98327);
        
        System.out.println(jss);
        jss.set(2, 444444444);
        

        jss.get(8);
        ArrayList<String> aj = new ArrayList<>();
        aj.add("akcdkanc aksd cnsd ");
        aj.add("adcbas aksk ");
        System.out.println(aj);System.out.println(jss);
         */
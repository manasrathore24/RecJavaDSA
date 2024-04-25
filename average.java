
import java.util.Scanner; 
public class average {
    // import java.util.Scanner; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" we will find average of any three no ");
        System.out.print("please enter your no : "); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float j =av(a, b, c); 
        System.out.println("your average is : "+ j);

        
    }
     public static int av(int a, int b , int c ) {
        int sum = a + b + c ;
        int av = sum / 3;
        return av ;

    }

    
}

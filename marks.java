import java.util.Scanner;

public class marks { 

   
    public static void main(String[] args) {
        
       
        
    
    }
    
     static void vote() {
        Scanner imp = new Scanner(System.in);
        
        System.out.print("enter your age ");
        int age = imp.nextInt();

        
            
          if (age  >= 18) {
            System.out.println("eligable");

          }
         else{
            System.out.println("go to home  ");
            return ;

         }

    }
    
}

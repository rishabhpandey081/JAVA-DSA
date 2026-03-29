import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       int sum=0;
    
      while( in.hasNextInt ()) {
        int a = in.nextInt();
      sum+= a;
    
   }
     System.out.println("sum = " +sum); 
   

}
}  
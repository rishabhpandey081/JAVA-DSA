import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         System.out.println("ENTER THE YEAR");
        int n = in.nextInt();
    
     


    if (n%4==0 && n%100!=0 || n%400==0){
        System.out.println("IT IS LEAP YAER");
        
    }else {
        System.out.println("NOT LEAP YEAR");
    }
 
 }
}

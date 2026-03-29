
    import java.util.Scanner;

public class intresr {

public static void main (String [] args){
    Scanner input= new Scanner (System.in);
    System.out.println("Enter principal ");
    double principal = input.nextDouble();
    System.out.println("Enter the rate ");
    double rate = input.nextDouble();
    System.out.println("Enter the time ");
    double time = input.nextDouble();
    double simpleIntrest = (principal * rate * time) / 100;

    
 }   
}
}

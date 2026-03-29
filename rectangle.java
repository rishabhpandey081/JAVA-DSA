import java.util.Scanner;
public class rectangle { 
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    double WIDTH,Length,area;
    System.out.println("ENERT THE WIDTH");
    WIDTH = in.nextDouble();
    System.out.println("Enter The Length");
    Length= in.nextDouble();
    area = (Length*WIDTH);
    System.out.println("area:"+area);
}
}
    

 
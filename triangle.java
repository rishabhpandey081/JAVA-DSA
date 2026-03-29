import java.util.Scanner;
public class triangle {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER THE VALUE BASE");
    double BASE = in.nextDouble();
    System.out.println("ENTER THE HEIGHT");
     double HEIGHT = in.nextDouble();
     double area = (BASE*HEIGHT)/2;
     System.out.println("area:" + area);
}
    
}

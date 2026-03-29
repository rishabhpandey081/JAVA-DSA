import java.util.Scanner;
public class circle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF RADIUS");
     double radious= in.nextDouble();
     double area = Math.PI * (radious * radious);
     System.out.println( "tThe area of the circule is:" +area);  

    }
}

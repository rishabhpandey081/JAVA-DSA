import java.util.Scanner;
public class weak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
        case 1-> System.out.println("Monday");
         case 2-> System.out.println("Tuesday");
          case 3-> System.out.println("Wednesday");
           case 4-> System.out.println("Friday");
            case 5-> System.out.println("saturday");
             case 6-> System.out.println("sunday");
              default -> System.out.println("ENTER AN VALID NUMBER");


        }
        
        }
    
}

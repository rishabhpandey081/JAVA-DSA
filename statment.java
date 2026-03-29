import java.util.Scanner;
public class statment{
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter an input");
        String fruit = in.next();
        switch(fruit){
            case "Mango":
                System.out.println("KING OF FRUITS");
                break;
                case "Banana":
                    System.out.println("yellow fruit");
                    break;
                    case "Orange":
                    System.out.println("orange fruit"); 
                    break;
                    default:
                        System.out.println("PLEASE ENTER A VALID FRUIT");
        }
    }
}

import java.util.Scanner;
public class udstoinr{ 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
       double usd = num * 0.011;
    System.out.println("value of uds in rupees is " + usd);
    }
    }

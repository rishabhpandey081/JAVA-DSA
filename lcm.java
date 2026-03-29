import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENETR THE FIRST NUMBER ");
        int a = in.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
           int b = in.nextInt();
         int max = (a>b) ? a:b;
         while (true) {
            if (max%a==0 && max%b==0){
                System.out.println("lcm is:"+max);
                break;
              
            }
              max+++;
         }
         
    }
}

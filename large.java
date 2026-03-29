import java.util.Scanner;
public class large {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=n;
        while(n!=0){
         if(n>max){
            max=n;
         
         
         }
         n = in.nextInt();
        }
        System.err.println("largest:"+max);
    }
    
}

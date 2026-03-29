import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number ");
        int num= in.nextInt();
       int ans = 0;

    for( int n=1 ;n<=10 ;n++){
        ans= num * n; 
        System.out.println(ans);
    }
  }


}
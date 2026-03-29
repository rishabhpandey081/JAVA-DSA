import java.util.Scanner;
public class febnoacoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= in.nextInt();
        int a= 0 ,b= 1;
        int s = 1;
        
        for(int i=2;i<n;i++){

         int c = a+b;
         a=b;
         b=c;
         s=s+c;
        
        }
 System.out.println(s);
        }
    }


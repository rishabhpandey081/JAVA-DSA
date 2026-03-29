import java.util.Scanner;
public class hcf1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hcf=1;
        System.out.println("enter the first number");
        int a = in.nextInt();
          System.out.println("enter the second number");
           int b = in.nextInt();
           int min =(a<b) ? a:b;
           for(int i = 1; i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
                System.out.println(" HCF="+hcf);
            
           


    }
    
}

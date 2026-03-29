import java.util.Scanner;
public class hcf {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        System.out.println("enter a num1");
        int num2= in.nextInt();
        System.out.println("enter a num2");
        int hcf=1;
       
      
        for(int i=1;i<=num1 && i<=num2; i++){
            if(num1%i==0 && num2%i== 0){
                hcf=i;

            }
            

        }
        System.out.println("HCF="+hcf);
    }
}

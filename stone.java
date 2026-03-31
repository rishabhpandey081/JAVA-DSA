import java.util.Scanner;                                            
import java.util.Random;
import java.util.Arrays;
public class stone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      String[]r={"stone","paper","scissor"};
      int win = 0;
      int n = in.nextInt();
      while(win<=3){
    if((n==0&& r[1].equals("paper") )||
      (n==1&& r[2].equals("scissor"))||
     (n==2 && r[0].equals("stone"))){
      System.out.println("COMPUTER WIN:"+win);
        win++;
    }
    else if ((n==0&&r[0].equals("stone"))||
       (n==1&&r[1].equals("paper"))||
    (n==2&&r[2].equals("scissor"))){
           System.out.println("DRAW:"+win);}
    else if((n==0 && r[2].equals("scissor"))||
           (n==1 && r[0].equals("stone")) ||
           (n==2 && r[1].equals("paper"))){
           System.out.println("You win");
           win+=1;
           }
    
      n = in.nextInt();
    
      }
      System.out.println("Game over");
      in.close();
    }
    
}

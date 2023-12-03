import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the weather condition ");
        int heat=input.nextInt();
        if(heat >30 ){
            System.out.println("Your activity is the swimming ");
        }else if (5<= heat && heat <=30){
            System.out.println("Your activity is  going to the  cinema ");
        }else{
            System.out.println("Your activity is ski ");
        }
    }
}
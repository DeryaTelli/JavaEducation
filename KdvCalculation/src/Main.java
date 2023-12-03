import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double  amount , kdvamount , kdv=0.18 ;
        System.out.println("Write the amount of product:");
        amount=input.nextDouble();
        kdvamount=amount*(1+ kdv);
        System.out.println("KDV amount:"+kdvamount);
    }
}
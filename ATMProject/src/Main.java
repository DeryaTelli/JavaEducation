import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance= 1000 , i , amount;
        Scanner input=new Scanner(System.in);
        System.out.println("Hello ,Code Time Bank Welcome !");
        System.out.println("your current balance:"+balance+ " TL");

        while (balance > 0) {
            System.out.println();
            System.out.println("1. Deposit money "); // para yatirmak
            System.out.println("2. Withdraw money"); // para cekmek
            System.out.println("3. Balance inquir"); // bakiye sorgulamak
            System.out.println("4. Log out");
            System.out.println("Select Wanting Process");
            i=input.nextInt();

            if(i==1){
                System.out.println("Enter amount of wanting deposit money:");
                amount=input.nextInt();
                balance+=amount;
            }
            else if (i==2){
                System.out.println("Enter amount of wanting withdraw money:");
                amount= input.nextInt();
                if(amount > balance){
                    System.out.println("Don't have enough money , try again");
                }else{
                    balance-=amount;
                }
            }
            else if (i==3){
                System.out.println("Current balance:"+balance+" TL");
            }
            else if(i==4){
                System.out.println("Logging out");
                break;
            }
            else{
                System.out.println("Error ,Invalid number.Choose from numbers 1 to 4  ");
            }
        }
        System.out.println("Come again !");
    }
}
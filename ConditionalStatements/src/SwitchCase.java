
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Write number:");
        int a = input.nextInt();
        switch (a){
            case 1:
                System.out.println("Number is equal 1 ");
                break;
            case 2:
                System.out.println("Number is equal 2");
                break;
            case 3:
                System.out.println("Number is equal 3");
                break;
            default:
                System.out.println("Number is not equal these numbers");
        }

    }
}

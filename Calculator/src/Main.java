import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please,Write one number:");
        double number1 = input.nextDouble();
        System.out.println("Please,Write one number");
        double number2 = input.nextDouble();
        System.out.println("Which action do you want? ");
        System.out.println("1-Collection\n2-Extraction\n3-Multiplication\n4-Division");
        System.out.println("Please, write action");
        int action = input.nextInt();
        double collection= number1+number2;
        double extraction = number1-number2;
        double multiplication = number1*number2;
        double division = number1/number2;
       /* if(action==1) {
            System.out.println("Collection"+collection);
        }
        else if (action ==2){
            System.out.println("Extraction"+extraction);

        }else if (action ==3){
            System.out.println("Multiplication"+multiplication);

        }else if (action ==4){
            System.out.println("Division:"+division);

        }else{
            System.out.println("Please, you should try it ");
        }*/

        switch (action){
            case 1:
                System.out.println("Collection"+collection);
                break;
            case 2:
                System.out.println("Extraction"+extraction);
                break;
            case 3:
                System.out.println("Multiplication"+multiplication);
                break;
            case 4:
                System.out.println("Division:"+division);
                break;
            default:
                System.out.println("This action is not available ");
        }



    }
}
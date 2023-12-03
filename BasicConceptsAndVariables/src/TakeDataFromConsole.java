import java.util.Scanner;

public class TakeDataFromConsole {
    public static void main(String[] args){
           Scanner input = new Scanner(System.in);
          /* int a,b;
           System.out.println("Write A number;");
           a=input.nextInt();
           System.out.println("Write B number;");
           b=input.nextInt();
           int c= a+b;
           System.out.println("Collection:"+c);

            double d;
            System.out.println("Write number in Dobule type; ");
            d=input.nextDouble();
            System.out.println("Double Number:"+d);
            */
            String e;
            System.out.println("Write one word;");
            e=input.nextLine();
            System.out.println("Word:"+e);
    }
}

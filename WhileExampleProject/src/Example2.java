import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
         // Example 2: program that accepts input from the user and adds odd
         // numbers from the entered values until a negative value is entered
        Scanner input= new Scanner(System.in);
        int i;
         int colection=0;
          while (true){
              System.out.println("Enter a number:");
               i = input.nextInt();
              if (i%2==1){
                  colection+=i;
                  System.out.println("Colection:"+colection);
              }
              else if (i<0){
                  System.out.println("Enter a negatif number, Program was ended");
                  break;
              }
          }
        }
}

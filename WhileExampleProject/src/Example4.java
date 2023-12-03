import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){
        // Example4 : factorial calculation
        Scanner input= new Scanner(System.in);
        System.out.println("Enter factorial number");
        int i= input.nextInt();
        int result = 1;
        while(i >0){
            result *=i;
            i--;
        }
        System.out.println(result);


    }

}

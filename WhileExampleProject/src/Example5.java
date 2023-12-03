import java.util.Scanner;

public class Example5 {
    public static void main(String[] args){
        //Example 5: harmonik number
        // harmonic(n)= 1/1 + 1/2+ 1/3+ ......+1/n
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        double i = input.nextDouble();
        double result =0;
        while (i>0 ){
            result+=(1/i);
            i--;
        }
        System.out.println(result);
    }
}

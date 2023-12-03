import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
     //Example 3: Powers of 2 up to the enterred number

        /*
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter a number");
        int i = input.nextInt();
        int result = (int)Math.pow(2,i); // 2 is base i is force
        System.out.println("Counter:"+result);
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scan.nextInt();
        int k = 1;
        while (k <=i){
            System.out.println(k);
            k*=2;

        }

    }
    }


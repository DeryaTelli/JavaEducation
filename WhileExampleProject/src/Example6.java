import java.util.Scanner;

public class Example6 {
    public static void main(String[] args){
        // Example 6 : make triangile with star
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int star = input.nextInt();
        int i =1;
        while (i<=star){
            int k=1;
            while(k <= i ){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;

        }
    }
}

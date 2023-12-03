import java.util.Scanner;

public class Example7 {
    public static void main(String[] args){
        // Example 7 : exponential number calculation
        Scanner input = new Scanner(System.in);
       /* while(true){
            System.out.println("Enter a base number");
            int base = input.nextInt();
            System.out.println("Enter a uper number ");
            int uper = input.nextInt();
            int result = (int)Math.pow(base,uper);
            System.out.println(base+"^"+uper+":"+result);
        }*/

        System.out.println("Enter a base number");
        int base1 = input.nextInt();
        System.out.println("Enter a uper number ");
        int uper1 = input.nextInt();
        int i =1;
        int result =1;
        while (i<=uper1){
            result*=base1;
            i++;
        }
        System.out.println(base1+"^"+uper1+"="+result);
    }
}

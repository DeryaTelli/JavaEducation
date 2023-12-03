import java.util.Scanner;

public class ForExample1 {
    public static void main(String[] args) {
        // find prime number
        Scanner input = new Scanner(System.in);
        int a;
        boolean prime =true;
        do {
            System.out.println("Enter a pozitif number");
             a = input.nextInt();
        }while(a<2);
        for(int i=2; i<a ; i++ ){
            if(a%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Entered number:"+a+ "prime");
        }else{
            System.out.println("Entered number "+a+ "is not prime");
        }





    }
}
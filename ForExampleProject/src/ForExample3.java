import java.util.Scanner;

public class ForExample3 {
    public static void main(String[] args){
       // Fibonacci serisi : 0 , 1 ,1 ,2 ,3 ,5 ,8 ,13 ,21, .....
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = input.nextInt();
        int s1 =0;
        int s2=1;
        int collection;
        System.out.print(a+" "+"number fibonacci series :");
        for (int i=1; i<=a ; i++){
            System.out.print(s1+",");
            collection = s1 + s2; // 0 + 1
            s1 = s2; // 0 , 1= s1 s2 idi ama
            s2 = collection; // 0 , 1 ,1=s2 buda ilk ilisinin toplami


        }
    }
}

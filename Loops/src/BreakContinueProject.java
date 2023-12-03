import java.util.Scanner;

public class BreakContinueProject {
    public static void main(String[] args){
        //Break
        while(true){ // while ici true oldugu icin bu dongu surekli donecektir
            System.out.println("Hello");
            break; // eger bunu yazmasaydim dongu sonsuza kadar hello yazacakti
        }

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter one number ");
            int number= input.nextInt();
            if(number==0){
                break;
            }
            System.out.println(number);
        }

        //Continue
        for(int i=1; i<=10; i++){
            if(i==4 || i==9){
                System.out.println("pass="+i);
                continue;
            }
            System.out.println("i="+i);
        }

    }
}

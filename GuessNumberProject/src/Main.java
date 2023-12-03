import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int guess , right=5 , i=0;
        Random rand=new Random();// rastgele sayi olusturur
        Scanner input=new Scanner(System.in);
        int number= rand.nextInt(100);// 0 ile 100 arasinda rastgele sayi uretecek
        boolean gameSituation=false , error=false;
        int[] guesses = new int[5];
        System.out.println(number);
        System.out.println("Are you ready? Can you guess the number ??? :)");
        System.out.println("I keep a number between 0 and 99");
        while ( right>0){
            System.out.println("Enter a number of your guessed ");
            guess = input.nextInt();
            if(0>guess || guess>100){
                 if(error) {
                     System.out.println("More wrong enter , fail a right ");
                     System.out.println("Rest of right: "+--right );
                     right--;
                 }else{
                     error=true;
                     System.out.println("The number of your guessing have to be between 0 and 99");
                 }
                   continue;
            }
            guesses[i++]=guess; // tahminleri guesses dizisine atiyacaktir bu islem index degeri artikca girilen yeni deger dizi elemani olucak
            if(guess==number){
                gameSituation=true;
                System.out.println("Your guessing is correct");
                break;
            }
            else{
                System.out.println("Wrong , try again!! Rest of right: "+--right);

            }

        }
        if(gameSituation){
            System.out.println("Congratulations correct guess!!");
            System.out.println("Our number: "+number);
            System.out.println("Rest of right: "+right );
        }else{
            System.out.println("Fail :(");
        }
        System.out.print("your guess:");
        for(int allValue: guesses){
            if(allValue!=0)
                 System.out.print(allValue+ ",");
        }

    }
}
import java.util.Scanner;

public class MethodExample1 {
    static boolean isPalindrom(int i ){
        int temp , newNumber=0 , remainNumber;
        temp=i;
        while(temp !=0 ){

            remainNumber=temp%10;
            newNumber=newNumber*10+remainNumber;
            temp/=10;
        }
        if(i == newNumber)
            return true;
        else
            return false;


    }
    public static void main(String[] args) {
        // palindrom sayi tersi kendine esit olan sayilara denir
        // 123321

        System.out.println(isPalindrom(123321));
        System.out.println(isPalindrom(130));

    }
}
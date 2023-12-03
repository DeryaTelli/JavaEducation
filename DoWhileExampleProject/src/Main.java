import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example 1 : Negatif bir deger girilene kadar kullanicidan girisleri kabul eden
        // ve girilen degerlerden cift sayilari toplayn program
        Scanner input= new Scanner(System.in);
        int i , collection = 0 ;
        do{
            System.out.println("Enter a number");
            i = input.nextInt();
            if(i%2==0)
            {
                collection+=i;
            }
        }while(i>0); // dogru iste bu kosul donguye devam edecek yanlis ise donguden cikip toplama yapacaktir 

        System.out.println("Collection entered even number :"+collection);
        }
    }

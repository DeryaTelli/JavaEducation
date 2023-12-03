import java.util.Scanner;

public class Try {
    public static void main(String[] args){
        System.out.println("Program has started");
       /*
        int a=0;
        try{
            a= 2/0; // hata yakaladik
            System.out.println("Try inside!");
            System.out.println(a);
        }catch (ArithmeticException e){// usteki iki kodu okumadan direkt catch yakaladi
            System.out.println(e.getMessage());
        }
        System.out.println(a);
        */

        int a=0,b;
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            b=scan.nextInt();
            a= 2/0;
            arr[4] = 10;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch (Exception e){ // bu herzaman sona yazilir uste yazilirsa diger hatalari tutar ve tanimlanmayan hatalari algilayamaz
            System.out.println("There is a error");
            System.out.println(e.toString());
        }finally { // tryin sonunda olur try da hata olsada olmasada finally calsir
            System.out.println("Finally ");
        }

        System.out.println("Program has ended");

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write a number");
        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();
        if(a>b && b>c) {
            if(b>c){
                System.out.println("Arrangement:"+a+","+b+","+c);
            }else {
                System.out.println("Arrangement:"+a+","+c+","+b);
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println("Arrangement:"+b+","+a+","+c);
            }else {
                System.out.println("Arrangement:"+a+","+c+","+a);
            }
        }else{
            if(a>b){
                System.out.println("Arrangement:"+c+","+a+","+b);
            }else {
                System.out.println("Arrangement:"+c+","+b+","+a);
            }
        }


    }
}
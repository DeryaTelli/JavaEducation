import java.util.Scanner;

public class ForExample4 {
    public static void main(String[] args){
        // EKOK bir sayo grubundan sayilarin ortak katlarin en kucugu
        // EBOB ise bu sayilari bolen en buyuk sayi
        // ekok = (s1*s2)/ebob

        Scanner input= new Scanner(System.in);
        int s1 ,s2, ebob=1, ekok;
        System.out.println("Enter s1 number");
        s1=input.nextInt();
        System.out.println("Enter s2 number");
        s2=input.nextInt();
        int min =(s1 < s2)? s1 : s2;// s1 s2 den kucukse kucuk s1 degilse s2
        for(int i=min; i>0; i--){
            if (s1%i==0 && s2%i==0){
                ebob=i;
                break;
            }
        }
        ekok = (s1*s2)/ebob;
        System.out.println(s1+" "+"and "+s2+" "+"numbers ekok is: "+ ekok);
        System.out.println(s1+" "+"and "+s2+" "+"numbers ebob is: "+ ebob);


    }
}

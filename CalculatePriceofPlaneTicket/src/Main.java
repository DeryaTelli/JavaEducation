import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Write lenght:");
        int km =input.nextInt();
        System.out.println("Write your age:");
        int age = input.nextInt();
        System.out.println("Select type of vacation (1= one direction, 2=going and coming ):");
        int type=input.nextInt();
        double price, agediscount, typediscount;
        if(km>0 && age>0 && (type==1 || type==2)){
            price= km * 0.10;
            if (age<=12 ){
                 agediscount = price*0.5; // discount rate

                System.out.println("%50 discount:"+agediscount);
            }
            else if (12<=age || age <=24 ){
                agediscount = price*0.1; // discount rate

                System.out.println("%10 discount:"+agediscount);
            }
            else if (age >= 65 ){
                agediscount = price*0.3; // discount rate

                System.out.println("%30 discount:"+agediscount);
            }
            else{
                agediscount= 0;
                System.out.println("Not avaiable age discount");
            }
            price -=agediscount; // price= price-agediscount
            if(type==2){
                typediscount= price*0.2;
                price= 2*(price-typediscount);
                System.out.println("%20 discount:"+typediscount);
            }else {
                typediscount=0;
                System.out.println("Not avaiable type discount");

            }
            System.out.println("Price of your ticket: "+price+"$");
        }else{
            System.out.println("Wrong variable, try again ");
        }





    }
}
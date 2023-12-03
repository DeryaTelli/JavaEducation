import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Write your name:");
       String user_name = input.nextLine();
       System.out.println("Write your pasword:");
       String pasword=input.nextLine();
       if( user_name== "java" && pasword == "1234"){ // user_name.equals("java") && pasword.equals("1234")
           System.out.println("Welcome , your log in is succesful");
       }else{
           System.out.println("Pasword is wrong,try again :(");
       }


    }
}
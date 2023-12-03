import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome Mine Field :)");
        System.out.println("Please, Enter the dimensions you wanna play:");
        System.out.print("Row Number:");
        int row = input.nextInt();
        System.out.print("Column Number:");
        int column = input.nextInt();
        MineFieldGame mine= new MineFieldGame(row,column);
        mine.run();

    }
}

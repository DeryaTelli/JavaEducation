import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r ;
        double area , perimeter ,volume , pi=3.14;
        System.out.println("Write the diameter of circle:");
        r= input.nextInt();
        area=pi*r*r;
        System.out.println("The area of circle:"+area);
        perimeter=2*pi*r;
        System.out.println("The perimeter of circle:"+perimeter);
        volume=(4*pi*r*r*r)/3;
        System.out.println("The volume of circle:"+volume);
    }
}
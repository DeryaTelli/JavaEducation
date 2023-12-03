import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] exam = new int[7];
        int collection=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a exam in order");
        System.out.print("Maths 1: ");
        exam[0]=input.nextInt();
        System.out.print("Physical 1: ");
        exam[1]=input.nextInt();
        System.out.print("Turkish 1: ");
        exam[2]=input.nextInt();
        System.out.print("Social Education1: ");
        exam[3]=input.nextInt();
        System.out.print("History 1: " );
        exam[4]=input.nextInt();
        System.out.print("Chemistry 1: " );
        exam[5]=input.nextInt();
        System.out.print("Music 1: " );
        exam[6]=input.nextInt();

        for(int value: exam){
            collection+=value;

        }
        System.out.println("Average:"+(collection/exam.length));


    }
}
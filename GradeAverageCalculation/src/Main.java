 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quiz, midterm ,lastexam;
        double average;
        System.out.println("Write note of your quiz:");
        quiz=input.nextInt();
        System.out.println("Write note of your midterm:");
        midterm=input.nextInt();
        System.out.println("Write note of your last exam:");
        lastexam=input.nextInt();
        average= (quiz*0.1)+(midterm*0.4)+(lastexam*0.5);
        System.out.println("Average:"+average);

        if(average>=50){
            System.out.println("Student passed the class");
        }
        else{
            System.out.println("Student didn't pass the class");
        }

    }
}
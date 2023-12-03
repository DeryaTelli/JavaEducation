import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Write note of your math:");
        double math=input.nextDouble();
        System.out.println("Write  note of  your turkish :");
        double turkish=input.nextDouble();
        System.out.println("Write note of your social education :");
        double social=input.nextDouble();
        System.out.println("Write note of your physical education :");
        double physical=input.nextDouble();
        System.out.println("Write note of your science education :");
        double science=input.nextDouble();
        double argo= (0.1*physical)+(0.3*math)+(0.3*science)+(0.1*social)+(0.2*turkish);
        System.out.println("Your ARGO:"+argo);
        if(argo>= 50){
            System.out.println("Congratulations, you passed the class");
        }else {
            System.out.println("Unfortunately , you didn't pass the class");
        }
    }
}
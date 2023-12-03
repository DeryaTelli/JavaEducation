import java.util.Scanner;

public class ArraysProject {
    public static void main(String[] args) {


        int[] list1 = new int[4];
        //int [] list ={1,2,3,4};
         list1[0]=1;
         list1[1]=2;
         list1[2]=3;
         list1[3]=4;
         for (int i=0; i<list1.length;i++){
             System.out.println(list1[i]);
         }
        for(int value: list1){ // foreach ile dizileri yazdirma islemi
            System.out.println(value);
        }

        int[] list2 = new int[4];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<list2.length; i++){
            list2[i]=input.nextInt();
        }
        for (int i=0; i<list2.length; i++){
            System.out.println(list2[i]);
        }

    }
}
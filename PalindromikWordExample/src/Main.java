import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // kapak , yapay , yatay , teget tersinden okununca kendine esit olan kelimeler
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text:");
        String poliWord=input.nextLine();
        String temp="";
        for (int i=poliWord.length()-1; i>=0;i--){
            temp+=poliWord.charAt(i); // i nin dondurdugunu karakterleri okuyacak
           //  System.out.println(temp);
        }
         // System.out.println("2:"+temp); // tersten yazilisini veriyor yukaridaki islemi uyguluyor

       if(temp.equals(poliWord)){
           System.out.println("Polindromik Text");
       }else{
           System.out.println("Not Polindromik Text");
       }

    }
}
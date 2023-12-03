public class WhileProject {
    public static void main(String[] args) {
         int i=10; // deger degistirdik 1 di do while kullanmak icin 10 yaptim
         System.out.println("Start loops");
        /* while (i<=5){
             System.out.print(i);
             i++;
         }*/
        do{
            System.out.print(i);// burada 10 yazdiricak cunku while kosulunu saglasaydi tekrar kosula donecekti
            // iste do while ile while arasindaki fark bu whilede donguye girmeden bitirir ama do whilede deger while kosuluna uymasada
            // bir kez calistirilir ama dongu devam etmez kosula uymayan deger verirsen eger
            i++;
        }while(i<=5);
         System.out.println("\nEnd Loops");

    }
}
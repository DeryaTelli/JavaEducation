import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Nested Class (ic ice siniflar)
        //-Inner Class (ic siniflar)
        //   -Static
        //   -Non-Static
        //-Local Class (Yerel siniflar)
        //-Anonymous Class (Anonim siniflar)

        // inner class non-static yazdirma islemi
        InnerNonStatic a =new InnerNonStatic();
        InnerNonStatic.Inner b=a.new Inner();
        //a.run();
        //b.run();

        // inner class static yazdirma islemi
        InnerStatic.Inner s=new InnerStatic.Inner(); // ust sinifimiz static olmdigi icin nesne urettik bu sekilde
        //s.run();

        // local class yazdirma islemi
        Local n = new Local();
        //n.run();

        //anonymous class yazdirma islemi
        //Anonymous c =new Anonymous();
       // c.run();

        Anonymous d= new Anonymous(){
            public void run(){
                System.out.println("run method belong anonymous class ");
            }
        };
        // bu mainde olusturdugum class icine yeni method yazamiyorum anonymousun orjinal clasindaki methodlari override edebiliyorum sadece 
        d.run();




    }
}
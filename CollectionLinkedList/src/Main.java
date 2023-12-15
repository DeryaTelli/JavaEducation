import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //LinkedList<E>
        // genen olarak ozellikleri array listle ayni ama array liste gore tercih edilme sebepleri farkli
        // veri silme ve ekleme islemlerinde genellikle kullanilir

        LinkedList list=new LinkedList();
        list.add("Apple");
        list.add("Tomato");
        list.add(null);
        list.add(1,"Watermelon");
        list.forEach(i-> System.out.println(i+", "));

    }
}
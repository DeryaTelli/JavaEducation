import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TreeSet<E>
        //Elemanlar artan bir siralama ile tutulur
        // null  deger kabul etmiyor


        TreeSet tree =new TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(10);
        try{
            tree.add(null);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        tree.forEach(items->System.out.print(items+" "));

    }
}
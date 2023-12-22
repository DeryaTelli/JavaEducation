import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // element() kuyrugun basindaki ogeyi verir , ama onu kuyruktan atmaz
        // offer(E o) mumkunse verilen ogeyi kuyruga ekler
        // peek() kuyrugun basindaki ogeyi verir , ama onu kuyrukan atmaz kuyruk bossa null verir
        // poll() kuyrugun basindaki ogeyi verir ve onu kuyruktan atar kuyruk bossa null verir
        // remove() kuyrugun basindaki ogeyi verir ve onu kuyruktan atar

        Queue q = new LinkedList();
        q.add("Deniz");
        q.add("Derya");
        q.offer("Ali");
        q.offer("Damla");
        System.out.println("remove(): "+q.remove()); // index degeri verilerek silme islemi yapamiyorsun bu queue oldugu icin
        // queuelar giris yapma sirasina bakar ve ona gore silme islemi gerceklestirir
        //first in first out mantigi vardir
        System.out.println("element(): "+q.element()); // kuyrugun en basindaki ismi verir bize deniz silindigi icin deryayi verecektir
        System.out.println("peek(): "+q.peek()); // kuyruk basini verir buda eger eleman yoksa null dondurur
        System.out.println("poll(): "+q.poll());// kuyrugun basini verir ama onu kuyruktan atar
        q.forEach(i->System.out.println(i));




    }
}
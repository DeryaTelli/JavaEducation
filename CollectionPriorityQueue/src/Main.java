import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue();
        q.add(80);
        q.add(20);
        q.add(10);
        q.add(90);
        q.forEach(i->System.out.print(i+","));
        System.out.println("\n-------------------------------");
        while(!q.isEmpty()){
            System.out.println(q.poll()); // ilk elemani yazdirir siradan atarak ilerler 
        }
    }
}
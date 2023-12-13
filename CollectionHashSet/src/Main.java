import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //HashSet<E>


        HashSet h =new HashSet();
        h.add("12 Str ");// my memory has 12
        h.add(12);//collection keep different variable
        h.add(12.0);
        h.add(true);
        h.add(null);

        h.remove(12);//will delete ,I wrote variable
       // h.clear();// will delete all of them
        System.out.println("size:"+h.size());
        System.out.println("contains:"+h.contains(12));// if I wrote variable inside the hashset memory output=true not output=false

        h.forEach(item ->System.out.println(item+"")); //all values of hashset write in the memory like iterator
        System.out.println("--------------------------");
        Iterator iter=h.iterator();//I transfer the hashset values to the iterator
        while (iter.hasNext()){ // iter after,is there next iter
           System.out.println(iter.next());

        }



    }
}
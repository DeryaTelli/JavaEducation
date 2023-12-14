import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //LinkedHashSet<E>
        // girilen deger neyse o sirada cikti veriyor hashset deki gibi kendi sirasi yok
        // ayni elemandan iki tane bulundurmaz  hashsetteki gibi

        LinkedHashSet days=new LinkedHashSet();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");// this variable can not write 2 times in output 
        days.forEach(items->System.out.print(items+","));

    }
}
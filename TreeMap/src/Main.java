import java.util.*;

public class Main {
    public static void main(String[] args) {
        // clear() Map icindeki bulunan butun degerleri siler
        // get (object key) anahtara karsilik gelen objeyi dondurur
        // put(object key,object value):anahtar-deger ikilisini kayit eder
        // treemap indexe yani keye gore siralama yapar senin degerleri ekledigin sirada yapmaz
        TreeMap l = new TreeMap();
        l.put(5,"ali");
        l.put(50,"mehmet");
        l.put(20,"deniz");
        l.put(100,"derya");// index olusturup o indexe degerler verdim ve bunu linkedHashmape ekledim put methodu ile
        Set s=l.entrySet();// sete donusturdum
        Iterator iter=s.iterator();
        while(iter.hasNext()){
            Map.Entry e =(Map.Entry)iter.next();// down casting yaptik
            System.out.println("index: "+e.getKey()+", Name: "+e.getValue());

        }
    }
}
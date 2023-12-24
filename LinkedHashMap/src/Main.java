import java.util.*;

public class Main {
    public static void main(String[] args) {
        // clear() Map icindeki bulunan butun degerleri siler
        // get (object key) anahtara karsilik gelen objeyi dondurur
        // put(object key,object value):anahtar-deger ikilisini kayit eder
        // linkedHashMap eklenilen degerleri verdigim sirada siralar kendine gore siralama mantigi yoktur
        LinkedHashMap l = new LinkedHashMap();
        l.put("Derya",100);
        l.put("Dila",80);
        l.put("Ahmet",70);
        l.put("Deniz",10);// index olusturup o indexe degerler verdim ve bunu linkedHashmape ekledim put methodu ile
        Set s=l.entrySet();// sete donusturdum
        Iterator iter=s.iterator();
        while(iter.hasNext()){
            Map.Entry e =(Map.Entry)iter.next();// down casting yaptik
            System.out.println("Student index: "+e.getKey()+", Note: "+e.getValue());

        }
    }
}
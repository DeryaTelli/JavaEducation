import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //clear() map icinde bulunan butun degerleri siler
        // get (Object key) anahtara karsilik gelen objeyi dondurur
        // put (Object key, Object value): anahtar-deger ikilisini kayit eder
        HashMap b=new HashMap();
        b.put("Turkey","Ankara");
        b.put("Fransa","Paris");
        b.put("Ingiltere","Londra");
        System.out.println(b.get("Turkey")); // yazilan indexin tutugu degeri yazdiracaktir 
        Set s=b.entrySet(); //HashMapi sete ceviriyordur
        Iterator iter=s.iterator();
        while (iter.hasNext()){
            Map.Entry item=(Map.Entry)iter.next(); // down casting yaptik burda parentin childinin methodlarina erismek icin kullanilan yontemdir
            System.out.println("Index: "+item.getKey()+", Capital: "+item.getValue());
        }

    }
}
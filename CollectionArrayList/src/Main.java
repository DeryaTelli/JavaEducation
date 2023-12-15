import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //ArrayList<E>
        // tekrarlanan elemanlara izin veriliyor iki kez yazdiriyor
        //  verileri ekledigim sirada ekliyor bellegine listeler
        //istedigim indexe veri ekleyebiliyorum arraylerle ayni mantikda calisiyorlar onlarin gelismis hali
        // dinamik bir yapi var sonsuza kadar uzayabiliyor

        ArrayList city=new ArrayList();
        city.add("Ankara");
        city.add("Bolu");
        city.add("Mersin");
        city.add("Ankara");
        city.add(0,"Istanbul"); // verilen indexe gore veriyi ekledim
        city.remove(2); // indexe gore eleman silme islemi yapabiliyorum
        city.forEach(i->System.out.print(i+", "));
        Iterator iters = city.iterator();
        while (iters.hasNext()) {
            System.out.print(iters.next()+", ");
        }

    }
}
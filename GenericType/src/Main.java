import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);

        // for kullanabiliyorum suan cunku arraylistimin icindeki elemanlarin typeini biliyorum
        for(Integer items: list){
            System.out.println(items);
        }
        //list.add(true); // bu sekilde yaptigimda hata alicam sadece integer turunde deger ekleyebilirim
        // generic type verdik

       //iki tane generic type aliyor
        HashMap<Integer,String> map=new HashMap<>();
        map.put(8,"dery");
        map.put(2,"aliy");
        map.put(34,"ili");
        // ekrana yazdirmak icin sete cevirip bu sekilde yazdirabilirsin
       // Set<Map.Entry<Integer, String>> set=map.entrySet();
        // for(Map.Entry<Integer,String> items: set){
      //    System.out.println(items);
      //  }

        for(Integer keys: map.keySet()){
            System.out.println("key: "+keys+" Value: "+map.get(keys));
        }
        for(String values: map.values()){
            System.out.println(values);
        }

        //<T>=Integer
        Test<Integer> i=new Test<>(15);
        System.out.println(i.getObj());
        //<T>=String
        Test<String> a=new Test<>("derya");
        System.out.println(a.getObj());
        //<T,U>=String ,Double
        Test2<String,Double> e=new Test2<>("derya telli",26.1);
        System.out.println(e.toString());

        Integer[] arr= {20,30,40,50};
        Double[] dobArr={2.1,3.2,4.3};
        Character[] chArr={'a','b','c','d'};
        genericMethod(arr);
        
        genericMethod(dobArr);
        genericMethod(chArr);

    }

    public static  <E> void genericMethod(E[] arr){
        for(E items: arr){
            System.out.print(items+",");
        }
    }
}
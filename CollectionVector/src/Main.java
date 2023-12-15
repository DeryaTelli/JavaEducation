import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Vector
        //var sayilan olarak bir vektor olusturdugumda bunun boyutu 10 oluyor
        // sekronize bir koleksiyon yapisi

        Vector v =new Vector();
        v.add("Apple");
        v.add("Strawberry");
        v.add("Watermelon");
        v.add("Melon");
        v.add("Cherry");
        v.add("Pear");
        v.add("Cherry");
        v.add("Pear");
        v.add("Cherry");
        v.add("Pear");
        v.add("Cherry");
        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());// ilk olusturudugun vektorun kapasitesi 10 dur
       // 10 kapasiteyi gectigim gibi kapasite 10ar 10ar artacaktir 



    }
}
public class Main {
    public static void main(String[] args) {

    char [] str={'K','O','D','L','A','M','A'};
    String text=new String(str); // tek bir metine ceviriyor
    System.out.println(text);

    String m1=" TIME";
    String m = "KODLAMA HELLO"; // Java string icin yukaridaki islemleri yapiyor yani string charlardan olusuyor
    System.out.println(m.length());//girilen karakterin sayisini dondurucek
    System.out.println(m.concat(m1));// string birlestirme
    System.out.println(m+m1); // string birlestirme
    System.out.println(m.indexOf('L'));//karakterin konumunu verir
    System.out.println(m.charAt(2));// index 2 deki harfi verir bize\
    System.out.println(m.contains("LAMA")); // LAMA verilen string degerinde geciyor mu diye bakar varsa true dondurur
    System.out.println(m.endsWith("M")); // Son harfi m ile mi bitiyor kontrol eder m ile bitiyorsa true doner
    System.out.println(m.replace("HELLO", "TIME")); // yer degisimi yapar
    System.out.println(m.toLowerCase()); // kucuk harflerle yazacaktir

    }
}
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
/*
kod sonradan degisti static komutlarini sildim defterde orjinal koda bakarsin
     Worker w1= new Worker();
    // w1.login();
     Academician a= new Academician();
   //  a.login(); // worker clasinin methodu olmasina ragmen academician classibu methoda eristi cunku worker clasinin alt methodu
     Officer o = new Officer();
    // o.login(); // worker clasinin alt clasi oldugu icin methoda erisim saglayabildi
     //Academician.login(); // giris methodunu static yaptim ve worker calsinin alt claslari da bu degiskeni bu sekilde kullanmasina erisim sagladim
     System.out.println(Academician.login());
     System.out.println(Officer.login());
   */
       /*
        Worker w= new Worker();
        // w.LessonJoin(); assistance in methodu ve academician nin alt classi o yuzden worker bu methoda erisemez
        // kalitim yukaridan asagiya dogurudur
        Officer o = new Officer();
       // o.LessonJoin(); officer classi bu methoda erisemez cunku alt clasi degilbu method academicianin alt classidir yukaridaki ile ayni hatayi verdi
        Assistant a=new Assistant();
        a.LessonJoin();
        Teacher t= new Teacher();
        t.LessonJoin(); */

       Worker w= new Worker("Telli", "2002der@gmail.com", "05462272186");
      // Academician ac = new Academician("Derya Telli", "2002der@gmail.com", "05462272186","Engineer","Lab","OPP");
       //System.out.println(ac.getE_posta()); // protected kullandigim ust class yani worker clasinin degiskenlerine alt classlardan da erisim saglayabilirim
       Officer of=new Officer("Alara", "der@gmail.com", "05462272186","Engineer","4");
       Teacher te=new Teacher("Mehmet", "der@gmail.com", "05462272186","Engineer","Lab","OPP","Doctorate");
       /*
       System.out.println(of.login());// ust clasin obur alt classi bunda usten method cagrilip bir ekleme cikarma yapilmadigi icin ust clssin merhodunu kullaniyor
       System.out.println( ac.login());// super methodu ile ust clastan methodu cagirdik ve ekleme yaptik
       System.out.println(  te.login()); // super ile ust clastan methodu cagirdik ve ekleme yaptik
       System.out.println(w.login()); // ust classin orjinal methodunun cagrilmasi
     /*
       //polimorphisim yasasi calisan en ust class oldugu icin onu referans alarak alt classlarin ozelliklerini gosteren
       // nesne olusturmamiza olanak tanir
       Worker c = new Academician("Di", "2002der@gmail.com", "05462272186","Engineer","Lab","OPP");
       System.out.println(c.login());
     /*
       Worker c = new Academician("Di", "2002der@gmail.com", "05462272186","Engineer","Lab","OPP");


       Worker[] loginList={ac,of,te,w,c}; // dizideki nesnelerin login methodu ciktisini yazdiracaktir bize
       Worker.list(loginList);// worker de olusturulan static methodun cagrildigi koddur
      */

       // Academician sinifini abstrack yaptiktan sonra academician hata verir cunku
       // abstrak olan bir class nesne olusturamaz kendini soyutlar
       //Academician ac = new Academician("Derya Telli", "2002der@gmail.com", "05462272186","Engineer","Lab","OPP");

        Assistant a = new Assistant("Derya Telli", "2002der@gmail.com", "05462272186","Engineer","Lab","OPP","Prof");
         a.lessonJoin(10);




    }


}
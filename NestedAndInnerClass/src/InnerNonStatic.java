public class InnerNonStatic {
    private int a=10;

    public class Inner{
        int a=1;

        public void run(){
            System.out.println(a);
             System.out.println(this.a);
            System.out.println(InnerNonStatic.this.a);//   InnerNonStatic Classndaki degeri alir
        }
    }
    public class Inner2{
        int c=3;
    }

    public void run(){
        System.out.println(a);
        System.out.println(this.a);
       // System.out.println(Inner.this.a); bunu bu sekilde yazdiramiyorum yazdirmak istersem inner class icin obeject olusturmaliyim
        Inner i = new Inner();
        System.out.println(i.a); //inner clasindaki degeri alir

    }
}

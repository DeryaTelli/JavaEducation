public class InnerStatic {
    private int a =10;
    private static int b=2;

    public static class Inner{
        int a =1;
        public void run(){
            System.out.println(a);
            System.out.println(this.a);
           // System.out.println(InnerStatic.this.a);
            // (InnerStatic.this.a) bunun degerini busekilde alamiyorum cunku alt sinifim static
            //bu static sinif oldugu icin bu inner classi yani alt classdan nesne uretmiyecegim
            // nesne uretmedigim icin ust sinifina erisemiyorum
            System.out.println(b); // ust sinifimdaki b degerine ulasmam icin o degerinde static olmasi gerekiyor

        }

    }
}

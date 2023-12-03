public class Car {
     private int enginePower, model; // disaridan erisim yok sadece bu class icinde erisim var
     public int speed;// disaridan erisim var
     protected String colour;// clasin bulundugu bu sayfa ve bu class da erisimi vardir

     Car(){
        this.model=2020;
        this.enginePower=300;
        this.speed=120;
        this.colour="red";
     }
     // kod public void yapilinca main classdan cagrilabiliyor eger private yaparsak ne olur
    /* public void print(){
          System.out.println(model);
     }*/

    private void print(){ // bunu okumak icin baska bir method kullandim
        // ayni class icinde  public run methodu olusturup private print methodunu cagirdim
        // cunku main classimda print methodunu cagiramiyordum cunku private
        // ama public run methodu olusturup private print methodunu icinde cagirip run methodunu main classindan cagirabilirim 
        System.out.println(model);
    }
    public void run(){
        print();
    }

}

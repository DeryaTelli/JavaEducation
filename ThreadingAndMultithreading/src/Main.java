public class Main {
    public static void main(String[] args) {
        //thread bir seyi ayni anda yapmak istedigimi zaman tercih ediyoruz
        // thread bir sinif
        // Thread(new Runnable())


        Processes p1=new Processes("Deraa");
        Thread t1=new Thread(p1);

        Processes p2=new Processes("Emel");
        Thread t2=new Thread(p2);
        t1.start(); // runnable run methodunu calistiricaktir
        t2.start();


    }
}
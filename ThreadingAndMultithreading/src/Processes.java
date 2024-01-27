public class Processes  implements Runnable{
    String name;
    public Processes(String name){
        this.name=name;
        System.out.println(name+ " Process was created");
    }
    @Override
    public void run() {
        try {
            for(int i=5; i>0; i--){
             System.out.println(this.name +" : "+ i);

                 Thread.sleep(1000);// sleep static bir method
                // surecin milisaniyede yapilma suresini ayarliyor

             }
        } catch (Exception e) {
            System.out.println(this.name+ "Error");
        }
        System.out.println(name + " process is over");
    }
}

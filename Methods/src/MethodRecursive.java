public class MethodRecursive {
    static int f(int x){
        int collection =0;
        for(int i=1; i<=x ; i++){
            collection+=i;
        }
        return collection;
    }
    static int r(int x){
        if(x==1){
            return 1;
        }
        return x+ f(x-1); // method icinde method cagirdik buna recursive method denir
    }
    public static void main(String[] args){
        // özyinelemeli
        // f(1)=1
        // f(2)=f(1)+2
        // f(3)=f(2)+3
        // ...
        //...
        //f(6)=f(5)+6
        System.out.println(r(10));

    }




}

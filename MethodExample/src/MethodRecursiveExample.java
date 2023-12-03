public class MethodRecursiveExample {

    static int fibo(int x){
        if(x==1 || x==2)
            return 1;
        return fibo(x-2)+fibo(x-1);

    }

    public static void main(String[] args){
        // 1 , 1 ,2 ,3 ,5 ,8
        // f(6)=f(5)+f(4)
        // f(4)=f(3)+f(2)
        // f(3)=f(2)+f(1)
        System.out.println(fibo(  3));
    }

}

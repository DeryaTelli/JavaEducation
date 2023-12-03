public class Throw {
    public static void main(String[] args ){
        int a=0;
        if(a==0){
            System.out.println("Divisor can not be equal zero");
            throw new ArithmeticException("Exception");
        }
        System.out.println("Code next");
    }
}

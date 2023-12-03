public class ReturnMethodProject2 {
    static int power (int base , int uper){ // create method
        int result=1;
        for (int i=1; i<=uper; i++){
            result*=base;
        }
        return result;
    }
    public  static void main(String[] args){
        int a= power(10,2);
        System.out.println(a);

    }
}

public class VoidMethodProject {
    public static void main(String[] args) {
      // f(x)= (x+2)*6;
       f(4);  // call the method
        power(3,2); // call the method

    }
    static void f(int x){ // create method
        int result=(x+2)*6;
        System.out.println(result);
    }
    static void power (int base , int uper){ // create method
        int result=1;
        for (int i=1; i<=uper; i++){
            result*=base;
        }
        System.out.println(base+"^"+uper+":"+result);
    }
}
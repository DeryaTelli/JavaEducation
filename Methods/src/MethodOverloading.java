public class MethodOverloading {
    static int add(int a,int b){ // java bunu su sekilde goruyor add(int, int )
        System.out.println("Method 1");
        return a+b;
    }
    static int add(int a,int b,int c){// add(int,int,int)
        System.out.println("Method 2");
        return a+b+c;
    }
    static double add(int a,int b,double c){// add(int,int,double)
        System.out.println("Method 3");
        return a+b+c;
    }

    static double add(int a,double b,int c){// add(int,double,int)
        System.out.println("Method 4");
        return a+b+c;
    }
    public static void main(String[] args){

        System.out.println(add(1,2));
        System.out.println(add(1,2,5));
        System.out.println(add(1,2,7.0));
        System.out.println(add(1,9.0 ,4));






    }
}

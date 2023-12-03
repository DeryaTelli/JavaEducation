public class IfandElseBlocks {
    public static void main(String[] args) {
        int a = 50;
        int b= 20;
        int c= 30;
        if( a==b ){
            System.out.println("a and b numbers is equal");

        }else{
            System.out.println("a and b number is not equal");
        }

        if(b==c){
            System.out.println("b and c is equal ");
        }else if(a>c){
            System.out.println("a is bigger than c");
        }else{
            System.out.println("b and c is not equal ");
        }

        if((a<c)&&(a<b)){
            System.out.println(" a is the smallest");
        }else if (c<a && c<b){
            System.out.println("c is the smallest");
        }else {
            System.out.println("b is the smallest");
        }

    }
}
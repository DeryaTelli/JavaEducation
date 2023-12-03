public class LogicalOperators {

        public static void main(String[] args){
            int a =10 , b=20 , c=5 ,d=50;
            boolean state= a>b;
            boolean state1=d<c;
            boolean result = (state && state1);
            System.out.println(result);
            boolean result1=(a<b) && (d>c);
            System.out.println(result1);
            boolean result3= (state1 || state);
            System.out.println(result3);
            boolean result4= !(state1 || state);
            System.out.println(result4);



        }
        
}

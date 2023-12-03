public class Operators {

        public static void main(String[] args) {

            int a = 10;
            int b=5;
            int c = a+b;
            int c1=a-b;
            int c2=a*b;
            int c3 = a/b;
            int c4= a % b;
            System.out.println("Addition:"+c);
            System.out.println("Subtraction"+c1);
            System.out.println("Multiplication:"+c2);
            System.out.println("Division:"+c3);
            System.out.println("Mod:"+c4);
            c++;
            c4--;
            System.out.println("Increase Addition:"+c);
            System.out.println("Decrease Mod:"+c4);


            int number1= 10;
            int number2 =5;
            boolean condition= (number2==number1);
            System.out.println(condition);
            boolean condition1= (number2>number1);
            System.out.println(condition1);
            boolean condition2= (number1/number2)==2 ;
            System.out.println(condition2);
            boolean condition3= (number1%number2)==0 ;
            System.out.println(condition3);

            boolean d1=(number1>number2);
            boolean d2=(number2<number1);
            boolean result= d1 && d2;
            System.out.println(result);

            String result1 = (d1) ? "True :)" : "False :(";
            System.out.println(result1);

            number1=number2; // I chanced the value of number1
            System.out.println(number1);
            number1+=2;
            System.out.println(number1);

        }

}
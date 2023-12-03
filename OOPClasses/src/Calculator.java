public class Calculator {
    public int number1;
    public int number2;

    Calculator( int number1 , int number2){
        this.number1=number1;
        this.number2=number2;
    }

    public int collection(){
        return this.number1+this.number2;
    }
    public int extraction(){
        return this.number2-this.number1;
    }
    public int  divide() {
        return this.number1/this.number2;
    }
    public int multiple(){
        return this.number1*this.number2;
    }

}

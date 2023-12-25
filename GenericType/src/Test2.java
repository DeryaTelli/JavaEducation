public class Test2 <T,U>{
    // t ve u yerine mainde ne yazarsam onlar bu classin generic type olacaktir
    T obj1;
    U obj2;
    Test2(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public String toString(){
        return "object1: "+this.obj1+" object2: "+this.obj2;
    }
}

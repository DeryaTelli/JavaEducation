public class Test <T>{
    // t turunde bir sinif olusturdum bu sinifinin generic type t artik
    // yani mainde ben t yerine integer yazarsamt artik integer olacaktir
    // yada t yerine string verirsem t string olucaktir
    T obj; // t turunde object olustudum
    Test(T obj){ //bunun constructorunu olusturdum
       this.obj=obj;
    }
    public T getObj(){ // get methodunu yazdim
        return this.obj;
    }
}

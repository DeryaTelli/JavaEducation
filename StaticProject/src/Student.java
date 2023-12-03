public class Student {
    public String name;
    public int id,point;

   // bu komple sinifa ait bir degisken o yuzden alt tarafda this. yerine Student. diye tanimladik
    private static int counter=0; ; // butun nesnelerden bagimsiz bir degisken
    Student(String name, int id ,int point){
        this.name=name;
        this.id=id;
        this.point=point;
        Student.counter++;
    }
    public void quit(){
        Student.counter--;
    }
    public static int howMuchStudent(){
        return Student.counter;
    }
    public static double calculate(int[] arr){
        double overall=0;
        for(int i=0 ; i< arr.length;i++){
            overall+=arr[i];
        }
        return overall/arr.length;

    }

}

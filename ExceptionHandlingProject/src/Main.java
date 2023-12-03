public class Main {
    public static void main(String[] args) { // parantezden sonra throws StudentException { kullanirsan try catch kullanmana gerek kalmayacak
        try{ // try catch kullanmadan da hatayi yakalaya bilirsin
            Student s = Student.find("12");
        }catch (StudentException e){
            e.printStackTrace();
        }
    }
}
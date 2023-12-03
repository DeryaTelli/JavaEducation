public class StudentException extends Exception {
    // exception clasinin alt classi olacaktir
    // kendi hata yakalama kodumuzu yazicagiz
    public StudentException(String text){
        super(text);
    }
}

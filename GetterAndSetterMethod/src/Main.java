public class Main {
    public static void main(String[] args) {
       Book b1=new Book("Harry Potter","Rowling", "Kodlama",400);
       b1.setNumberOfPage(-500);
       System.out.println(b1.getNumberOfPage());

       Book b2 = new Book("Lord of the Rings", "Peter","Kodlama", 500);
       b2.setName("Lord of the dream");
       System.out.println(b2.getName());

    }
}
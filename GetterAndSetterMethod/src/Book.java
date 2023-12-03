public class Book {
    private String name, author,publisher;
    private int numberOfPage;
    Book(String name , String author,String publisher,int numberOfPage){
        this.name=name;
        this.author=author;
        this.publisher=publisher;

    }

   public int getNumberOfPage(){ // olusturdugum classta private olan degiskeni okumasiicin olusturdugum get methodu
        return this.numberOfPage;
   }
   public void setNumberOfPage(int size){// olusturduum classta private olan degiskenimi degistirmek olusturdugum set methodu
     if(size<1) {
         System.out.println("Page number can't be negatif");
          this.numberOfPage = 10;
     } else {
         this.numberOfPage = size;
     }
   }
   public String getName(){
        return this.name;
   }

  public void setName(String newName){
        this.name=newName;
  }
  public String getAuthor(){
        return this.author;
  }
  public void setAuthor(String newAuthor){
        this.author=newAuthor;
  }
  public String getPublisher(){
        return this.publisher;
  }
  public void setPublisher(String newPublisher){
        this.publisher=newPublisher;
  }
}


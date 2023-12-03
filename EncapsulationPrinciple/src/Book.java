public class Book {
    public String name, author,publisher;
    private int numberOfPage; // numberofpaga ifadesini sarmaladik
    //numberofpage ile hic birseyi iliskilendirmeden methodlar ve consturactor ile sarmaladik
   //sarmallama ilkesi bir sinifa ait niteliklerin yani degiskenlerin degerlerinin ancak o sinifin icine kodlanmis methodlar tarafindan degistirilebilmesi ve okunablmesi ilkesidir
    Book(String name , String author,String publisher,int numberOfPage){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        if (numberOfPage<1){ // number of page degerini -li deger girilmesini engelledik
            this.numberOfPage=10;
        }else{
            this.numberOfPage=numberOfPage;
        }
    }

    public void pageSize(){
        System.out.println(numberOfPage); // numberofpage private yaptigimdan dolayi  okunmasi icn burda method olusturdk
    }
}

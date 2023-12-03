public class Worker {
     protected String nameSurName,e_posta,telNo;
     public Worker(String nameSurName,String e_posta,String telNo){
         this.nameSurName=nameSurName;
         this.e_posta=e_posta;
         this.telNo=telNo;
     }
/*
    public void login(){ // bu methodun ayinisini academisin alt classinda da yapicaz sadece println islemis farkli olucak
         // buislem academician clasi ve alt classlarinda gecerli olacaktir ama worker clasi ve diger classlarinda workerdaki method calisacaktir
        System.out.println(this.nameSurName+ " loged in ");
    }
    // yukaridaki methodun aynisi superle bu methodu cagiriyor alt classlar
  */
    public String login(){

         return this.nameSurName+" logged in ";
    }

    public static void  list(Worker[] loggIn){
      for(Worker value: loggIn){
          System.out.println(value.login());
      }

    }
    public void setTelNo(String telNo) { // olusturdugum bu getter ve setter methodlarina alt classlardan da ulasabilecegim
        this.telNo = telNo;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public void setNameSurName(String nameSurName) {
        this.nameSurName = nameSurName;
    }

    public String getNameSurName() {
        return nameSurName;
    }

    public String getE_posta() {
        return e_posta;
    }

    public String getTelNo() {
        return telNo;
    }


}

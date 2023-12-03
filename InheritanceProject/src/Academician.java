public abstract class Academician extends Worker{
    String departmentA, duty;
    String lessons;

    Academician( String nameSurName,String e_posta,String telNo,String departmentA, String duty, String lessons){
        super(nameSurName,e_posta,telNo);
        this.departmentA=departmentA;
        this.duty=duty;
        this.lessons=lessons;
    }

    public abstract void lessonJoin(int lessonTime); // abstract bir method olusturduktan sonra academician clasinin alt claslarinda hata alicam
    // bunu duzeltmemim yolu ust sinif olan academician clasindan olan bu methodu yazmak zorunda
    //{
       // System.out.println("Lesson was joined.   !");
    //}
/*
    public void login(){
        // bumethod sadecebu classin ve bunun alt classlarinda calisacaktir
        // ust method da kendi methodunu calistiracaktir
        System.out.println(this.nameSurName+ " loged in from A door! ");
    }
    // yukaridaki methodlar ayni islemi goruyor amabu bir overiding islemi degil  super ust methoddanbu methodun aynisini getiriyor ve method sonuna ekleme yapiyor
   */
    public String login(){
        return super.login()+"from A door";
    }
        public String getLessons() {
        return lessons;
    }

    public void setDepartmentA(String departmentA) {
        this.departmentA = departmentA;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getDepartmentA() {
        return departmentA;
    }

    public String getDuty() {
        return duty;
    }



}

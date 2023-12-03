public class Academician implements IWorker{
   private   String nameSurname, departmen, duty;

    public Academician(String nameSurname,String duty, String departmen) {
        this.nameSurname = nameSurname;
        this.duty=duty;
        this.departmen=departmen;
       // System.out.println(this.school);// interface clasindan gelen bir degerve final hic bir sekilde degistirilemez
    }

    @Override
    public void login() {
        System.out.println("has been loged");

    }

    @Override
    public void quit() {
        System.out.println("has been quited");
 
    }

    @Override
    public boolean meal(int hour) {
        System.out.println("was eaten");
        return true;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }


}

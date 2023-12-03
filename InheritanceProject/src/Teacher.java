public class Teacher extends Academician{
    String title;

    public Teacher(String nameSurName, String e_posta, String telNo, String departmentA, String duty, String lessons, String title) {
        super(nameSurName, e_posta, telNo, departmentA, duty, lessons);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String login(){
        return this.title+" " +super.login();
    }

    @Override
    public void lessonJoin(int lessonTime) {
        System.out.println(getTitle()+ " "+getNameSurName()+ " "+getLessons()+"Hour:"+lessonTime+"He joined the lesson");

    }
}

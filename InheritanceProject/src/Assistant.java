public class Assistant extends Academician{
     protected String degree;

    public Assistant(String nameSurName, String e_posta, String telNo, String departmentA, String duty, String lessons, String degree) {
        super(nameSurName, e_posta, telNo, departmentA, duty, lessons);
        // Worker clasinin ve Academician clasinin degiskenlerini aldi
        // cunku worker clasinin alt clasi academician classi ve academician clasinin alt classi ise Assistant classi
        this.degree = degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public void lessonJoin(int lessonTime) {
       System.out.println(getNameSurName()+ " "+getLessons()+"hour:"+lessonTime+"He joined like the Assistant");

    }
}

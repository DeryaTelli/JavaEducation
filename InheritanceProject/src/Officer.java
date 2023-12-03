public class Officer extends Worker{
    String departmentO ,shift;
    public Officer(String nameSurName, String e_posta, String telNo, String departmentO,String shift) {
        super(nameSurName, e_posta, telNo);
        this.departmentO = departmentO;
        this.shift = shift;
    }

}

public class SecurityGuard extends Officer{
    protected String document;

    public SecurityGuard(String nameSurName, String e_posta, String telNo, String departmentO, String shift, String document) {
        super(nameSurName, e_posta, telNo, departmentO, shift);
        // bu class Worker clasinin ve officer clasinin alt classidr
        this.document = document;
    }
}

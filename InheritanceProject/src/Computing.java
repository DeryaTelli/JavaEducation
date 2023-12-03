public class Computing extends Officer{
    String dutyC;

    public Computing(String nameSurName, String e_posta, String telNo, String departmentO, String shift, String dutyC) {
        super(nameSurName, e_posta, telNo, departmentO, shift);
        // bu class Worker clasinin ve Officer clasinin alt clasidir
        this.dutyC = dutyC;
    }
}

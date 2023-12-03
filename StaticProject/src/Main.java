public class Main {
    public static void main(String[] args) {
     System.out.println("Online Student: "+Student.howMuchStudent()); // direkt nesne olusturmadan olusturdugum methoda eristim
     Student s1 = new Student("Derya",220,90);
     Student s2= new Student("Ali", 221,100);
     Student s3= new Student("Ahmet", 223,60);
     System.out.println("Online Student: "+Student.howMuchStudent()); // direkt nesne olusturmadan olusturdugum methoda eristim
     s1.quit(); // s1 ogrenci cevrim disi olucak dersten cikicak
     System.out.println("Online Student: "+Student.howMuchStudent()); // direkt nesne olusturmadan olusturdugum methoda eristim

        int[] points = new int[3];
        points[0]=s1.point;
        points[1]=s2.point;
        points[2]=s3.point;
        Student.calculate(points); // arr olarak points dizisini alicak
        System.out.println("Points: "+Student.calculate(points));

    }
}
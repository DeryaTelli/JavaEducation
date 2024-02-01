import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/car?user=root&password=26112");
        // kullandigim databasein adresini veriyorum ve baglanti sagliyorum bu sekilde
        Statement st =c.createStatement();
        //add data
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of car: ");
        String name=scan.nextLine();
        System.out.println("Enter speed of car: ");
        int speed=scan.nextInt();
        /*
        String query="INSERT INTO cars(cars_name,cars_speed) VALUES ('"+ name +"',"+ speed +")"; // veri eklemek icin kullanilan sorgudur
        int result=st.executeUpdate(query);
        System.out.println(result);
        st.close(); // her islem sonunda kapatmayi unutma
        */
        //icindeki sorgu sirasi veri tabaninda verdigin degerlerle ayni sirada olmali yoksa hata alirisin
        String q="INSERT INTO cars(cars_name,cars_speed)VALUES(?,?)";
        PreparedStatement pt=c.prepareStatement(q);
        pt.setString(1,name);
        // sorguda yazdigim ? isareti yerini ayarliyor
        // onlarin typelaria gore veriyoruz methodu ilk sayi degistirmek istedigin ? indexini ifade ediyor digeri ise vermek istedigin degeri
        pt.setInt(2,speed);
        pt.executeUpdate(); // ekleme ve cikartma islemleri yapmada kullanilir
        pt.close();

        // get data
        // statement olusturduk yukarida onu kullandik
        ResultSet rs=st.executeQuery("SELECT * FROM cars");
        while(rs.next()){
            System.out.println(rs.getInt("cars_id")+"."+rs.getString("cars_name")+" - "+rs.getInt("cars_speed"));
        }
        st.close();





    }
}
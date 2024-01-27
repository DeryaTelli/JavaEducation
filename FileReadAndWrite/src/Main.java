import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //creating
        File file =new File("kod.txt");
        if(!file.exists()){
            file.createNewFile(); // dosyayi olusturduk
            // hata alabilecegimiz icin throws ekledik classa

        }
        //writing
        String val="Coding Time";
        FileWriter fileW=new FileWriter(file,false);
        BufferedWriter bw= new BufferedWriter(fileW); //islem hizlandiran siniftir
        bw.write(val);
        bw.write("\nJAVA lesson");
        bw.close();
        // buffer ile yaptigim islemi bitirmek icn kapatmaliyim belekte yer kaplamasin diye
        //reading
        FileReader fileR=new FileReader(file);
        String line;
        BufferedReader br=new BufferedReader(fileR);
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();



    }
}
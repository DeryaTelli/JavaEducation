public class ForExample2 {
    public static void main(String[] args){
        // Armstrong sayilari bulan program
        // 153= (1*1*1)+(5*5*5)+(3+3+3)
        int temp, ones , tens , hundreds , collection;
        for(int i=100; i<=999; i++){
            temp=i; // i yi degistirseydik eger dongu degisecek ve kod bozulacakti
            // bu yuzden i gorevini tempe atadik ve i ye dokunmadik tum islemleri temp uzerinden hallettik

            ones=temp%10; // birler onlar ve yuzler basamagini bulmak icin bu sekilde bir sey yaptik
            temp/=10;
            tens=temp%10;
            temp/=10;
            hundreds=temp%10;
            temp/=10;

            collection = (ones*ones*ones)+(tens*tens*tens)+(hundreds*hundreds*hundreds);
             if(collection==i){
                 System.out.println(i+ "is Armstrong number ");
             }
        }

    }
}

public class MultidimensionalArrayProject {
    public static void main(String[] args){
        int [] [] table = new int[][]{
                {1,75,10},{2,87,13},{3,95,15},{4,103,18}
        };
        for (int i=0 ; i<table.length ; i++){
            for (int j=0; j<table[0].length; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println(); // i de deger degisinde alt satira gecmesi icin konuldu
        }
        System.out.println("----------------------");
        for(int[] row: table){
            for (int value: row){
                System.out.print(value+" ");
            }
            System.out.println(); // row degistiginde alt satira geciyor bu islem
        }

        int [][] table2=new int [4][3]; // ici bos bir dizi olsturduk alt tarafda dizinin icini doldurmaya basladik
        table2[0][0]=1;
        table2[0][1]=75;
        table2[0][2]=10;
        System.out.println(table2[1][2]); // 0 verdi cunku bu degeri henuz tanimlamamistik bos dizi olusturduk
        System.out.println(table2[0][2]); // degeri 10 donecektir deger verdik cunku
    }
}

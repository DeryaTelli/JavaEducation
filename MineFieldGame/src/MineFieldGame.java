import java.util.Random;
import java.util.Scanner;

public class MineFieldGame {

       int rowNumber , colNumber,size;
       int[][]map;
       int[][]board;
       boolean game=true;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        MineFieldGame(int rowNumber, int colNumber){
            this.rowNumber=rowNumber; // bu degiskenler olusturuldugunda multi arraylarim otomatik olusturulucak
            this.colNumber=colNumber;
           this.map =new int[rowNumber][colNumber];
           this.board=new int[rowNumber][colNumber];
           this.size=rowNumber*colNumber;
        }
        public void run(){ // void bir method disardan parametre almayacagim
            int success=0;
            prepareGame();
            print(map);
            System.out.println("Game Started !!!");
            while (game){
                print(board);
                System.out.print("Row:");
                int row = scan.nextInt();
                System.out.print("Column:");
                int col = scan.nextInt();
                if(row<0 || row>=rowNumber-1){
                    System.out.println("Invalid Coordinate,enter valid row value");
                    continue;
                }
                if(col<0 || col>=colNumber-1){
                    System.out.println("Invalid Coordinate, enter valid column value");
                    continue;
                }
                if(map[row][col]!=-1){
                   checkmine(row,col) ;
                   success++;
                   if(success==(size-(size/4))){
                       System.out.println("Successful, You don't selected mine :)");
                       break;
                   }
                }else{
                    game=false;
                    System.out.println("Game Over !!!");
                }

            }
        }
        public void checkmine(int r , int c){
            if(map[r][c]==0){
                if((c< colNumber-1)&&(map[r][c+1]==-1)){
                    board[r][c]++;
                }
                if((r<rowNumber-1)&&(map[r+1][c]==-1)){
                    board[r][c]++;
                }
                if((r>0) &&(map[r-1][c]==-1)){
                    board[r][c]++;
                }
                if((c>0)&&(map[r][c-1]==-1)){
                    board[r][c]++;
                }
                if(board[r][c]==0){
                    board[r][c]=-2;

                }
            }

        }
        public void prepareGame(){
            int randRow , randCol , count=0; // create random row and col
            while(count!=(size/4)){
                // ilk  for dongudu kullanmistik onu kaldirma nedenimiz bizim size 8 ise 2 kez mayin verecekti ama
                // 1 kez verdigi mayin bloguna tekrar mayin vermicekti for dongusude 2 kez mayin verdi farz edecekti bu hatanin onune gecmek icn while dongusune gectik
              randRow=rand.nextInt(rowNumber);
              randCol=rand.nextInt(colNumber);
              if(map[randRow][randCol] != -1){ // mine == -1
                  map[randRow][randCol]=-1;
                  count++;
              }

            }
        }

        public void print(int[][] arr){
            for(int i=0; i<arr.length;i++){
                for(int j=0; j<arr[i].length;j++){
                   if(arr[i][j] >=0)
                       System.out.print(" ");
                    System.out.print(arr[i][j]+",");
                }
                System.out.println();// her row bitince alt satira gecmesi icin gereken komut

            }
        }




}
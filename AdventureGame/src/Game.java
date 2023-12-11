import java.util.Scanner;

public class Game {
    Player player;
    Scanner input=new Scanner(System.in);
    Location place;
    public void login(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome the Adventure Game <3");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print("Enter your user name:");
        String playerName=input.nextLine();
        player=new Player(playerName);
        player.selectChar();
        start();
    }
    public void start(){
     while(true){
         System.out.println("----------------------------------------------------------------------------------------");
         System.out.println("Please selected the place to start game;");
         System.out.println(
                 "1- Safe house  (It's safe here where aren't monsters!!) " +
                         "\n2- Cave        (Be careful, zombie may appear!!)"  +
                         "\n3- Forest      (Be careful, vampire may appear!!) " +
                         "\n4- River       (Be careful bear may appear!!) " +
                         "\n5- Store       (May buy the weapon or armor from here!!)");
         System.out.print("Please select you want to go place:");
         int locId=input.nextInt();
         while(locId<1 || locId>5){
             System.out.print("Plese select the valid place: ");
             locId=input.nextInt();
         }
         switch (locId){
             case 1:
                 place=new SafeHouse(player);
                 break;
             case 2:
                 place=new Cave(player);
                 break;

             case 3:
                 place=new Forest(player);
                 break;
             case 4:
                 place=new River(player);
                 break;
             case 5:
                 place=new ToolStore(player);
                 break;
             default:
                 place=new SafeHouse(player);
                 break;
         }
         if(place.getClass().getName().equals("SafeHouse")){
             if(player.getInventory().isWater() && player.getInventory().isFirewood() && player.getInventory().isFood()){
                 System.out.println("Congratulations, You collect all of award");
                 System.out.println("!!! Victory !!!");
                 break;
             }
         }
         if(!place.getLocation()){
             System.out.println("Game Over :( ");
             break;
         }

     }
    }
    }



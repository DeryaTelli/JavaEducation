import java.util.Scanner;

public class Player {
    private int damage, healthy,money, realHealty;
    private String name, cName;
    private Inventory inventory;
    Scanner input=new Scanner(System.in);
    Player(String name){
        setName(name);
        this.inventory=new Inventory();
    }

    public void selectChar(){
       switch (charMenu()){
           // samurai selected
           case 1:
               initPlayer("Samurai",5,21,15);
               break;
            // archer selected
           case 2:
               initPlayer("Archer",7,18,20);
               break;
            // knight selected
           case 3:
               initPlayer("Knight",8,24,5);
               break;
           default:
               initPlayer("Samurai",5,21,15);
               break;
       }
        System.out.println("Character: "+getcName()+" Damage: "+getDamage()+" Healthy: "+getHealthy()+" Money: "+getMoney());
    }
    public int charMenu(){
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Please select the character first;");
        System.out.println("1- Samurai\tDamage: 5\tHealthy: 21 \tMoney: 15");
        System.out.println("2- Archer\tDamage: 7\tHealthy: 18 \tMoney: 20");
        System.out.println("3- Knight\tDamage: 8\tHealthy: 24 \tMoney: 5");
        System.out.print("Your character of select:");
        int charId=input.nextInt();
        while(charId<1 || charId>3){
            System.out.print("Plese select the valid character: ");
            charId=input.nextInt();
        }

        return charId;
    }

    public int getTotalDamage(){
        return this.getDamage()+this.getInventory().getDamage();
    }
    public void initPlayer(String cName, int damage , int healthy , int money){
        setcName(cName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setRealHealty(healthy);
    }
    public String toString(){
        return "Character: "+getcName()+"Damage: "+getDamage()+"Healthy: "+getHealthy()+"Money: "+getMoney();
    }

    public int getRealHealty() {
        return realHealty;
    }

    public void setRealHealty(int realHealty) {
        this.realHealty = realHealty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getcName(){
        return cName;
    }
    public void setcName(String cName){
        this.cName=cName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

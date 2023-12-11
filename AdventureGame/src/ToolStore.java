import java.util.Scanner;

public class ToolStore extends NormalLocation{

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }
    @Override
    public  boolean getLocation(){
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome Tool Store");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Current money:"+player.getMoney());
        System.out.println("Please select te tool you need;");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("3- Quit");
        System.out.print("Your selecting:");
        int toolId=input.nextInt();
        int selItemId;
        switch (toolId){
            case 1:
                selItemId=weaponMenu();
                buyWeapon(selItemId);
                break;
            case 2:
                selItemId= armorMenu();
                buyArmor(selItemId);
                break;
            default:
                break;
        }
        while(toolId<1 || toolId>3){
            System.out.print("Plese select the valid tool: ");
            toolId=input.nextInt();
        }


        return true;
    }
    public int weaponMenu(){
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Select weapon to fight monsters: ");
        System.out.println("1- Gun  \tDamage: 2 \tMoney: 25");
        System.out.println("2- Sword \tDamage: 3\tMoney: 35");
        System.out.println("3- Rifle\tDamage: 7\tMoney: 45");
        System.out.println("4- Quit");
        System.out.print("Select weapon:");
        int weaponId=input.nextInt();
        return weaponId;
    }

    public void buyWeapon(int itemId){
        int damage=0;
        int price=0;
        String weaponName=null;
        switch (itemId){
            case 1:
                damage=2;
                weaponName="Gun";
                price=25;
                break;
            case 2:
                damage=3;
                weaponName="Sword";
                price=35;
                break;
            case 3:
                damage=7;
                weaponName="Rifle";
                price=45;
                break;
            case 4:
                System.out.println("Logging out!!");
                break;
            default:
                System.out.println("Invalid transaction!!");
                break;

        }
         if(price>0){
             if(player.getMoney()>=price){
                 player.getInventory().setDamage(damage);
                 player.getInventory().setWeaponName(weaponName);
                 player.setMoney(player.getMoney()-price);
                 System.out.println(weaponName+" have been bought ," +
                         "\nPrevious damage: "+player.getDamage()+
                         "\nNew damage: "+player.getTotalDamage()+
                         "\nRemain money: "+player.getMoney());

             }else{
                 System.out.println("Not enough money!!");

             }
         }
        }

    public int armorMenu(){
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Select armor to protect monsters: ");
        System.out.println("1- Light Armor\tBlock: 1\tMoney: 15");
        System.out.println("2- Middle Armor\tBlock: 3\tMoney: 25");
        System.out.println("3- Heavy Armor\tBlock: 5\tMoney: 40");
        System.out.println("4- Quit");
        System.out.print("Select armor:");
        int armorId=input.nextInt();
        return armorId;
    }

    public void buyArmor(int itemId){
        int block=0;
        int price=0;
        String armorName=null;
        switch (itemId){
            case 1:
                block=1;
                armorName="Light Armor";
                price=15;
                break;
            case 2:
                block=3;
                armorName="Middle Armor";
                price=25;
                break;
            case 3:
                block=5;
                armorName="Heavy Armor";
                price=40;
                break;
            case 4:
                System.out.println("Logging out");
                break;
            default:
                System.out.println("Invalid transaction!!");
                break;

        }
        if (price > 0) {
            if(player.getMoney()>=price){
                player.getInventory().setArmor(block);
                player.getInventory().setArmorName(armorName);
                player.setMoney(player.getMoney()-price);
                System.out.println(armorName+" have been bought ," +
                        "\nblock damage: "+player.getInventory().getArmor()+
                        "\nRemain money: "+player.getMoney());

            }else{
                System.out.println("Not enough money!!");

            }
        }
    }

}

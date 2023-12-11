public abstract class BattleLocation extends Location{
     protected Monsters monsters;
     protected String award;
    public BattleLocation(Player player , String name, Monsters monsters, String award) {
        super(player);
        this.name=name;
        this.monsters=monsters;
        this.award=award;
    }

    @Override
    public boolean getLocation(){
        int monsterCount=monsters.monsterCount();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Now you are "+this.getName()+"!!");
        System.out.println("Be careful! here is "+monsterCount+" units "+ monsters.getName()+" live!!");
        System.out.println("To fight you use (F) command or To escape you use (E) command");
        System.out.print("Enter your command:");
        String selCase=input.nextLine();
        selCase=selCase.toUpperCase();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if(selCase.equals("F")){
            if(fight(monsterCount)){
                System.out.println("Congratulations, in "+this.getName()+" area you killed all of monster");
                if(this.award.equals("Food")&& !player.getInventory().isFood()){
                    System.out.println("You won "+this.award+"!!");
                    player.getInventory().setFood(true);
                }else if(this.award.equals("Firewood")&& !player.getInventory().isFirewood()){
                    System.out.println("You won "+this.award+"!!");
                    player.getInventory().setFirewood(true);
                }else  if(this.award.equals("Water")&& !player.getInventory().isWater()){
                    System.out.println("You won "+this.award+"!!");
                    player.getInventory().setWater(true);
                }
                return true;
            }
            if(player.getRealHealty()<=0){
                System.out.println("You died!!");
                return false;
            }

        }
        return true;
    }
    public boolean fight(int monsterCount){
        for(int i=0;i<monsterCount;i++){
            int defaultMonster= monsters.getHealth();
            playerStatus();
            monsterStatus();
            while(player.getHealthy()>0 && monsters.getHealth()>0){
                System.out.println("To Hit you use (H) command or To escape you use (E) command");
                System.out.print("Enter your command:");
                String selCase=input.nextLine();
                selCase=selCase.toUpperCase();
                if(selCase.equals("H")){
                    System.out.println("You hit monster!");
                    monsters.setHealth(monsters.getHealth()-(player.getTotalDamage()));
                    afterHit();
                    if(monsters.getHealth()>0){
                        System.out.println("Monster hit you!");
                        player.setHealthy(player.getHealthy()-(monsters.getDamage()-player.getInventory().getArmor()));
                        afterHit();
                    }
                }else{
                    break;
                }
            }
            if(monsters.getHealth()<=0 && player.getHealthy()>0){
                System.out.println("Congratulations, in "+this.getName()+" area you killed "+monsters.getMaxNumber()+" of monster");
                player.setMoney(player.getMoney()+ monsters.getAward());
                System.out.println("Your current money: "+player.getMoney());
                monsters.setHealth(defaultMonster); //  monsters come to life again

            }else{
                return false;
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Player life: "+player.getHealthy()+
                "\n"+monsters.getName()+" life: "+ monsters.getHealth()+
                "\n");
    }
    public void playerStatus(){
        System.out.println("\nPlayer Values-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" +
                "\nLife: "+player.getHealthy()+
                "\nDamage: "+player.getTotalDamage()+
                "\nMoney: "+player.getMoney());
        if(player.getInventory().getDamage()>0){
            System.out.println("Weapon: "+player.getInventory().getWeaponName());
        }
        if(player.getInventory().getArmor()>0){
            System.out.println("Armor: "+player.getInventory().getArmorName());
        }
    }
    public void monsterStatus(){
        System.out.println("\n"+monsters.getName()+" Values--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+
                "\nLife: "+monsters.getHealth()+
                "\nDamage: "+monsters.getDamage()+
                "\nAward: "+monsters.getAward());


    }

}

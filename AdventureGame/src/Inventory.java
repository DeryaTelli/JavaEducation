public class Inventory {
    private boolean water, food ,firewood; //   propose of game, this stuff collection
    private String weaponName , armorName;
    private int damage,armor;

    Inventory(){
        this.water=false;
        this.firewood=false;
        this.food=false;
        this.damage=0;
        this.armor=0;
        this.weaponName=null;
        this.armorName=null;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weapeonName) {
        this.weaponName = weapeonName;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }
@Override
   public boolean getLocation(){
     player.setHealthy(player.getRealHealty());
    System.out.println("Now, you are the safe house");
     System.out.println("Your life is renewed :)");
     return true;
   }
}


public class MyApartment {
    
    public static void main(String[] args) {
        spellStorage myAttackStorage = new spellStorage();
        Attack[] myAttacks = myAttackStorage.getSpells();
        
        Entity me = new Entity("Miltin 'd' Bird", myAttacks);
        Enemy they = new Enemy("TutEnemy", null);
        Entity sensei = new Entity("Wizard thy Confuse", null);
        
        Entity[] characters = new Entity[2];
        
        
    
        characters[0] = they;
        characters[1] = sensei;
        run(me, characters);
        
    }
    
    static void run(Entity player, Entity[] characters) {
            System.out.println("You're inside your thiry square apartment. \n\nYou check your stats:");
            System.out.println(player.getSummary());
            
            System.out.println("Apart from yourself, in the room you see:");
            Attack[] playerAttacks = player.getAttacks();
            for(int i = 0; i < 2; i++) {
                System.out.println(characters[i].getName());
            }
            
            System.out.println("The Wizard says a couple of words, \nyou now know the following spells:\n");
            
            for(int i = 0; i < playerAttacks.length; i++) {
                System.out.println(playerAttacks[i].getName() + ", DMG: " + playerAttacks[i].getDmg());
            }
        
            System.out.println("\nPointer has reached end of file, \nand you realize that your life is vaguely pointless. You character commits suicide.");
    }
    
}

import java.util.Scanner;
public class MyApartment {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        
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
                if(playerAttacks[i] instanceof PhysicalAttack) {
                    System.out.println(playerAttacks[i].getName() + ", ATK: " + playerAttacks[i].getDmg() + ", DMG: " + player.getAttackDmg((PhysicalAttack)playerAttacks[i]));
                }
                else if(playerAttacks[i] instanceof MagicalAttack) {
                    System.out.println(playerAttacks[i].getName() + ", ATK: " + playerAttacks[i].getDmg() + ", DMG: " + player.getAttackDmg((MagicalAttack)playerAttacks[i]));
                } 
            }
        
            System.out.println("\nPointer has reached end of file, \nand you realize that your life is vaguely pointless. You character commits suicide.");
    }
    
}

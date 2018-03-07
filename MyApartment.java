import java.util.Scanner;
public class MyApartment {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QualityChecker the = new QualityChecker();
        
        
        spellStorage myAttackStorage = new spellStorage();
        Attack[] myAttacks = myAttackStorage.getSpells();
        
        Entity me = new Entity("Miltin 'd' Bird", myAttacks);
        Enemy they = new Enemy("TutEnemy", null);
        Entity sensei = new Entity("Wizard thy Confuse", null);
        
        Entity[] characters = new Entity[2];
        
        
    
        characters[0] = they;
        characters[1] = sensei;
        
        int classId = checkup(me, in, the);

        me.setPlayerClass(assignClass(classId, the));
        me.setStats(me.getPlayerClass().getBaseStats());
        
        run(me, characters);
        
        
    }

    static PlayerClass assignClass(int id, QualityChecker the) {
        return the.makeClassFromId(id);
        
    }

    static int checkup(Entity player, Scanner in, QualityChecker the) {
        System.out.println("Hello Player, I want you to look deep into your heart and identify a quality about yourself. \nYour Quality is: ");
        String qual = in.nextLine();
        int classId = 0;
        while(true) {
            classId = the.getClassFromQuality(qual);
            if(classId != 0) {
                break;
            }
            else {
                System.out.println("You call that a quality?\nTry again stupid: ");
                qual = in.nextLine();
            }
            
        }

        System.out.println("Haha! We analysed your quality and got: " + the.getClassNameFromId(classId));
        in.nextLine();
        return classId;
    }
    
    static void run(Entity player, Entity[] characters) {
            System.out.println("You're inside your thiry square apartment. \n\nYou check your stats:");
            System.out.println(player.getSummary());
            
            System.out.println("Apart from yourself, in the room you see:");
            Attack[] playerAttacks = player.getAttacks();
            for(int i = 0; i < 2; i++) {
                System.out.println(characters[i].getName());
            }

            System.out.println("Fetched str: "+ player.getStr());
            
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

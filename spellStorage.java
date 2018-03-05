public class spellStorage {
    private Attack[] spellSlots = new Attack[10];
    
    public spellStorage() {
        this.spellSlots = getStandardSpells();
    }
    
    private Attack[] getStandardSpells(){
        Attack[] tmp = new Attack[10];
        tmp[0] = new PhysicalAttack(0, "Quick Stsb", 1);
        tmp[1] = new PhysicalAttack(1, "Panic Kick", 3);
        tmp[2] = new PhysicalAttack(2, "Awkward Punch", 2);
        tmp[3] = new PhysicalAttack(3, "Kangaroo Kick", 5);
        tmp[4] = new PhysicalAttack(4, "Double Slap", 1);
        
        tmp[5] = new MagicalAttack(5, "Light Breeze", 0);
        tmp[6] = new MagicalAttack(6, "Flaming Sphere", 3);
        tmp[7] = new MagicalAttack(7, "Encourage", 0);
        tmp[8] = new MagicalAttack(8, "Psuedo Refreshment", 0);
        tmp[9] = new MagicalAttack(9, "Mental Chains", 0);
        
        return tmp;
    }
    
    public Attack[] getSpells() {
        return this.spellSlots;
    }
}

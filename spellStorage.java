public class spellStorage {
    private Attack[] spellSlots = new Attack[10];
    
    public spellStorage() {
        this.spellSlots = getStandardSpells();
    }
    
    private Attack[] getStandardSpells(){
        Attack[] tmp = new Attack[10];
        tmp[0] = new PhysicalAttack(0, "Quick Stsb", 0.2);
        tmp[1] = new PhysicalAttack(1, "Panic Kick", 0.8);
        tmp[2] = new PhysicalAttack(2, "Awkward Punch", 0.15);
        tmp[3] = new PhysicalAttack(3, "Kangaroo Kick", 1.2);
        tmp[4] = new PhysicalAttack(4, "Double Slap", 0.45);
        
        tmp[5] = new MagicalAttack(5, "Light Breeze", 0);
        tmp[6] = new MagicalAttack(6, "Flaming Sphere", 0.25);
        tmp[7] = new MagicalAttack(7, "Encourage", 0);
        tmp[8] = new MagicalAttack(8, "Psuedo Refreshment", 0);
        tmp[9] = new MagicalAttack(9, "Mental Chains", 0);
        
        return tmp;
    }
    
    public Attack[] getSpells() {
        return this.spellSlots;
    }
}

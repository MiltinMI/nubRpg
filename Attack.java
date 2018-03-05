
public class Attack {
    private String name = "Damage";
    private int id;
    private String typeName = "attack";
    private int frames = 10;
    private int delay = 1;
    private int aim = 0; //TODO; actual datatype for aim (High, Mid, Low)
    private int itemReq = 0; //TODO; actual datatype for the weapon/item.
    private int fatigueGain = 5;
    private int rawDamage = 0;
    //private startAnimSprite;
    public Attack(int id) {
        this.id = id;
    }
    
    public Attack(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }
    
    public Attack(int id, String typeName, String name) {
        this.id = id;
        this.typeName = typeName;
        this.name = name;
    }

    public Attack(int id, String typeName, String name, int rawDamage) {
        this.id = id;
        this.typeName = typeName;
        this.name = name;
        this.rawDamage = rawDamage;
    }
    
    public String getName() {
        return this.name;
    }

    public void setFatigueGain(int gain) {
        this.fatigueGain = gain;
    }

    public void setFrameLength(int amount) {
        this.frames = amount;
    }

    public int getDmg() {
        return this.rawDamage;
    }
}

class PhysicalAttack extends Attack {
    //private Effect effect; TODO; actual datatype for effect such as 10% of poison.
    public PhysicalAttack(int id, String name, int rawDamage) {
        super(id, "physical", name, rawDamage);
    }
}

class MagicalAttack extends Attack {
    private int manaReq = 3;
    //private Effect effect; TODO; actual datatype for effect such as 10% of poison.
    public MagicalAttack(int id, String name, int rawDamage) {
        super(id, "magical", name, rawDamage);
    }

    public void setManaReq(int req) {
        this.manaReq = req;
    }

    public int getManaReq() {
        return this.manaReq;
    }
    
}

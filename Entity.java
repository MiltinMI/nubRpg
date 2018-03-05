public class Entity {
    private String  name = "Nameless";
    private Attack[] attacks;
    private int hp = 20;
    private int mp = 5;
    private int str = 5;
    private int agi = 2;
    private int wis = 1;
    private int ini = 1;
    private int spi = 2;
    private int sta = 3;
    private int end = 0;
    private int lvl = 1;
    
    public Entity(String name, int str, int agi, int wis, int ini, int spi, int sta, int lvl) {
        this.name = name;
        this.str = str;
        this.agi = agi;
        this.wis = wis;
        this.ini = ini;
        this.spi = spi;
        this.sta = sta;
        this.hp = getHp(this.sta, this.lvl);
        this.mp = getMp(this.wis, this.lvl);
    }
    
    public Entity(String name, Attack[] attacks) {
        this.name = name;
        this.attacks = attacks;
    }
    public int getHp(int sta, int lvl) {
        return (int)(sta * lvl * lvl * 5.3);
    }
    
    public int getMp(int wis, int lvl) {
        return (int)(wis * lvl * lvl * 4.7);
    }

    public double getDps() {
        return (int)(this.str * this.str * 0.3 + this.agi * this.agi * 0.08);
    }

    public double getSdps() {
        return (int)(this.ini * this.ini * 0.25 + this.wis * this.wis * 0.05);
    }
    
    public String getSummary() {
        return "Name: " + this.name + "\nHP: " + this.hp + "\nMP: " + this.mp + "\nLVL: " + this.lvl;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Attack[] getAttacks() {
        return this.attacks;
    }

    public int getAttackDmg(PhysicalAttack atk) {
        return (int)(this.getDps() * atk.getDmg());
    }

    public int getAttackDmg(MagicalAttack atk) {
        return (int)(this.getSdps() * atk.getDmg());
    }
}


public class PlayerClass {
    private String name = "Commoner";
    private int id = 1;
    private int baseStr = 0;
    private int baseAgi = 0;
    private int baseIni = 0;
    private int baseWis = 0;
    private int baseSpi = 0;
    private int baseSta = 0;
    private String[] wepBonus = {"fist"};

    public PlayerClass(String name, int id, int str, int agi, int ini, int wis, int spi, int sta, String[] wepBon) {
        this.name = name;
        this.id = id;
        this.baseStr = str;
        this.baseAgi = agi;
        this.baseIni = ini;
        this.baseWis = wis;
        this.baseSpi = spi;
        this.baseSta = sta;
        this.wepBonus = wepBon;
    }

    public int[] getBaseStats() {
        int[] tmp = new int[6];
        
        tmp[0] = this.baseStr;
        tmp[1] = this.baseAgi;
        tmp[2] = this.baseIni;
        tmp[3] = this.baseWis;
        tmp[4] = this.baseSpi;
        tmp[5] = this.baseSta;

        return tmp;
    }
    
}

class Commoner extends PlayerClass {
    
    public Commoner() {
        super("Commoner", 1, 1, 1, 1, 1, 1, 1, new String[] {"fist"});
    }
}

class GateKeeper extends PlayerClass {
    
    public GateKeeper() {
        super("GateKeeper", 1, 6, 2, 0, 2, 2, 8, new String[] {"1h-slash", "1h-crush", "shield"});
    }
    
}

class PrisonGuard extends PlayerClass {

    public PrisonGuard() {
        super("Prison Guard", 2, 4, 6, 0, 0, 0, 6, new String[] {"1h-slash", "1h-crush", "1h-pierce", "2h-slash", "2h-crush", "shield", "fist"});
    }
    
}

class Peasant extends PlayerClass {

    public Peasant() {
        super("Peasant", 3, 3, 5, 0, 2, 2, 2, new String[] {"1h-crush", "1h-pierce", "2h-crush", "2h-pierce", "buckler"});
    }
    
}

class Explorer extends PlayerClass {

    public Explorer() {
        super("Explorer", 4, 2, 4, 1, 1, 1, 5, new String[] {"1h-slash", "1h-crush", "1h-pierce", "2h-crush", "ranged", "off-hand", "buckler", "fist"});
    }
    
}

class Magician extends PlayerClass {

    public Magician() {
        super("Magician", 5, 1, 3, 6, 4, 4, 3, new String[] {"1h-crush", "1h-pierce"});
    }
    
}

class Wizard extends PlayerClass {

    public Wizard() {
        super("Wizard", 6, 0, 2, 10, 6, 0, 1, new String[] {"1h-crush", "2h-crush"});
    }
    
}

class HighwayMan extends PlayerClass {

    public HighwayMan() {
        super("HighwayMan", 7, 4, 6, 2, 1, 1, 3, new String[] {"1h-crush", "1h-pierce", "ranged", "buckler", "shield", "fist"});
    }
    
}

class Brigand extends PlayerClass {

    public Brigand() {
        super("Brigand", 8, 4, 8, 0, 0, 1, 3, new String[] {"1h-slash", "1h-crush", "1h-pierce", "ranged", "buckler", "shield", "fist"});
    }
    
}

class Exorcist extends PlayerClass {

    public Exorcist() {
        super("Exorcist", 9, 1, 2, 4, 6, 4, 4, new String[] {"1h-slash", "1h-crush", "buckler", "shield"});
    }
    
}

class Soothsayer extends PlayerClass {

    public Soothsayer() {
        super("Soothsayer", 10, 0, 0, 2, 6, 8, 2, new String[] {"1h-slash", "buckler"});
    }
    
}

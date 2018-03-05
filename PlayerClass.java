
public class PlayerClass {
    private int baseStr = 0;
    private int baseAgi = 0;
    private int baseIni = 0;
    private int baseWis = 0;
    private int baseSpi = 0;
    private int baseSta = 0;
    private String[] wepBonus = {"fist"};

    public PlayerClass(int str, int agi, int ini, int wis, int spi, int sta, String[] wepBon) {
        this.baseStr = str;
        this.baseAgi = agi;
        this.baseIni = ini;
        this.baseWis = wis;
        this.baseSpi = spi;
        this.baseSta = sta;
        this.wepBonus = wepBon;
    }
}

class GateKeeper extends PlayerClass {
    
    public GateKeeper() {
        super(6, 2, 0, 2, 2, 8, new String[] {"1h-slash", "1h-crush", "shield"});
    }
    
}

class PrisonGuard extends PlayerClass {

    public PrisonGuard() {
        super(4, 6, 0, 0, 0, 6, new String[] {"1h-slash", "1h-crush", "1h-pierce", "2h-slash", "2h-crush", "shield", "fist"});
    }
    
}

class Peasant extends PlayerClass {

    public Peasant() {
        super(3, 5, 0, 2, 2, 2, new String[] {"1h-crush", "1h-pierce", "2h-crush", "2h-pierce", "buckler"});
    }
    
}

class Explorer extends PlayerClass {

    public Explorer() {
        super(2, 4, 1, 1, 1, 5, new String[] {"1h-slash", "1h-crush", "1h-pierce", "2h-crush", "ranged", "off-hand", "buckler", "fist"});
    }
    
}

class Magician extends PlayerClass {

    public Magician() {
        super(1, 3, 6, 4, 4, 3, new String[] {"1h-crush", "1h-pierce"});
    }
    
}

class Wizard extends PlayerClass {

    public Wizard() {
        super(0, 2, 10, 6, 0, 1, new String[] {"1h-crush", "2h-crush"});
    }
    
}

class HighwayMan extends PlayerClass {

    public HighwayMan() {
        super(4, 6, 2, 1, 1, 3, new String[] {"1h-crush", "1h-pierce", "ranged", "buckler", "shield", "fist"});
    }
    
}

class Brigand extends PlayerClass {

    public Brigand() {
        super(4, 8, 0, 0, 1, 3, new String[] {"1h-slash", "1h-crush", "1h-pierce", "ranged", "buckler", "shield", "fist"});
    }
    
}

class Exorcist extends PlayerClass {

    public Exorcist() {
        super(1, 2, 4, 6, 4, 4, new String[] {"1h-slash", "1h-crush", "buckler", "shield"});
    }
    
}

class Soothsayer extends PlayerClass {

    public Soothsayer() {
        super(0, 0, 2, 6, 8, 2, new String[] {"1h-slash", "buckler"});
    }
    
}

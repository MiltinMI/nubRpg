
public class Enemy extends Entity {
    private int atkType = 0;
    private int enemyType = 0;
    public Enemy(String name, Attack[] attacks) {
        super(name, attacks);
    }
}
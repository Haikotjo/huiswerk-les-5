abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp ;
    private final String type;
    private final String sound;
    private final String food;

    public Pokemon(String name, int level, int hp, String type, String sound, String food) {
        this.name = name;
        this.type = type;
        this.hp  = hp;
        this.level = level;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public int getHp() {
        return hp ;
    }

    public void setHp(int hp) {
        hp  = hp;
    }
}

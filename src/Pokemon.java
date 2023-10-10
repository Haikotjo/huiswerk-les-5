abstract class Pokemon {
    private final String name;
    private final int Hp;
    private final String type;
    private final int level;
    private final String sound;
    private final String food;

    public Pokemon(String name, int hp, String type, int level, String sound, String food) {
        this.name = name;
        Hp = hp;
        this.type = type;
        this.level = level;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
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

}

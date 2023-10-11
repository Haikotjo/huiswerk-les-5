import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks;  // Eerste private final variabele
    private final String specialAbility; // Tweede private final variabele

    public GrassPokemon(String name, int level, int hp, String food, String sound, String type, String specialAbility) {
        super(name, level, hp, type, sound, food);
        this.attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
        this.specialAbility = specialAbility;
    }

    public GrassPokemon(String name, int level, int hp, String food, String sound, String type) {
        this(name, level, hp, food, sound, type, "DefaultSpecialAbility");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    // Aanvalsmethoden
    void leafStorm(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leafStorm");
    }

    void solarBeam(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with solarBeam");
    }

    void leechSeed(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leechSeed");
    }

    void leaveBlade(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with leaveBlade");
    }
}
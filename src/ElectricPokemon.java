import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks;  // Eerste private final variabele
    private final String specialAbility; // Tweede private final variabele

    public ElectricPokemon(String name, int level, int hp, String food, String sound, String type, String specialAbility) {
        super(name, level, hp, type, sound, food);
        this.attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
        this.specialAbility = specialAbility;
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound, String type) {
        this(name, level, hp, food, sound, type, "DefaultSpecialAbility");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    // Aanvalsmethoden
    void thunderPunch(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with thunderPunch");
    }

    void electroBall(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with electroBall");
    }

    void thunder(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with thunder");
    }

    void voltTackle(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with voltTackle");
    }
}
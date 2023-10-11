import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks;  // Eerste private final variabele
    private final String specialAbility; // Tweede private final variabele

    // Constructor met specialAbility als parameter
    public WaterPokemon(String name, int level, int hp, String food, String sound, String type, String specialAbility) {
        super(name, level, hp, type, sound, food);
        this.attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
        this.specialAbility = specialAbility;  // Initialiseer de nieuwe variabele
    }

    // Overloaded constructor die de specialAbility instelt op een standaardwaarde
    public WaterPokemon(String name, int level, int hp, String food, String sound, String type) {
        this(name, level, hp, food, sound, type, "DefaultSpecialAbility");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public String getSpecialAbility() {  // Nieuwe getter voor de specialAbility
        return specialAbility;
    }

    // Aanvalsmethoden
    void surf(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with surf");
        // Voeg hier logica toe om HP te verminderen, etc.
    }

    void hydroPump(Pokemon enemy, Pokemon gymPokemon) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with hydroPump");
        // Voeg hier logica toe om HP te verminderen, etc.
    }

    void hydroCanon(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with hydroCanon");
        // Voeg hier logica toe om HP te verminderen, etc.
    }

    void rainDance(Pokemon enemy) {
        System.out.println(getName() + " attacks " + enemy.getName() + " with rainDance");
        // Voeg hier logica toe om HP te verminderen, etc.
    }
}

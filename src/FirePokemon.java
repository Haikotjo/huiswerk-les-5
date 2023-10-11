import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final List<String> attacks;  // Eerste private final variabele
    private final String specialAbility; // Tweede private final variabele

    // Constructor met specialAbility als parameter
    public FirePokemon(String name, int level, int hp, String food, String sound, String type, String specialAbility) {
        super(name, level, hp, type, sound, food);
        this.attacks = Arrays.asList("fireLash", "flameThrower", "inferno", "pyroBall");
        this.specialAbility = specialAbility;  // Initialiseer de nieuwe variabele
    }

    // Overloaded constructor die de specialAbility instelt op een standaardwaarde
    public FirePokemon(String name, int level, int hp, String food, String sound, String type) {
        this(name, level, hp, food, sound, type, "DefaultSpecialAbility");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public String getSpecialAbility() {  // Nieuwe getter voor de specialAbility
        return specialAbility;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name + " attacks " + enemy + " with fire lash");
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with flame thrower");
    }
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with inferno");
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with solar pyroBall");
    }


}

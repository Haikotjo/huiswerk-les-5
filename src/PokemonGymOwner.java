import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private final String gymName;

    public PokemonGymOwner(String name, int age, String town, List<Pokemon> pokemons, List<String> badges, int money, List<String> items, String gymName) {
        super(name, age, town, pokemons, badges, money, items);
        this.gymName = gymName;
    }

    public String getGymName() {
        return gymName;
    }
}

import java.util.List;

public class PokemonTrainer {
    private String name;
    private int age;
    private String hometown;
    private int badges;
    private int experience;
    private String favoriteType;
    private List<Pokemon> pokemons;
    private boolean isInGym;

    public PokemonTrainer(String name, int age, String hometown, int badges, int experience, String favoriteType, List<Pokemon> pokemons, boolean isInGym) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.badges = badges;
        this.experience = experience;
        this.favoriteType = favoriteType;
        this.pokemons = pokemons;
        this.isInGym = isInGym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(String favoriteType) {
        this.favoriteType = favoriteType;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public boolean isIsInGym() {
        return isInGym;
    }

    public void setIsInGym(boolean isInGym) {
        this.isInGym = isInGym;
    }
}

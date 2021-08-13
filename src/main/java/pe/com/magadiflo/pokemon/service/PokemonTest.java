package pe.com.magadiflo.pokemon.service;

public class PokemonTest {

    public static void main(String[] args) {

        PokemonService pokemonService = new PokemonServiceImpl();
        pokemonService.getListarPokemones().forEach(System.out::println);

    }

}

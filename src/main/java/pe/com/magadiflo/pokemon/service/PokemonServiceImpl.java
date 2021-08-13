package pe.com.magadiflo.pokemon.service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import pe.com.magadiflo.pokemon.domain.Pokemon;
import pe.com.magadiflo.pokemon.domain.PokemonPaginacion;

public class PokemonServiceImpl implements PokemonService {

    public static final String URL_BASE = "https://pokeapi.co/api/v2";
    private static Client cliente;
    private static WebTarget webTarget;
    private static List<Pokemon> pokemones;
    private static PokemonPaginacion pokemonPaginacion;

    public PokemonServiceImpl() {
        PokemonServiceImpl.cliente = ClientBuilder.newClient().register(new JacksonFeature());
        PokemonServiceImpl.webTarget = PokemonServiceImpl.cliente.target(PokemonServiceImpl.URL_BASE).path("/pokemon-species");
        PokemonServiceImpl.pokemonPaginacion = PokemonServiceImpl.webTarget.request(MediaType.APPLICATION_JSON).get(PokemonPaginacion.class);
    }

    @Override
    public List<Pokemon> getListarPokemones() {
        return PokemonServiceImpl.pokemonPaginacion.getResults();
    }

    @Override
    public String getUrlSiguiente() {
        return PokemonServiceImpl.pokemonPaginacion.getNext();
    }

    @Override
    public String getUrlAnterior() {
        return PokemonServiceImpl.pokemonPaginacion.getPrevious();
    }

    @Override
    public int getTotalPokemones() {
        return PokemonServiceImpl.pokemonPaginacion.getCount();
    }

}

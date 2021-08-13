package pe.com.magadiflo.pokemon.service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import pe.com.magadiflo.pokemon.domain.Pokemon;
import pe.com.magadiflo.pokemon.domain.PokemonDetalles;
import pe.com.magadiflo.pokemon.domain.PokemonPaginacion;

public class PokemonServiceImpl implements PokemonService {

    public static final String URL_BASE = "https://pokeapi.co/api/v2";
    private static Client cliente;
    private static WebTarget webTarget;
    private static List<Pokemon> pokemones;
    private static PokemonPaginacion pokemonPaginacion;

    public PokemonServiceImpl() {
        PokemonServiceImpl.cliente = ClientBuilder.newClient().register(new JacksonFeature());
    }

    @Override
    public void obtenerDatosPokemones(int offset, int limit) {
        PokemonServiceImpl.webTarget = PokemonServiceImpl.cliente.target(PokemonServiceImpl.URL_BASE)
                .path("/pokemon-species")
                .queryParam("offset", offset)
                .queryParam("limit", limit);
        PokemonServiceImpl.pokemonPaginacion = PokemonServiceImpl.webTarget.request(MediaType.APPLICATION_JSON).get(PokemonPaginacion.class);
    }

    @Override
    public PokemonDetalles obtenerDetallesPokemon(int id) {
        return PokemonServiceImpl.cliente.target(PokemonServiceImpl.URL_BASE)
                .path("/pokemon").path("/" + id)
                .request(MediaType.APPLICATION_JSON)
                .get(PokemonDetalles.class);
    }

    @Override
    public List<Pokemon> getListarPokemones() {
        return PokemonServiceImpl.pokemonPaginacion.getResults();
    }

    @Override
    public Integer getOffsetSiguiente() {
        return this.getOffset(PokemonServiceImpl.pokemonPaginacion.getNext());
    }

    @Override
    public Integer getOffsetAnterior() {
        return this.getOffset(PokemonServiceImpl.pokemonPaginacion.getPrevious());
    }

    @Override
    public int getTotalPokemones() {
        return PokemonServiceImpl.pokemonPaginacion.getCount();
    }

    //Tratamiendo para obtener el valor del offset recibido en el objeto
    private Integer getOffset(String url) {
        if (url == null || url.trim().equals("")) {
            return null;
        }
        int iOffset = url.indexOf("offset") + 7;
        int iiLimit = url.indexOf("&limit");
        int res = iiLimit - iOffset;
        return Integer.parseInt(url.substring(iOffset, iiLimit));
    }

}

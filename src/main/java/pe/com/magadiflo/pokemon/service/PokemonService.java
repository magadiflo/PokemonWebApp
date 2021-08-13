package pe.com.magadiflo.pokemon.service;

import java.util.List;
import pe.com.magadiflo.pokemon.domain.Pokemon;
import pe.com.magadiflo.pokemon.domain.PokemonDetalles;

public interface PokemonService {
    
    public void obtenerDatosPokemones(int offset, int limit);
    
    public PokemonDetalles obtenerDetallesPokemon(int id);

    public List<Pokemon> getListarPokemones();

    public Integer getOffsetSiguiente();

    public Integer getOffsetAnterior();

    public int getTotalPokemones();

}
package pe.com.magadiflo.pokemon.service;

import java.util.List;
import pe.com.magadiflo.pokemon.domain.Pokemon;

public interface PokemonService {

    public List<Pokemon> getListarPokemones();

    public String getUrlSiguiente();

    public String getUrlAnterior();

    public int getTotalPokemones();

}
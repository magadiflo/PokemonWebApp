package pe.com.magadiflo.pokemon.service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import pe.com.magadiflo.pokemon.domain.Estadisticas;
import pe.com.magadiflo.pokemon.domain.Habilidades;
import pe.com.magadiflo.pokemon.domain.PokemonDetalles;
import pe.com.magadiflo.pokemon.domain.Tipos;

public class PokemonTest {

    public static void main(String[] args) {
        
        
        Client client = ClientBuilder.newClient().register(new JacksonFeature());
        PokemonDetalles pokemonDetalles = client
                                                .target("https://pokeapi.co/api/v2/pokemon/1")
                                                .request(MediaType.APPLICATION_JSON)
                                                .get(PokemonDetalles.class);
                                               
        
        System.out.println("Name: " + pokemonDetalles.getName());
        System.out.println("Weight: " + pokemonDetalles.getWeight());
        System.out.println("Height: " + pokemonDetalles.getHeight());
        
        List<Tipos> listaTipos = pokemonDetalles.getTypes();
        listaTipos.forEach(tipos -> System.out.println(tipos.getType().getName()));
        
        List<Estadisticas> listaEstadisticas = pokemonDetalles.getStats();
        listaEstadisticas.forEach(estadistica -> System.out.println(estadistica.getStat().getName()));
        
        List<Habilidades> listarHabilidades = pokemonDetalles.getAbilities();
        listarHabilidades.forEach(habilidad -> System.out.println(habilidad.getAbility().getName()));
                


    }

}

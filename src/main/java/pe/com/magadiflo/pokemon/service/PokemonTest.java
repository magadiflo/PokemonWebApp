package pe.com.magadiflo.pokemon.service;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import pe.com.magadiflo.pokemon.domain.Cadena;
import pe.com.magadiflo.pokemon.domain.Especie;
import pe.com.magadiflo.pokemon.domain.Evolucion;
import pe.com.magadiflo.pokemon.domain.PokemonEspecies;

public class PokemonTest {

    public static void main(String[] args) {

//        SÍ FUNCIONA
//        Client client = ClientBuilder.newClient().register(new JacksonFeature());
//        Cadena cadena = client.target("https://pokeapi.co/api/v2/evolution-chain/1")
//                .request(MediaType.APPLICATION_JSON)
//                .get(Cadena.class);
//
//        Evolucion evolucion = cadena.getChain();
//
//        Especie especie;
//        List<Evolucion> listaEvolucion = evolucion.getEvolves_to();
//
//        while (listaEvolucion != null && !listaEvolucion.isEmpty()) {
//            listaEvolucion = evolucion.getEvolves_to();
//            especie = evolucion.getSpecies();
//            System.out.println("Especie: " + especie);
//            if (listaEvolucion != null && !listaEvolucion.isEmpty()) {
//                evolucion = listaEvolucion.get(0);
//            }
//        }
        
        
//Ambos funcionan para lo mismo
        Client client = ClientBuilder.newClient().register(new JacksonFeature());
        PokemonEspecies pokemonEspecies = client.target("https://pokeapi.co/api/v2/pokemon-species/1")
                .request(MediaType.APPLICATION_JSON)
                .get(PokemonEspecies.class);

        System.out.println("url: " + pokemonEspecies.getEvolution_chain().getUrl());

    }

}

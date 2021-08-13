package pe.com.magadiflo.pokemon.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.magadiflo.pokemon.domain.Especie;
import pe.com.magadiflo.pokemon.domain.Evolucion;
import pe.com.magadiflo.pokemon.domain.Pokemon;
import pe.com.magadiflo.pokemon.domain.PokemonDetalles;
import pe.com.magadiflo.pokemon.service.PokemonService;
import pe.com.magadiflo.pokemon.service.PokemonServiceImpl;

@WebServlet("/pokemon-evolucion")
public class PokemonEvolucionController extends HttpServlet {

    private PokemonService pokemonService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtenemos el id de la cadena de evolución
        int id = Integer.parseInt(request.getParameter("id"));

        //Inyectamos el servicio
        this.pokemonService = new PokemonServiceImpl();

        //Obtenemos la url del la cadena de evolución
        String url = this.pokemonService.obtenerUrlCadenaEvolucion(id);
        System.out.println(url);

        //Obtenemos los pokemones que pertenecen a una evolución
        Evolucion evolucion = this.pokemonService.obtenerEvolucion(url);

        Especie especie;
        List<Evolucion> listaEvolucion = evolucion.getEvolves_to();

        //Para almacenar el detalle de los pokemones en evolución
        List<Pokemon> grupoEvolucion = new ArrayList<>();
        Pokemon pokemon;
        PokemonDetalles pokemonDetalles;

        while (listaEvolucion != null && !listaEvolucion.isEmpty()) {

            listaEvolucion = evolucion.getEvolves_to();
            especie = evolucion.getSpecies();
            System.out.println("Especie: " + especie.getName());

            pokemon = new Pokemon();
            pokemonDetalles = this.pokemonService.obtenerDetallesPokemon(especie.getName());
            pokemon.setNumber(pokemonDetalles.getId());
            pokemon.setName(pokemonDetalles.getName());
            grupoEvolucion.add(pokemon);

            if (listaEvolucion != null && !listaEvolucion.isEmpty()) {
                evolucion = listaEvolucion.get(0);
            }
        }

        request.setAttribute("grupoEvolucion", grupoEvolucion);
        request.getRequestDispatcher("/WEB-INF/pages/evolucionPokemon.jsp").forward(request, response);

    }

}

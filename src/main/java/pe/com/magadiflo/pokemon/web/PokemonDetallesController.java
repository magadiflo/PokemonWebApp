package pe.com.magadiflo.pokemon.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import pe.com.magadiflo.pokemon.domain.PokemonDetalles;
import pe.com.magadiflo.pokemon.service.PokemonService;
import pe.com.magadiflo.pokemon.service.PokemonServiceImpl;

@WebServlet("/pokemon-detalle")
public class PokemonDetallesController extends HttpServlet {

    private PokemonService pokemonService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtenemos el id del pokemón a buscar
        int id = Integer.parseInt(request.getParameter("id"));

        //Inyectamos el servicio
        this.pokemonService = new PokemonServiceImpl();

        //Obtenemos el detalle del pokemón
        PokemonDetalles pokemonDetalles = this.pokemonService.obtenerDetallesPokemon(id);

        //Compartimos variables a la vista
        request.setAttribute("id", pokemonDetalles.getId());
        request.setAttribute("nombre", pokemonDetalles.getName());
        request.setAttribute("altura", pokemonDetalles.getHeight());
        request.setAttribute("peso", pokemonDetalles.getWeight());
        request.setAttribute("tipos", pokemonDetalles.getTypes());
        request.setAttribute("estadisticas", pokemonDetalles.getStats());
        request.setAttribute("habilidades", pokemonDetalles.getAbilities());

        request.getRequestDispatcher("/WEB-INF/pages/detallePokemon.jsp").forward(request, response);
    }

}

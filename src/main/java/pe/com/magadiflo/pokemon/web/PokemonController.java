package pe.com.magadiflo.pokemon.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.magadiflo.pokemon.domain.Pokemon;
import pe.com.magadiflo.pokemon.service.PokemonService;
import pe.com.magadiflo.pokemon.service.PokemonServiceImpl;

@WebServlet("/pokemon-lista")
public class PokemonController extends HttpServlet {

    private PokemonService pokemonService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Recibimos el offset del parámetro (valor a partir del cual se mostrará los registros)
        int offset = this.getOffset(request);

        //Inyectamos el servicio
        this.pokemonService = new PokemonServiceImpl();
        this.pokemonService.obtenerDatosPokemones(offset, 20);

        //Obtenemos el listado de pokemones
        List<Pokemon> listaPokemones = this.pokemonService.getListarPokemones();
        Integer offsetAnterior = this.pokemonService.getOffsetAnterior();
        Integer offsetSiguiente = this.pokemonService.getOffsetSiguiente();
    
        //Compartimos variables a la vista
        request.setAttribute("listadoPokemones", listaPokemones);
        request.setAttribute("offsetAnterior", offsetAnterior);
        request.setAttribute("offsetSiguiente", offsetSiguiente);

        request.getRequestDispatcher("/WEB-INF/pages/listadoPokemones.jsp").forward(request, response);
    }

    //Tratamiento al parámetro offset enviado por url
    private int getOffset(HttpServletRequest request) {
        try {
            String offset = request.getParameter("offset");
            return (offset == null || offset.trim().equals("")) ? 0 : Math.abs(Integer.parseInt(offset));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}

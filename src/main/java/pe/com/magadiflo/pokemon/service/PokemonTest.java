package pe.com.magadiflo.pokemon.service;

public class PokemonTest {

    public static void main(String[] args) {

//        PokemonService pokemonService = new PokemonServiceImpl();
//        pokemonService.obtenerDatosPokemones(880, 20);
//        pokemonService.getListarPokemones().forEach(System.out::println);
//        System.out.println("next: " + pokemonService.getUrlSiguiente());
        String cad = "https://pokeapi.co/api/v2/pokemon-species?offset=0&limit=20";
        
        if(cad.contains("offset")){
            System.out.println("Sí contiene el offset");
        }
        
        if(cad.contains("&limit")){
            System.out.println("Sí contiene el &limit");
        }
//        int i = cad.indexOf("&limit");
        int iOffset = cad.indexOf("offset") + 7;
        int iiLimit = cad.indexOf("&limit");
        int res = iiLimit - iOffset;
        String n = cad.substring(iOffset, iiLimit);
        
        System.out.println("iOffset: " + iOffset);
        System.out.println("iiLimit: " + iiLimit);
        System.out.println("Número: " + n);

    }

}

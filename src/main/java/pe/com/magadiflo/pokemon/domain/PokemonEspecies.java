package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonEspecies {

    private CadenaEvolucionUrl evolution_chain;

    public PokemonEspecies() {

    }

    public CadenaEvolucionUrl getEvolution_chain() {
        return evolution_chain;
    }

    public void setEvolution_chain(CadenaEvolucionUrl evolution_chain) {
        this.evolution_chain = evolution_chain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PokemonEspecies{evolution_chain=").append(evolution_chain);
        sb.append('}');
        return sb.toString();
    }

}

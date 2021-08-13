package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evolucion {

    private Especie species;
    private List<Evolucion> evolves_to;

    public Evolucion() {

    }

    public Especie getSpecies() {
        return species;
    }

    public void setSpecies(Especie species) {
        this.species = species;
    }

    public List<Evolucion> getEvolves_to() {
        return evolves_to;
    }

    public void setEvolves_to(List<Evolucion> evolves_to) {
        this.evolves_to = evolves_to;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cadena{species=").append(species);
        sb.append(", evolves_to=").append(evolves_to);
        sb.append('}');
        return sb.toString();
    }

}

package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetalles {

    private int id;
    private String name;
    private int height;
    private int weight;
    private List<Tipos> types;
    private List<Estadisticas> stats;
    private List<Habilidades> abilities;

    public PokemonDetalles() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Tipos> getTypes() {
        return types;
    }

    public void setTypes(List<Tipos> types) {
        this.types = types;
    }

    public List<Estadisticas> getStats() {
        return stats;
    }

    public void setStats(List<Estadisticas> stats) {
        this.stats = stats;
    }

    public List<Habilidades> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Habilidades> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PokemonDetalles{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }    

}

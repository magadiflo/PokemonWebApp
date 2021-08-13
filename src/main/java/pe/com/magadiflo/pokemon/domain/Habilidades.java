package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Habilidades {

    private Habilidad ability;

    public Habilidades() {

    }

    public Habilidad getAbility() {
        return ability;
    }

    public void setAbility(Habilidad ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habilidades{ability=").append(ability);
        sb.append('}');
        return sb.toString();
    }

}

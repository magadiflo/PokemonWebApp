package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estadisticas {

    private Estadistica stat;

    public Estadisticas() {

    }

    public Estadistica getStat() {
        return stat;
    }

    public void setStat(Estadistica stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estadisticas{stat=").append(stat);
        sb.append('}');
        return sb.toString();
    }

}

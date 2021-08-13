package pe.com.magadiflo.pokemon.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cadena {

    private Evolucion chain;

    public Cadena() {

    }

    public Evolucion getChain() {
        return chain;
    }

    public void setChain(Evolucion chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cadena{chain=").append(chain);
        sb.append('}');
        return sb.toString();
    }

}

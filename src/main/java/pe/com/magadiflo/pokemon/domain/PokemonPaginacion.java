package pe.com.magadiflo.pokemon.domain;

import java.util.List;

public class PokemonPaginacion {

    private int count;
    private String next;
    private String previous;
    private List<Pokemon> results;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return this.next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return this.previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults() {
        return this.results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
package pe.com.magadiflo.pokemon.domain;

public class Tipo {

    private String name;
    private String url;
    
    public Tipo(){
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo{name=").append(name);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }

}

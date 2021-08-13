package pe.com.magadiflo.pokemon.domain;

public class CadenaEvolucionUrl {

    private String url;

    public CadenaEvolucionUrl() {

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
        sb.append("CadenaEvolucionUrl{url=").append(url);
        sb.append('}');
        return sb.toString();
    }

}

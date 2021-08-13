package pe.com.magadiflo.pokemon.domain;

public class Pokemon {

    private Integer number;
    private String name;
    private String url;

    public Pokemon() {

    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        String urlArray[] = url.split("/");
        this.number = Integer.parseInt(urlArray[urlArray.length - 1]);
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon{number=").append(this.number);
        sb.append(", name=").append(this.name);
        sb.append(", url=").append(this.url);
        sb.append('}');
        return sb.toString();
    }

}

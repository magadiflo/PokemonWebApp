package pe.com.magadiflo.pokemon.domain;

public class Tipos {

    private int slot;
    private Tipo type;
    
    public Tipos(){
    
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Tipo getType() {
        return type;
    }

    public void setType(Tipo type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipos{slot=").append(slot);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}

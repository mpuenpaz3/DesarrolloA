package liquidos;
/**
 *
 * @author Marcos Puente
 */
public abstract class Liquido {
    protected Double litros;
    protected String color;

    public Liquido(Double litros, String color) {
        if(litros>1 || litros<0){
            this.litros=0.0;
        }else{
        this.litros = litros;
        }
        this.color = color;
    }

    public void incrementar(Double litros){
        this.litros+=litros;
    }
    public abstract Liquido mezclar(Liquido litros)throws NoSePuedeMezclarException;

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        if(litros>1 || litros<0){
            this.litros=0.0;
        }else{
        this.litros = litros;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } 
}

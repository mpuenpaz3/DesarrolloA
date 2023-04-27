package liquidos;
/**
 *
 * @author Marcos Puente
 */
public class Agua extends Liquido{
    
    private Double pureza;
    
    public Agua(Double litros) {
        super(litros,"incoloro");
        this.pureza=1.0;
    }

    @Override
    public Liquido mezclar(Liquido litros) {
        
       Double litrosM = this.litros+litros.getLitros();
       String colorM = this.color+"-"+litros.getColor();
       Double purezaM = this.litros/litrosM;
       if(litros instanceof Lejia){
           purezaM = 1.0;
       }
       Agua nuevo = new Agua(litrosM);
       nuevo.setColor(colorM);
       nuevo.setPureza(purezaM);
       return nuevo;        
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
    
}

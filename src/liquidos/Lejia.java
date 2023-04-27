package liquidos;
/**
 *
 * @author Marcos Puente
 */
public class Lejia extends Liquido{
    private Double pureza;

    public Lejia(Double litros) {
        super(litros,"incoloro");
        this.pureza=1.0;
    }

    @Override
    public Liquido mezclar(Liquido litros) {
       //se mezcla los litros,color y se calcula la pureza
       Double litrosM = this.litros+litros.getLitros();
       String colorM = this.color+"-"+litros.getColor();
       Double purezaM = this.litros/litrosM;
       
       if(litros instanceof Agua){
           purezaM = 1.0;
       }
       Lejia nuevo = new Lejia(litrosM);
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

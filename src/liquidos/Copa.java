package liquidos;
/**
 *
 * @author Marcos Puente
 */
public class Copa extends Liquido implements Graduable{
    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable alcohol,Liquido mezcla){
        super(mezcla.getLitros(),mezcla.getColor());
        Liquido nuevo = (Liquido)alcohol;
        Double litrosTotales=nuevo.getLitros()+mezcla.getLitros();
        String color = nuevo.getColor()+mezcla.getColor();
        super.color=color;
        super.litros=litrosTotales;

    }

    @Override
    public Liquido mezclar(Liquido litros) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    @Override
    public Double getGrados() {
        Liquido nuevo = (Liquido)alcohol;
        return this.alcohol.getGrados()*nuevo.getLitros()/nuevo.getLitros()+mezcla.getLitros();           
    }
}

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

    }

    @Override
    public Liquido mezclar(Liquido litros) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    @Override
    public Double getGrados() {
        Liquido nuevo = (Liquido)alcohol;
        if(nuevo instanceof Ron){
            Ron nuevo2 = (Ron)alcohol;
            return nuevo2.getGrados()*nuevo2.getLitros()/nuevo2.getLitros()+mezcla.getLitros();
        }else if(nuevo instanceof Vodka){
            Vodka nuevo3 = (Vodka)alcohol;
            return nuevo3.getGrados()*nuevo3.getLitros()/nuevo3.getLitros()+mezcla.getLitros();
        }
        return 0.0;
    }
}

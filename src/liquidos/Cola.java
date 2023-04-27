package liquidos;
/**
 *
 * @author Marcos Puente
 */
public class Cola extends Liquido {
    
    private boolean cafeina;

    public Cola(Double litros, String color,boolean cafeina){
        super(litros, color);
        this.cafeina= cafeina;
    }

    @Override
    public Liquido mezclar(Liquido litros)throws NoSePuedeMezclarException{
        throw new NoSePuedeMezclarException();
    } 
}

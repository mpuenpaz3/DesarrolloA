package liquidos;
/**
 *
 * @author Marcos Puente
 */
public class Ron extends Liquido implements Graduable{
    private Double grados;

    /**
     *
     * @param grados si se introduce menos de 0 o mas de 1 grados se establece por defecto a 1.0
     */
    public Ron(Double litros,Double grados) {
        super(litros, "ambar");
        if(grados<0.0 || grados>1.0){
            this.grados = 1.0;
        }else{
        this.grados=grados;
        }
    }

    @Override
    public Liquido mezclar(Liquido litros)throws NoSePuedeMezclarException{
        if(litros instanceof Agua || litros instanceof Cola){
            Copa mezcla = new Copa(this, litros);
            return mezcla;
        }else{
            throw new NoSePuedeMezclarException();
        }
    }

    @Override
    public Double getGrados() {
        return this.grados;
    }
}

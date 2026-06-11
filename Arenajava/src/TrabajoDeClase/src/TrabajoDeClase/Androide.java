package TrabajoDeClase;

public class Androide extends Peleador {

    public Androide(String nombre) {
        super(nombre, 100);
    }

    @Override
    public void UsarHabilidad(Peleador atacante, Peleador objetivo) {
        System.out.println(" ! " + nombre + " ACTIVA: ¡SUPER ELECTRIC STRIKE!");
        int dañoFijo = 35;
        objetivo.recibirDaño(dañoFijo);
    }
}
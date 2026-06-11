package TrabajoDeClase;

public class Ninja extends Peleador {

    public Ninja(String nombre) {
        super(nombre, 95);
    }

    @Override
    public void UsarHabilidad(Peleador atacante, Peleador objetivo) {
        System.out.println(" ! " + nombre + " ACTIVA: ¡TÉCNICA OCULTA SHIRAI!");
        int daño = calcularAtaque() * 2;
        objetivo.recibirDaño(daño);
    }
}



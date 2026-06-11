package TrabajoDeClase;

public class Pokemon extends Peleador {

    public Pokemon(String nombre) {
        super(nombre, 100);
    }

    @Override
    public void UsarHabilidad(Peleador atacante, Peleador objetivo) {
        System.out.println(" ! " + nombre + " ACTIVA: ¡ATAQUE ELEMENTAL CRÍTICO!");
        int daño = calcularAtaque() + 15;
        objetivo.recibirDaño(daño);
    }
}



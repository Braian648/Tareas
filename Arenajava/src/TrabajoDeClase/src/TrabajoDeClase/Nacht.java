package TrabajoDeClase;

public class Nacht extends Peleador {

    public Nacht(String nombre) {
        super(nombre, 100);
    }

    @Override
    public void UsarHabilidad(Peleador atacante, Peleador objetivo) {
        System.out.println(" ! " + nombre + " ACTIVA: ¡PRISIÓN DE SOMBRAS!");
        int dañoRobo = 12;
        objetivo.recibirDaño(dañoRobo);
        
        this.vida = Math.min(this.vidaMaxima, this.vida + dañoRobo);
        System.out.println(" ! " + nombre + " absorbe las sombras y se cura " + dañoRobo + " puntos de vida.");
    }
}



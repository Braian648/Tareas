package TrabajoDeClase;

public class Ares extends Peleador {

    public Ares(String nombre) {
        super(nombre, 105);
    }

    @Override
    public void UsarHabilidad(Peleador atacante, Peleador objetivo) {
        System.out.println(" ! " + nombre + " ACTIVA: ¡SUPER GOLPE DOBLE DE GUERRA!");
        int dañoFijo = 15;
        objetivo.recibirDaño(dañoFijo);
        

        this.vida = Math.min(this.vidaMaxima, this.vida + 10);
        System.out.println(" ! " + nombre + " recupera fuerzas y se cura 10 puntos de vida.");
    }
}



package PrtoyectoDeClase;

public class Pokemon extends Personaje {

    public Pokemon(String nombre) {
        super(nombre, 100, 28, 12);
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (Math.random() < 0.25) {
            System.out.println(getNombre() + " ¡USA ATAQUE ELEMENTAL CRÍTICO!");
            enemigo.recibirDaño(40);
            System.out.println("¡Golpe de elemento directo de 40 puntos!\n");
        } else {
            super.atacar(enemigo);
        }
    }
}
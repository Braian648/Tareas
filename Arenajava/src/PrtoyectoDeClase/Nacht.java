package PrtoyectoDeClase;

public class Nacht extends Personaje {

    public Nacht(String nombre) {
        super("Nacht", 100, 28, 7);
    }

    
    public void atacar(Personaje enemigo){

        System.out.println();
        System.out.println(getNombre()
                + " invoca el poder de las sombras.");

        System.out.println("¡MODO DEMONIO ACTIVADO!");

        System.out.println("Un aura oscura envuelve el campo de batalla.");

        System.out.println("Nacht golpea al enemigo con energía demoníaca.");

        enemigo.recibirDaño(45);
    }
}
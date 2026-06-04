package PrtoyectoDeClase;

public class Arenajava {

    public static void main(String[] args) {
        
        Androide p1 = new Androide("17");
        Pokemon p2 = new Pokemon("Blaze");
        Ninja p3 = new Ninja("shirai");
        Ares p4 = new Ares("Ares");
        Nacht p5 = new Nacht("Nacht");

        Personaje jugador1 = null;
        Personaje jugador2 = null;

        System.out.println("CASTER: SORTEANDO LUCHADORES EN LA ARENA...");
        System.out.println();

        int dado1 = (int)(Math.random() * 5) + 1;
        
        if (dado1 == 1) { jugador1 = p1; }
        if (dado1 == 2) { jugador1 = p2; }
        if (dado1 == 3) { jugador1 = p3; }
        if (dado1 == 4) { jugador1 = p4; }
        if (dado1 == 5) { jugador1 = p5; }

        int dado2 = dado1;
        while (dado2 == dado1) {
            dado2 = (int)(Math.random() * 5) + 1; 
        }

        if (dado2 == 1) { jugador2 = p1; }
        if (dado2 == 2) { jugador2 = p2; }
        if (dado2 == 3) { jugador2 = p3; }
        if (dado2 == 4) { jugador2 = p4; }
        if (dado2 == 5) { jugador2 = p5; }

        System.out.println("¡CRUCE SELECCIONADO AL AZAR!");
        System.out.println(jugador1.getNombre() + " VS " + jugador2.getNombre());
        System.out.println();

        jugador1.mostrarEstado();
        jugador2.mostrarEstado();

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            
            System.out.println("--- TURNO DE " + jugador1.getNombre() + " ---");
            jugador1.atacar(jugador2);

            if (jugador2.estaVivo()) {
                System.out.println("--- TURNO DE " + jugador2.getNombre() + " ---");
                jugador2.atacar(jugador1);
            }

            jugador1.mostrarEstado();
            jugador2.mostrarEstado();
            System.out.println(); 
        }

        if (jugador1.estaVivo()) {
            System.out.println("EL GANADOR ES " + jugador1.getNombre() + " QUE BUENA PELEA");
        } else {
            System.out.println("EL GANADOR ES " + jugador2.getNombre() + " QUE IMPRESIONANTE PELEA");
        }
    }
}
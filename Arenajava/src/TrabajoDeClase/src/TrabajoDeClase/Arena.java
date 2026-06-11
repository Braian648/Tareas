package TrabajoDeClase;

import java.util.ArrayList;
import java.util.Random;

public class Arena {

    public static void main(String[] args) {
        
        Random random = new Random();
        ArrayList<Peleador> listaDeCasting = new ArrayList<>();

       
        listaDeCasting.add(new Androide("17"));
        listaDeCasting.add(new Pokemon("Blaze"));
        listaDeCasting.add(new Ninja("shirai"));
        listaDeCasting.add(new Ares("Ares"));
        listaDeCasting.add(new Nacht("Nacht"));
        
        int indice1 = random.nextInt(listaDeCasting.size());
        Peleador peleador1 = listaDeCasting.get(indice1);
        
        int indice2;
        do {
            indice2 = random.nextInt(listaDeCasting.size());
        } while (indice2 == indice1);
        
        Peleador peleador2 = listaDeCasting.get(indice2);
        
        System.out.println("==========================================");
        System.out.println("  ¡SORTEO COMPLETADO: DUELO ALEATORIO 1vs1! ");
        System.out.println("==========================================");
        System.out.println(" Luchador 1: " + peleador1.getNombre());
        System.out.println(" Luchador 2: " + peleador2.getNombre());
        System.out.println("==========================================");
        
        int ronda = 1;
        
        while (peleador1.estaVivo() && peleador2.estaVivo()) {
            System.out.println("--- RONDA " + ronda + " ---");
            
            System.out.println("Turno de " + peleador1.getNombre());
            ejecutarTurno(peleador1, peleador2, random);
            
            if(!peleador2.estaVivo()) {
                break;
            }
            
            System.out.println("Turno de " + peleador2.getNombre());
            ejecutarTurno(peleador2, peleador1, random);
            
            System.out.println("--------------------------------------------");
            ronda++;
            
            try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        System.out.println("==========================================");
        System.out.println("            ¡FIN DEL COMBATE!             ");
        System.out.println("==========================================");
        if (peleador1.estaVivo()) {
            System.out.println("EL " + peleador1.getNombre() + " ES EL GANADOR");
        } else { 
            System.out.println("EL " + peleador2.getNombre() + " ES EL GANADOR");
        }
        System.out.println("==========================================");
    }
    
    private static void ejecutarTurno(Peleador atacante, Peleador objetivo, Random random) {
        boolean usaHabilidad = random.nextBoolean(); 

        if (usaHabilidad) {
            atacante.UsarHabilidad(atacante, objetivo);
        } else {
            int atk = atacante.calcularAtaque();
            int def = objetivo.calcularDefensa();
            int danioFinal = atk - def;

            if (danioFinal < 0) danioFinal = 0;

            System.out.println("> Lanza un ataque normal.");
            System.out.println("> Daño generado: " + atk + " | Defensa rival: " + def + " | Daño final: " + danioFinal);
            objetivo.recibirDaño(danioFinal);
        }
    }
}
package PrtoyectoDeClase;

public class Ares extends Personaje {

   

	    public Ares(String nombre) {
	        super(nombre, 100, 30, 10);
	    }

	    @Override
	    public void atacar(Personaje enemigo) {
	        if (Math.random() < 0.40) {
	            enemigo.recibirDaño(10);
	            
	            int nuevaDefensa = enemigo.getDefensa() - 3;
	            if (nuevaDefensa < 0) {
	                nuevaDefensa = 0;
	            }
	            enemigo.setDefensa(nuevaDefensa);
	            
	            System.out.println(getNombre() + " ¡USA SUPER GOLPE DOBLE!");
	            System.out.println("¡Saca 10 puntos de vida directo y reduce la defensa de " + enemigo.getNombre() + " a " + nuevaDefensa + "!\n");
	        } else {
	            super.atacar(enemigo);
	        }
	    }
	}
   
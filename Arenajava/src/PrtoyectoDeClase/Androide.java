package PrtoyectoDeClase;

public class Androide extends Personaje {
	public Androide (String nombre, int vida, int daño, int defensa) {
		super(nombre, 100, 30, 15);
			
	}
	public void Super_Electric_Strike(Personaje enemigo) {
		System.out.println(getNombre() + " -- CASTER:  17 USA ¡¡SUPER ELECTRIC STRIKE!! CAUSANDO 50 DE DAÑO. ");
		enemigo.recibirDaño(50);
	} 
	
	
	
}

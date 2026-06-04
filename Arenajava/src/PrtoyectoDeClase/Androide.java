package PrtoyectoDeClase;

public class Androide extends Personaje {
	public Androide (String nombre) {
		super(nombre, 100, 30, 15);
			
	}
	
	public void atacar(Personaje enemigo) {
		if (Math.random() < 0.3) {
		
			enemigo.recibirDaño(50);
			System.out.println("USA SUPER ELECTRIC STRIKE SACANDO 50 PUNTOS DE VIDA");
		} else {
			super.atacar(enemigo);
		}
	}
}
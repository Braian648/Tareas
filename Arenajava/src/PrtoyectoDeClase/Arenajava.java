package PrtoyectoDeClase;

public class Arenajava {

	public static void main(String[] args) {
		Androide  jugador1 = new Androide ("17", 100, 25, 8);
		Personaje jugador2 = new Personaje("MAGO ROJO", 100, 22, 5);

		System.out.println("CASTER: COMIENZA LA BATALLA EN !!ARENA JAVA¡¡ LOS LUCHADORES SON");
		System.out.println();

		jugador1.mostrarEstado();
		jugador2.mostrarEstado();

		while (jugador1.estaVivo() && jugador2.estaVivo()) {
			double azar = Math.random();
			if (azar < 0.3) {
				jugador1.Super_Electric_Strike(jugador2);
			}else {
				jugador1.atacar(jugador2);
			}
			
			if(jugador2.estaVivo()) {
				jugador2.atacar(jugador1);
			}
			

		    jugador1.mostrarEstado();
		    jugador2.mostrarEstado();
		}

		if (jugador1.estaVivo()) {
		    System.out.println("EL GANADOR ES " + jugador1.getNombre() + " QUE BUENA PELEA");
		} else {
		    System.out.println("EL GANADOR ES" + jugador2.getNombre() + " QUE IMPRESIONANTE PELEA");
		}
	}

}

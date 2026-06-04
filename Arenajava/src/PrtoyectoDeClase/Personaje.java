package PrtoyectoDeClase;


	public class Personaje {
		private String nombre;
	    private int vida;
	    private int ataque;
	    private int defensa;

	    public Personaje(String nombre, int vida, int ataque, int defensa) {
	        this.nombre = nombre;
	        this.vida = vida;
	        this.ataque = ataque;
	        this.defensa = defensa;
	    }

	    public void atacar(Personaje enemigo) {
	        int suerte = (int)(Math.random() * 10) + 1;

	        if (suerte > 2) {
	            int ataqueRandom = 20 + (int)(Math.random() * 11);
	            int defensaRandom = 5 + (int)(Math.random() * 11);
	            int daño = ataqueRandom - defensaRandom;
	            if (daño < 0) { 
	                daño = 0; 
	            }

	            enemigo.recibirDaño(daño);
	            System.out.println(nombre + " ATACA CON " + ataqueRandom + " Y " + enemigo.getNombre() + " DEFIENDE CON " + defensaRandom);

	        } else {
	            System.out.println(nombre + " FALLO EL ATAQUE NORMAL");
	        }
	    
	    	 
	        int daño = ataque - enemigo.defensa;


	        if (daño < 0) {
	            daño = 0;
	        }

	    }

	    public void recibirDaño(int daño) {
	        vida = vida - daño;

	        if (vida < 0) {
	            vida = 0;
	        }
	    }

	    public void mostrarEstado() {
	    	
	        System.out.println("Nombre: " + nombre);
	        
	        System.out.println("Vida: " + vida);
	        System.out.println("------------------------------------");
	        
	    }
	    public boolean estaVivo() {
	    	return vida > 0;
	    }
	    public String getNombre() {
	    	return nombre;
	    }
	    public void setDefensa(int defensa) {
	        this.defensa = defensa;
	    }
	    public int getDefensa() {
	        return defensa;
	    }
	    
}
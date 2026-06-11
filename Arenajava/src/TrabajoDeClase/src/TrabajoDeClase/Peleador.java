package TrabajoDeClase;

import java.util.Random;

public abstract class Peleador implements HabilidadEspecial {
    
    public String nombre;
    protected int vida; 
    public int vidaMaxima;
    public Random random = new Random();
    
    public Peleador (String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
    }
        
    public int calcularAtaque() {
        return random.nextInt(16) + 5; 
    }
        
    public int calcularDefensa() {
        return random.nextInt(10) + 1; 
    }
        
    public void recibirDaño (int daño) {
        this.vida -= daño;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nombre + " ahora tiene " + this.vida + " de vida.");
        
        if (this.vida == 0) {
            System.out.println("¡¡ El peleador " + this.nombre + " ha caído en combate y no puede seguir luchando !!");
        }
    }
        
    public boolean estaVivo() {
        return this.vida > 0;
    }
    
    public String getNombre(){
        return nombre;
    }
}

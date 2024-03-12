// Se crea esta clase para no tener que definir las saludes del enemigo y del
// jugador en cada comportamiento de los guerreros, y asi no gastar espacio en 
// memoria.

package taller_juego_estrategia;

import java.util.Random;

public class Adversario {

    private int salud_jugador = 100;
    private int salud_enemigo = 100;

    Random random = new Random();

    public int getSalud_jugador() {
        return salud_jugador;
    }

    public void setSalud_jugador(int salud_jugador) {
        this.salud_jugador = salud_jugador;
    }

    public int getSalud_enemigo() {
        return salud_enemigo;
    }

    public void setSalud_enemigo(int salud_enemigo) {
        this.salud_enemigo = salud_enemigo;
    }

    public int puntajesAleatoreosJugador() {
        int randomNumber = random.nextInt(20);
        return randomNumber;
    }

    public int puntajesAleatoreosEnemigo() {
        int randomNumberE = random.nextInt(20);
        return randomNumberE;
    }

    public int puntajesDesicionCaballero() {
        // Genera un número aleatorio entre 0 y 1, luego se le suma 1 para obtener 1 o 2
        int valor = random.nextInt(2) + 1;
        return valor;
    }

    public int precisionArquero() {
        int valor = random.nextInt(19) + 1;
        return valor;
    }
}

package Comportamientos;

import interfaces.ComportamientoUnidadMilitar;
import taller_juego_estrategia.Adversario;

public class ComportamientoArqueros implements ComportamientoUnidadMilitar {

    Adversario salud = new Adversario();

    @Override
    public int ataque() {
        while (salud.getSalud_jugador() > 0 && salud.getSalud_enemigo() > 0) {
            System.out.println("Arquero atacando con sus flechas.. salud: " + salud.getSalud_jugador() + "%");
            salud.setSalud_enemigo(salud.getSalud_enemigo() - salud.puntajesAleatoreosJugador());
            
            if(salud.precisionArquero() < 10){
                System.out.println("Le haces un daño menor al enemigo");
                salud.setSalud_jugador(salud.getSalud_jugador() - salud.puntajesAleatoreosEnemigo()-5);
            }else{
                System.out.println("Le disparas las flechas cerca al corazon");
                salud.setSalud_jugador(salud.getSalud_jugador() - salud.puntajesAleatoreosEnemigo()+5);
            }
            
            
            // Utilizo el if para no imprimir valores negativos
            if (salud.getSalud_enemigo() > 0) {
                System.out.println("El enemigo también te está atacando... Nueva salud enemigo: " + salud.getSalud_enemigo() + "%");
            } else {
                salud.setSalud_enemigo(0);
                System.out.println("El enemigo también te está atacando... Nueva salud enemigo: " + salud.getSalud_enemigo() + "%");
            }

        }
        return salud.getSalud_enemigo();
    }

    @Override
    public void movimiento() {
        System.out.println("Arquero franqueando al enemigo...\n ");
        int resultado_ataque = ataque();

        if (resultado_ataque <= 0) {
            System.out.println("|------------------------------------------------|");
            System.out.println("|Felicidades ha ganado el juego con el arquero!!!|");
            System.out.println("|------------------------------------------------|");
        } else {
            System.out.println("|----------------------------------------------|");
            System.out.println("|Game Over: Perdiste el juego con el arquero!!!|");
            System.out.println("|----------------------------------------------|");
        }
    }

}

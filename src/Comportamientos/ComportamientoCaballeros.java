package Comportamientos;

import interfaces.ComportamientoUnidadMilitar;
import taller_juego_estrategia.Adversario;

public class ComportamientoCaballeros implements ComportamientoUnidadMilitar {

    Adversario salud = new Adversario();

    @Override
    public int ataque() {
        while (salud.getSalud_jugador() > 0 && salud.getSalud_enemigo() > 0) {
            System.out.println("Caballero atacando.. salud: " + salud.getSalud_jugador() + "%");
            salud.setSalud_enemigo(salud.getSalud_enemigo() - salud.puntajesAleatoreosJugador());
            salud.setSalud_jugador(salud.getSalud_jugador() - salud.puntajesAleatoreosEnemigo());
            
            if (salud.puntajesDesicionCaballero() == 1) {
                System.out.println("El caballero ha obtenido un super escudo");
                salud.setSalud_jugador(salud.getSalud_jugador() + 7);
            }else{
                System.out.println("El caballero ha quedado expuesto");
                salud.setSalud_jugador(salud.getSalud_jugador() - 5);
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
        System.out.println("Caballero moviendose rapidamente en su caballo...\n ");
        int resultado_ataque = ataque();

        if (resultado_ataque <= 0) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Felicidades ha ganado el juego con el caballero!!!|");
            System.out.println("|--------------------------------------------------|");
        } else {
            System.out.println("|------------------------------------------------|");
            System.out.println("|Game Over: Perdiste el juego con el caballero!!!|");
            System.out.println("|------------------------------------------------|");
        }
    }

}

package taller_juego_estrategia;

import Unidades_Militares.Arqueros;
import Unidades_Militares.Caballeros;
import Unidades_Militares.Soldados;
import abstracts.Unidad_militar;
import java.util.Scanner;

/*Supongamos que estás desarrollando un juego de
estrategia en el que los jugadores pueden elegir
entre diferentes tipos de unidades militares,
como soldados, arqueros y caballeros. Cada tipo
de unidad tiene diferentes comportamientos de
ataque y movimiento. Utiliza el patrón Strategy
para implementar estos comportamientos de manera
flexible*/
public class Taller_juego_estrategia {

    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);

        Unidad_militar soldado = new Soldados();
        Unidad_militar arquero = new Arqueros();
        Unidad_militar caballero = new Caballeros();

        System.out.println("Elija su jugador, para la batalla\nEscriba: 1 para Soldado\nEscriba: 2 para Arquero\n"
                + "Escriba: 3 para Caballero\nEscriba: 4 para mandar a todos los soldados a la batalla");
        System.out.print("Opcion: ");
        int opcion_soldado = entrada.nextInt();

        switch (opcion_soldado) {
            case 1:
                System.out.println("\n--Jugando con el soldado--\n");
                soldado.ataque();
                soldado.movimiento();
                break;
            case 2:
                System.out.println("\n--Jugando con el arquero--\n");
                arquero.ataque();
                arquero.movimiento();
                break;
            case 3:
                System.out.println("\n--Jugando con el caballero--\n");
                caballero.ataque();
                caballero.movimiento();
                break;
            case 4:
                System.out.println("\n--Jugando con el soldado--\n");
                soldado.ataque();
                soldado.movimiento();
                System.out.println("\n--Jugando con el arquero--\n");
                arquero.ataque();
                arquero.movimiento();
                System.out.println("\n--Jugando con el caballero--\n");
                caballero.ataque();
                caballero.movimiento();
                break;
            default:
        }

    }
}

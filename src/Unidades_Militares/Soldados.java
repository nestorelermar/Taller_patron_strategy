package Unidades_Militares;

import Comportamientos.ComportamientoSoldados;
import abstracts.Unidad_militar;

public class Soldados extends Unidad_militar{
    
    public Soldados(){
        comportamientoUnidad = new ComportamientoSoldados();
    }
}

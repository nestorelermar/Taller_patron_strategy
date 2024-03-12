package Unidades_Militares;

import Comportamientos.ComportamientoCaballeros;
import abstracts.Unidad_militar;

public class Caballeros extends Unidad_militar {
    
    public Caballeros(){
        comportamientoUnidad = new ComportamientoCaballeros();
    }
}

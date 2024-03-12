package Unidades_Militares;

import Comportamientos.ComportamientoArqueros;
import abstracts.Unidad_militar;

public class Arqueros extends Unidad_militar{
    
    public Arqueros(){
        comportamientoUnidad = new ComportamientoArqueros();
    }
}

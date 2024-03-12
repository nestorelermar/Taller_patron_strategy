package abstracts;

import interfaces.ComportamientoUnidadMilitar;

public class Unidad_militar {
    
    public ComportamientoUnidadMilitar comportamientoUnidad;

    public Unidad_militar(){
    }
    
    public void ataque(){        
        comportamientoUnidad.ataque();
    }
    
    public void movimiento(){
        comportamientoUnidad.movimiento();
    }
}

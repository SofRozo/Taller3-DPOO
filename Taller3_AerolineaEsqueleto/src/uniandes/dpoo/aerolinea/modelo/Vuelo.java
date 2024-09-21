package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

    private String fecha;

    //RELACIONES UNO A UNO (UN VUELO TIENE UNA RUTA Y UN AVION)

    private Ruta ruta;

    private Avion avion;

    //VUELO TIENE MUCHOS TIQUETES
    private  Map<String, Tiquete> tiquetes;





    public Vuelo(Ruta ruta, String fecha, Avion avion){
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
    }

    //Getters y setters
    public Ruta getRuta() {
        return ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public Avion getAvion() {
        return avion;
    }


    public Collection<Tiquete> getTiquetes(){
        return tiquetes.values();
    }

    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad){
        return cantidad;
        // Implementar cuando ya todo lo demás este listo
        
    }

    public boolean equals(Object obj){
         // Implementar cuando ya todo lo demás este listo
         return true;
    }

}

package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Vuelo {

    private String fecha;

    private Ruta ruta;

    private Avion avion;


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

    //TODO -> HACER LA RELACIÓN CON TIQUETES Y EL METODO

    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad){
        // Implementar cuando ya todo lo demás este listo
        
    }

    public boolean equals(Object obj){
         // Implementar cuando ya todo lo demás este listo
    }

}

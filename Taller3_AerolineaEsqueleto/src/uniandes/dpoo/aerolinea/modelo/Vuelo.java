package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
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

    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException {
        int capacidadMaxima = avion.getCapacidad();

        if (cantidad > capacidadMaxima || tiquetes.size() + cantidad > capacidadMaxima) {
            throw new VueloSobrevendidoException(this);
        }

        int valorTotal = 0;

        for (int i = 0; i < cantidad; i++) {
            int tarifaTiquete = calculadora.calcularTarifa(this, cliente);
            Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifaTiquete);
            GeneradorTiquetes.registrarTiquete(tiquete);
            String codigoTiquete = tiquete.getCodigo();
            tiquetes.put(codigoTiquete, tiquete);
            valorTotal += tarifaTiquete;
            cliente.agregarTiquete(tiquete);
        }

        return valorTotal;
    }

    public boolean equals(Object obj){
         // Implementar cuando ya todo lo demás este listo
        if(obj instanceof Vuelo){ // instanceof = .equals()
            Vuelo vuelo = (Vuelo) obj; // Convertir Object a Vuelo
            return vuelo.getFecha().equals(fecha) && vuelo.getRuta().equals(ruta);
        }
        return false;
    }

}

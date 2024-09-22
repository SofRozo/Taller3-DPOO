package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

    private List<Tiquete> tiquetes;
   

    public Cliente(){

        tiquetes = new ArrayList<>();

    }

    public abstract String getTipoCliente();

    public abstract String getIdentificador();

    public void agregarTiquete(Tiquete tiquete){

        tiquetes.add(tiquete);
    }


    public int calcularValorTotalTiquetes(){
        //Implementación para calcular la suma total
        int valorTotal = 0;
        for (Tiquete elemento : tiquetes  ){
            if (!elemento.esUsado())
                valorTotal += elemento.getTarifa();
        }

        return valorTotal;
    }

    public void usarTiquetes(Vuelo vuelo){
        // Implementación para usar tiquetes
        for (Tiquete tiquete : tiquetes){
            //.equals() te sirve para comparar dos Strings o dos Objetos
            if (tiquete.getVuelo().equals(vuelo)){
                tiquete.marcarComoUsado();
            }

        }
    }
}



package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete{

    private String codigo;
    private int tarifa;
    private boolean usado;

    private Cliente clienteComprador;
    private Vuelo vuelo;

   

    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa){
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifa = tarifa;
    }

    //Getter y setters
    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getTarifa() {
        return tarifa;
    }


    public void marcarComoUsado(){
        this.usado = true;
    }

    public boolean esUsado(){
        return usado;
    }



}

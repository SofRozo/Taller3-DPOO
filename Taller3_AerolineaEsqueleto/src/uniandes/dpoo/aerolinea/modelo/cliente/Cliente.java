package uniandes.dpoo.aerolinea.modelo.cliente;

public abstract class Cliente {

    public Cliente(){

    }

    public abstract String getTipoCliente();

    public abstract String getIdentificador();

    public void agregarTiquete(Tiquete tiquete){

        //Implementación para agregar un tiquete a un cliente.
    }

    public int calcularValorTotalTiquetes(){
        //Implementación para calcular la suma total
        return 0;
    }

    public void usarTiquetes(Vuelo vuelo){
        // Implementación para usar tiquetes
    }
}



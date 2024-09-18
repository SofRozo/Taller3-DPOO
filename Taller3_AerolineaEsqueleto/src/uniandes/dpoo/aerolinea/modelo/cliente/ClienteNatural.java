package uniandes.dpoo.aerolinea.modelo.cliente;


//Cliente Natural es un TIPO de Cliente y con extends, reciben las características
//De la clase padre
public class ClienteNatural extends Cliente {

    public static final String NATURAL = "Natural";
    
    private String nombre;

    // Constructor
    public ClienteNatural(String nombre){
        this.nombre = nombre;
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos de la clase padre

    @Override
    public String getTipoCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoCliente'");
    }

    @Override
    public String getIdentificador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdentificador'");
    }

    
}

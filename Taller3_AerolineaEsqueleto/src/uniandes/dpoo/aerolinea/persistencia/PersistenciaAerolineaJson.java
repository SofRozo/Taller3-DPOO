package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
    public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws InformacionInconsistenteException, IOException {
        File file = new File(archivo);
        if (file.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                aerolinea = (Aerolinea) ois.readObject();
                ois.close();
            } catch (ClassNotFoundException e) {
                throw new InformacionInconsistenteException("Error: Información inconsistente al cargar la aerolínea.");
            }
        } else {
            // El archivo NO existe: es la primera vez que se ejecuta el programa
            aerolinea = new Aerolinea(); // Crea una nueva aerolínea
        }
    }

    public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(aerolinea);
        oos.close();
    }

}

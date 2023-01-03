/*
 * 
 */
package sistemainventarios;

/**
 * @author AYALA
 * @author DIAZ
 * @author VELANDIA
 */
public class Localizacion {
    private String Nombre;
    private String Direccion;

    public Localizacion(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}

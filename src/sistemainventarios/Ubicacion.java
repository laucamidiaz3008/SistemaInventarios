/*
 * Ubicación: una clase para representar una ubicación física donde se almacenan los elementos, 
 * con campos para propiedades como el nombre, la dirección y la capacidad. 
 * Esta clase también incluyen métodos para obtener y configurar estas propiedades, 
 * así como cualquier otro método relacionado con las ubicaciones 
 * (por ejemplo, calcular la utilización de la ubicación en función de la cantidad de elementos almacenados allí).
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class Ubicacion {
    private String nombre;
    private String pasillo;
    private String estante;
    private String nivel;

    public Ubicacion(String nombre, String pasillo, String estante, String nivel) {
        this.nombre = nombre;
        this.pasillo = pasillo;
        this.estante = estante;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPasillo() {
        return pasillo;
    }
    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }
    public String getEstante() {
        return estante;
    }
    public void setEstante(String estante) {
        this.estante = estante;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "nombre=" + nombre + ", pasillo=" + pasillo + ", estante=" + estante + ", nivel=" + nivel + '}';
    }
}

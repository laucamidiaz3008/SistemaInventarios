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
    private String direccion;
    private int capacidad;
    private int cantidad;

    public Ubicacion(String nombre, String direccion, int capacidad, int cantidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double calcularUtilizacion(){
        return (cantidad*100)/capacidad;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Dirección: "+direccion);
        System.out.println("Capacidad: "+capacidad);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Utilización: "+calcularUtilizacion()+"%");
    }
    
    public void ingresar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la ubicación: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la dirección de la ubicación: ");
        direccion = sc.nextLine();
        System.out.println("Ingrese la capacidad de la ubicación: ");
        capacidad = sc.nextInt();
        System.out.println("Ingrese la cantidad de artículos en la ubicación: ");
        cantidad = sc.nextInt();
    }
}

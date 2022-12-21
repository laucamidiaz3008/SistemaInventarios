/*
 * Artículo: una clase para representar un artículo individual en el inventario, 
 * con campos para propiedades como nombre, código, cantidad y precio. 
 * Esta clase también incluye métodos para obtener y establecer estas propiedades, 
 * así como cualquier otro método relacionado con artículos individuales 
 * (por ejemplo, calcular el valor del artículo en función de su precio y cantidad).
 * Crear artículo
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class Articulo {
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;

    public Articulo(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularValor(){
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}

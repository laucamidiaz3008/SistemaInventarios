/*
 * Transacción: una clase para representar una transacción que involucra artículos en el inventario, 
 * con campos para propiedades como fecha, tipo (por ejemplo, compra, venta, transferencia) y artículos involucrados. 
 * Esta clase también incluye métodos para obtener y establecer estas propiedades, 
 * así como cualquier otro método relacionado con las transacciones 
 * (por ejemplo, calcular el valor total de la transacción).
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class Transaccion {
    private String fecha;
    private String tipo;
    private Articulo articulo;

    public Transaccion(String fecha, String tipo, Articulo articulo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.articulo = articulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    public double calcularValor(){
        return articulo.getCantidad()*articulo.getPrecio();
    }
}

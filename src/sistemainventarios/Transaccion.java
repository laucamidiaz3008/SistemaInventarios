/*
 * Transacción: una clase para representar una transacción que involucra artículos en el inventario, 
 * con campos para propiedades como fecha, vendedor, artículos vendidos, costo total y tipo de transacción.
 */
package sistemainventarios;
import java.util.Scanner;
import java.util.Date;


/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class Transaccion {
    private Date fecha;
    private String vendedor;
    private String articulosVendidos;
    private double costoTotal;
    private String tipoTransaccion;

    public Transaccion(String fecha2, String vendedor, String articulosVendidos, double costoTotal, double valorTotal) {
        this.fecha = fecha2;
        this.vendedor = vendedor;
        this.articulosVendidos = articulosVendidos;
        this.costoTotal = costoTotal;
        this.tipoTransaccion = valorTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getArticulosVendidos() {
        return articulosVendidos;
    }

    public void setArticulosVendidos(String articulosVendidos) {
        this.articulosVendidos = articulosVendidos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "fecha=" + fecha + ", vendedor=" + vendedor + ", articulosVendidos=" + articulosVendidos + ", costoTotal=" + costoTotal + ", tipoTransaccion=" + tipoTransaccion + '}';
    }
}

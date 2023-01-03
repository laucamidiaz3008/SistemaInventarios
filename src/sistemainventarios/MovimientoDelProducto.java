/*
 * Clase MovimientoDelProducto:
 * 1. Referencia a los movimientos del producto
 * 2. Referencia a la localizacion del producto
 * 3. Referencia a la cantidad del producto
 * 4. Referencia a la fecha del movimiento
 */
package sistemainventarios;

/**
 * @author AYALA
 * @author DIAZ
 * @author VELANDIA
 */
public class MovimientoDelProducto {
    private Producto Productos;
    private Localizacion Loc;
    private int Cantidad;
    private String Fecha;

    public MovimientoDelProducto(Producto Productos, Localizacion Loc, int Cantidad, String Fecha) {
        this.Productos = Productos;
        this.Loc = Loc;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
    }

    public Producto getProductos() {
        return Productos;
    }

    public void setProductos(Producto Productos) {
        this.Productos = Productos;
    }

    public Localizacion getLoc() {
        return Loc;
    }

    public void setLoc(Localizacion Loc) {
        this.Loc = Loc;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}

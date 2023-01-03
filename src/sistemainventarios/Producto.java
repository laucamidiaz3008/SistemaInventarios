/*
 * Clase Producto:
 * 1. Referencia al nombre del producto
 * 2. Referencia a la descripcion del producto
 * 3. Referencia al precio del producto
 * 4. Referencia al costo de produccion del producto
 * 5. Referencia a la cantidad del producto
 * 
 */
package sistemainventarios;

/**
 * @author AYALA
 * @author DIAZ
 * @author VELANDIA
 */
public class Producto {
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private double CostoDeProduccion;

    public Producto(String Nombre, String Descripcion, double Precio,double CostoDeProduccion ) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.CostoDeProduccion = CostoDeProduccion;
    }

    public double getCostoDeProduccion() {
        return CostoDeProduccion;
    }

    public void setCostoDeProduccion(double CostoDeProduccion) {
        this.CostoDeProduccion = CostoDeProduccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
  public void imprimir()
  {
      System.out.println("El nombre del producto es "+Nombre);
      System.out.println("La descripcion del producto es "+Descripcion);
      System.out.println("El precio del producto es "+Precio);
      System.out.println("El costo de la produccion del producto es "+CostoDeProduccion);
  }
  
  
}

/*
 * Inventario: una clase para representar el inventario general, con una lista o colección de objetos Articulo. 
 * Esta clase incluye métodos para agregar, eliminar y actualizar artículos en el inventario, 
 * así como métodos para buscar artículos y generar informes sobre el inventario.
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class Inventario {
    private Articulo[] articulos;
    private int cantidadArticulos;
    private int maxArticulos;
    private Scanner sc = new Scanner(System.in);
    
    public Inventario(int maxArticulos) {
        this.maxArticulos = maxArticulos;
        this.articulos = new Articulo[maxArticulos];
        this.cantidadArticulos = 0;
    }
    
    public void agregarArticulo(Articulo articulo){
        if(cantidadArticulos < maxArticulos){
            articulos[cantidadArticulos] = articulo;
            cantidadArticulos++;
        }else{
            System.out.println("No hay espacio para agregar más artículos");
        }
    }
    
    public void eliminarArticulo(String codigo){
        int posicion = buscarArticulo(codigo);
        if(posicion != -1){
            for(int i = posicion; i < cantidadArticulos - 1; i++){
                articulos[i] = articulos[i + 1];
            }
            cantidadArticulos--;
        }else{
            System.out.println("No se encontró el artículo");
        }
    }
    
    public void actualizarArticulo(String codigo){
        int posicion = buscarArticulo(codigo);
        if(posicion != -1){
            System.out.println("Ingrese el nuevo nombre del artículo");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la nueva cantidad del artículo");
            int cantidad = sc.nextInt();
            System.out.println("Ingrese el nuevo precio del artículo");
            double precio = sc.nextDouble();
            articulos[posicion].setNombre(nombre);
            articulos[posicion].setCantidad(cantidad);
            articulos[posicion].setPrecio(precio);
        }else{
            System.out.println("No se encontró el artículo");
        }
    }
    
    public int buscarArticulo(String codigo){
        for(int i = 0; i < cantidadArticulos; i++){
            if(articulos[i].getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
    
    public void generarReporte(){
        System.out.println("Nombre\t\tCódigo\t\tCantidad\t\tPrecio");
        for(int i = 0; i < cantidadArticulos; i++){
            System.out.println(articulos[i].getNombre() + "\t\t" + articulos[i].getCodigo() + "\t\t" + articulos[i].getCantidad() + "\t
}

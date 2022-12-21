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
    private Scanner sc = new Scanner(System.in);

    public Inventario(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }

    public void agregarArticulo(Articulo articulo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] == null) {
                articulos[i] = articulo;
                break;
            }
        }
    }

    public void eliminarArticulo(String codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {
                articulos[i] = null;
                break;
            }
        }
    }

    public void actualizarArticulo(String codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {
                System.out.println("Ingrese el nuevo nombre del artículo: ");
                articulos[i].setNombre(sc.nextLine());
                System.out.println("Ingrese la nueva cantidad del artículo: ");
                articulos[i].setCantidad(sc.nextInt());
                System.out.println("Ingrese el nuevo precio del artículo: ");
                articulos[i].setPrecio(sc.nextDouble());
                break;
            }
        }
    }

    public void buscarArticulo(String codigo) {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {
                System.out.println("Nombre: " + articulos[i].getNombre());
                System.out.println("Cantidad: " + articulos[i].getCantidad());
                System.out.println("Precio: " + articulos[i].getPrecio());
                break;
            }
        }
    }

    public void generarReporte() {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null) {
                System.out.println("Nombre: " + articulos[i].getNombre());
                System.out.println("Código: " + articulos[i].getCodigo());
                System.out.println("Cantidad: " + articulos[i].getCantidad());
                System.out.println("Precio: " + articulos[i].getPrecio());
                System.out.println("Valor: " + articulos[i].getCantidad() * articulos[i].getPrecio());
            }
        }
    }

    public void mostrarArticulos() {
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null) {
                System.out.println("Nombre: " + articulos[i].getNombre());
                System.out.println("Código: " + articulos[i].getCodigo());
                System.out.println("Cantidad: " + articulos[i].getCantidad());
                System.out.println("Precio: " + articulos[i].getPrecio());
            }
        }
    }

}
    
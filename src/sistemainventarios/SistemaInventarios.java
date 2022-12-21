/*
 * 
 */
package sistemainventarios;
import java.util.Scanner;

/**
 *
 * @author Camila Díaz - Alejandro Velandia - Daniel Ayala
 */
public class SistemaInventarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Ingresar Articulo");
            System.out.println("2. Ingresar Transaccion");
            System.out.println("3. Mostrar Articulos");
            System.out.println("4. Mostrar Transacciones");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del articulo: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el codigo del articulo: ");
                    String codigo = sc.next();
                    System.out.println("Ingrese la cantidad del articulo: ");
                    int cantidad = sc.nextInt();
                    System.out.println("Ingrese el precio del articulo: ");
                    double precio = sc.nextDouble();
                    Articulo articulo = new Articulo(nombre, codigo, cantidad, precio);
                    break;
                case 2:
                    System.out.println("Ingrese la fecha de la transaccion: ");
                    String fecha = sc.next();
                    System.out.println("Ingrese el vendedor de la transaccion: ");
                    String vendedor = sc.next();
                    System.out.println("Ingrese los articulos vendidos: ");
                    String articulosVendidos = sc.next();
                    System.out.println("Ingrese el costo total de la transaccion: ");
                    double costoTotal = sc.nextDouble();
                    System.out.println("Ingrese el valor total de la transaccion: ");
                    double valorTotal = sc.nextDouble();
                    Transaccion transaccion = new Transaccion(fecha, vendedor, articulosVendidos, costoTotal, valorTotal);
                    break;
                case 3:
                    System.out.println("Articulos");
                    break;
                case 4:
                    System.out.println("Transacciones");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;

}}
        while(opcion != 5);
    }
    
}
